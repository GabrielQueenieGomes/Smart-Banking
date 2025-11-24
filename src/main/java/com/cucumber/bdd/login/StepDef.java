package com.cucumber.bdd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	// shortcut import = ctrl + shift + O
	
	WebDriver driver;
	
	@Given("open chrome")
	public void open_chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("go to app link")
	public void go_to_app_link() {
		driver.get("file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
	}

	@When("enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch44");
	}

	@When("enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@value='Login']")).click();
	}

	@Then("login should pass and there should be logout button visible")
	public void login_should_pass_and_there_should_be_logout_button_visible() {
		Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
		System.out.println("Log out button there or not = " + status);

	driver.quit();
	}

	@When("enter invalid username")
	public void enter_invalid_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sarower");
	}

	@When("enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sarower21312@");
	}

	@Then("login fails and no logout button")
	public void login_fails_and_no_logout_button() {
		try {
			Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
			System.out.println("Log out button there or not = " + status);
		} catch (Exception e) {
			
		}
	    driver.quit();
	}
}
