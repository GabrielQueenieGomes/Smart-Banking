package com.test.run2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreProduct {
	public void getProduct() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		PageObjectModel pom = new PageObjectModel();
		driver.navigate().to(pom.getAppLink());
		
		List<WebElement> productName = driver.findElements(By.xpath(pom.getProductName()));
		System.out.println("Product count = " + productName.size());
		System.out.println("2nd Product = " + productName.get(1).getText());
		
		for(int i = 0; i < productName.size(); i++) {
			System.out.println(productName.get(i).getText());
		}
		
		List<Integer> allPrices = new ArrayList<>();
		List<WebElement> productPrice = driver.findElements(By.xpath(pom.getProductPrice()));
		System.out.println("Price count = " + productPrice.size());
		System.out.println("2nd Price = " + productPrice.get(1).getText());
		
		for(int i = 0; i < productPrice.size(); i++) {
			System.out.println(productPrice.get(i).getText());
			allPrices.add(Integer.parseInt(productPrice.get(i).getText().replace("$", "")));
		}
		
		Collections.sort(allPrices);
		System.out.println("All prices = " + allPrices);
		int max =  allPrices.get(0);
		int secondMax =  allPrices.get(0);
		int thirdMax =  allPrices.get(0);
		int fourthMax =  allPrices.get(0);
		
		for(int i = 0; i < allPrices.size(); i++) {
			System.out.println("Price Name = " + allPrices.get(i));
			
			if(allPrices.get(i) > max) {
				fourthMax = thirdMax;
				thirdMax = secondMax;
				secondMax = max;
				max = allPrices.get(i);
			}
			
		}
		
		System.out.println("Max = " + max);
		System.out.println("2nd max = " + secondMax);
		System.out.println("3rd max = " + thirdMax);
		System.out.println("4th max = " + fourthMax);
		
		Collections.reverse(allPrices);
		int min =  allPrices.get(0);
		int secondMin =  allPrices.get(0);
		int thirdMin =  allPrices.get(0);
		
		for(int i = 0; i < allPrices.size(); i++) {
			System.out.println("Price Name = " + allPrices.get(i));
			
			if(allPrices.get(i) < min) {
				thirdMin = secondMin;
				secondMin = min;
				min = allPrices.get(i);
			}
			
		}

		System.out.println("Min = " + min);
		System.out.println("2nd min = " + secondMin);
		System.out.println("3rd min = " + thirdMin);
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreProduct obj = new StoreProduct();
		obj.getProduct();	
		
	}
}
