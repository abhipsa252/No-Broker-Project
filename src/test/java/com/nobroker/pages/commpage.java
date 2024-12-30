package com.nobroker.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class commpage extends BasePage{

	WebDriver driver;
	Actions act;
	Robot robo;

	// Constructor initializing WebDriver, Actions, and Robot
	public commpage(WebDriver driver) throws Exception  {
		super(driver);
		act = new Actions(driver);
		robo = new Robot();
	}

	@FindBy(xpath = "//div[text()=\"Commercial\"]")
	private WebElement commorcial;
	
	// Method to click on the "Commercial" tab
	public void comm() {
		commorcial.click();
	}

	// WebElement for the dropdown button
	@FindBy(xpath = "//div[@aria-hidden=\"true\"][1]")
	private WebElement dd;
	// Method to click on the dropdown
	public void dropdown() {
		dd.click();
	}

	@FindBy(xpath = "//div[text()='Bangalore']")
	private WebElement loc;
	// Method to select "Bangalore" as the location
	public void location() {
		loc.click();
	}

	@FindBy(xpath = "//input[@id=\"listPageSearchLocality\"]")
	private WebElement clandmark;
	// Method to click on the landmark input field
	public void landmark() {
		clandmark.click();
	}

	// Method to enter a value into the landmark input field (reads data from an Excel file)
	public void enter(String string) throws InterruptedException {
		
		// If the input string is "SortBy.xlsx", load the data from the Excel file
		if(string.equals("SortBy.xlsx")) {
			ER.input(string, 0);
			clandmark.sendKeys(ER.sheet1.getRow(0).getCell(0).getStringCellValue());
		}
		else {
			// If the input string contains coordinates, extract them and enter the corresponding data from the Excel file
			String[] s = string.split("");

			int r = Integer.parseInt(s[0]);
			int c = Integer.parseInt(s[1]);

			ER.input("SortBy.xlsx", 0);
			clandmark.sendKeys(ER.sheet1.getRow(r).getCell(c).getStringCellValue());
		}
		
		Thread.sleep(3000);
		// Perform keyboard actions: move down and press Enter
		act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}

	@FindBy(xpath = "//label[@for=\"COMMERCIAL_RENT\"]")
	private WebElement clickrent;
	// Method to click on the "Rent" option
	public void rent() {
		clickrent.click();
	}

	@FindBy(xpath = "//label[@for=\"COMMERCIAL_BUY\"]")
	private WebElement clickbuy;
	// Method to click on the "Buy" option
	public void buy() {
		clickbuy.click();
	}

	@FindBy(xpath = "//div[@class=\"nb-select__placeholder\"]")
	private WebElement clickpdd;
	// Method to click on the property dropdown
	public void propertydd() {
		clickpdd.click();

	}

	@FindBy(xpath = "//div[text()='Office Space']")
	private WebElement clickpddc;
	// Method to select "Office Space" from the property dropdown
	public void propertyc() throws InterruptedException {
		Thread.sleep(2000);
		act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

	}

	@FindBy(xpath = "//img[@alt=\"searchIcon\"]")
	private WebElement clicksearch;
	// Method to click on the search icon
	public void search() {
		clicksearch.click();
	}

	@FindBy(xpath = "//span[text()='Metro']")
	private WebElement clickmetro;
	// Method to click on the "Metro" option
	public void metro() throws InterruptedException {
		clickmetro.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//div[text()='Purple Line']")
	private WebElement clickmetroln;
	// Method to select the "Purple Line" metro line
	public void metroline() throws InterruptedException {
		clickmetroln.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//span[text()='Whitefield (Kadugodi)']")
	private WebElement clickmetrost;
	// Method to select the metro station (Whitefield - Kadugodi)
	public void metrostation() throws InterruptedException {
		clickmetrost.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//span[text()='Whitefield (Kadugodi)']")
	private WebElement metsearch;
	// Method to select the metro search result
	public void mssearch() throws InterruptedException {
		metsearch.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]")
	private WebElement clciksb;
	// Method to sort the results using the "Sort By" dropdown
	public void sortby() throws InterruptedException {
		// Use Robot to simulate mouse movements and clicks for the "Sort By" dropdown
		robo.mouseMove(1205, 350);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		// Move the mouse to a specific position for the sorting option
		robo.mouseMove(470, 417);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		// Click on the "Sort By" option and select the sorting preference
		clciksb.click();
		Thread.sleep(2000);
		act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//div[text()='Rent(Low to High)']")
	private WebElement clickop;
	// Method to click on the "Rent (Low to High)" option in the dropdown
	public void dropDown() throws InterruptedException {
		Thread.sleep(2000);
		clickop.click();
		Thread.sleep(2000);
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}

}
