package com.test.run2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreProduct {
	public void getProduct() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.demoblaze.com/");
		
		List<WebElement> productName = driver.findElements(By.xpath("//*[@class='card-block']//h4"));
		
		for(int i = 0; i<productName.size(); i++) {
			System.out.println(productName.get(i).getText());
		}
		
		List<WebElement> productPrice = driver.findElements(By.xpath("//*[@class='card-block']//h5"));
		
		for(int i =0; i<productPrice.size(); i++) {
			System.out.println(productPrice.get(i).getText());
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreProduct obj = new StoreProduct();
		obj.getProduct();
		
		
	}
}
