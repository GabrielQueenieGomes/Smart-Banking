package com.account.info;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.page.object.model.PageObjectModel;

public class AccountPage implements Account {
	WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void goToAccountPage() {
    	PageObjectModel pom = new PageObjectModel();
    	driver.findElement(By.xpath(pom.getAppURL())).click();
        // Example locator: update as needed
        driver.findElement(By.xpath("//*[text()='Account']")).click();
    }

    @Override
    public void getAccountTableData() {

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        System.out.println("Row count = " + rows.size());
        System.out.println("Column count = " + columns.size());

        System.out.println("First cell value = " + columns.get(0).getText());

        // Optional: print entire table
        System.out.println("---- Full Table Data ----");
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }

    @Override
    public void printRowCount() {
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Row count = " + rows.size());
    }

    @Override
    public void printColumnCount() {
        List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Column count = " + columns.size());
    }

    @Override
    public void printFirstCellValue() {
        WebElement firstCell = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
        System.out.println("First cell value = " + firstCell.getText());
    }
}
