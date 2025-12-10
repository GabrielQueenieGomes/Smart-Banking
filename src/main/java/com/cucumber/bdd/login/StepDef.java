package com.cucumber.bdd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.account.info.AccountPage;
import com.page.object.model.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef implements Login {
	// shortcut import = ctrl + shift + O
	
	WebDriver driver;
	PageObjectModel page;
	
	@Override
	@Given("open chrome")
	public void openChrome() {
		page = new PageObjectModel();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Override
	@Given("go to app link")
	public void goToAppLink() {
		driver.findElement(By.xpath(page.getAppURL())).click();
	}

	@Override
	@When("enter valid username")
	public void enterValidUsername() {
		driver.findElement(By.xpath(page.getUserLoct()))
        .sendKeys(page.getUserValue());
	}

	@Override
	@When("enter valid password")
	public void enterValidPassword() {
		driver.findElement(By.id(page.getPassLoct()))
        .sendKeys(page.getPassValue());
	}

	@Override
	@When("click login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath(page.getLoginLoct())).click();
	}

	@Override
	@Then("login should pass and there should be logout button visible")
	public void loginShouldPass() {
		boolean status =
                driver.findElement(By.id(page.getLogoutLoct())).isDisplayed();

        System.out.println("Log out button visible = " + status);
	}

	@Override
	@Then("user views bank account information")
	public void user_views_bank_account_information() {
		AccountPage account = new AccountPage(driver);
        account.goToAccountPage();
        account.getAccountTableData();

        driver.quit();
	}
	
	@Override
	@When("enter invalid username")
	public void enterInvalidUsername() {
		driver.findElement(By.xpath(page.getUserLoct()))
        .sendKeys(page.getWrongUser());
	}

	@Override
	@When("enter invalid password")
	public void enterInvalidPassword() {
		driver.findElement(By.xpath(page.getPassLoct()))
        .sendKeys(page.getWrongPass());
	}

	@Override
	@Then("login fails and no logout button")
	public void loginShouldFail() {
		try {
            driver.findElement(By.xpath(page.getLogoutLoct())).isDisplayed();
            System.out.println("Logout shown (unexpected).");
        } catch (Exception e) {
            System.out.println("Logout NOT shown (login failed as expected).");
        }
        driver.quit();
	}
}
