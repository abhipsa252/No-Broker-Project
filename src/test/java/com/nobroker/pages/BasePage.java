package com.nobroker.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nobroker.parameters.ExcelReader;

public class BasePage {

	static WebDriver driver;	 
	ExcelReader ER;
	
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
		ER=new ExcelReader();
	}

    // Method to wait for an element to be visible for a specified amount of time
	public void waitMethod(int time, WebElement ele) {
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(time));
		wb.until(ExpectedConditions.visibilityOf(ele));
	}
}
