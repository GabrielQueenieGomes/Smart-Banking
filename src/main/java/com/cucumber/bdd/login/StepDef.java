package com.cucumber.bdd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.account.info.AccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef implements Login {
	// shortcut import = ctrl + shift + O
	
	WebDriver driver;
	
	@Override
	@Given("open chrome")
	public void openChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Override
	@Given("go to app link")
	public void goToAppLink() {
		driver.get("file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
	}

	@Override
	@When("enter valid username")
	public void enterValidUsername() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch44");
	}

	@Override
	@When("enter valid password")
	public void enterValidPassword() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	}

	@Override
	@When("click login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//*[@value='Login']")).click();
	}

	@Override
	@Then("login should pass and there should be logout button visible")
	public void loginShouldPass() {
		Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
		System.out.println("Log out button there or not = " + status);

	}

	@Override
	@Then("user views bank account information")
	public void user_views_bank_account_information() {
	    AccountPage account = new AccountPage(driver);

	    account.goToAccountPage();
	    account.getAccountTableData();
	}
	
	@Override
	@When("enter invalid username")
	public void enterInvalidUsername() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sarower");
	}

	@Override
	@When("enter invalid password")
	public void enterInvalidPassword() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sarower21312@");
	}

	@Override
	@Then("login fails and no logout button")
	public void loginShouldFail() {
		try {
			Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
			System.out.println("Log out button there or not = " + status);
		} catch (Exception e) {
			
		}
	    driver.quit();
	}
}
