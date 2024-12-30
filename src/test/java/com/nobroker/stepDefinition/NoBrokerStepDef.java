package com.nobroker.stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.nobroker.driversetup.DriverSetup;
import com.nobroker.pages.commpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoBrokerStepDef {
	static WebDriver driver;
	commpage cp;
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to launch the NoBroker website and initialize the page objects*/
	@Given("User is in the No Broker website")
	public void user_is_in_the_no_broker_website() throws Exception {
		DriverSetup setup=new DriverSetup();
		driver=setup.getDriver();
		cp=new commpage(driver);
	    
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to click on the Commercial button and validate its text*/
	@When("User clicks on the Commercial button")
	public void user_clicks_on_the_commercial_button() {
		String comm = driver.findElement(By.xpath("//div[text()=\"Commercial\"]")).getText();
	    assertEquals("Commercial",comm);
	    driver.findElement(By.xpath("//div[text()=\"Commercial\"]")).click();
	    
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the user is on the Commercial page*/
	@When("user is on the Commercial Page")
	public void user_is_on_the_commercial_page() {
		String compage = driver.findElement(By.xpath("//div[text()=\"Commercial\"]")).getText();
	    assertEquals("Commercial",compage);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the Location field is displayed*/
	@Then("User can see location field")
	public void user_can_see_location_field() {
		
	    assertTrue(driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")).isDisplayed());
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the Localities or Landmark field is displayed*/
	@Then("User can see localities or landmark field")
	public void user_can_see_localities_or_landmark_field() {
	    assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Search upto 3 localities or landmarks\"]")).isDisplayed());
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the Rent button is visible*/
	@Then("User can see Rent button")
	public void user_can_see_rent_button() {
		String rb = driver.findElement(By.xpath("//label[@for=\"COMMERCIAL_RENT\"]")).getText();
	    assertEquals("Rent",rb);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the Buy button is visible*/
	@Then("User can see Buy button")
	public void user_can_see_buy_button() {
		String bb = driver.findElement(By.xpath("//label[@for=\"COMMERCIAL_BUY\"]")).getText();
	    assertEquals("Buy",bb);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the Search button is visible*/
	@Then("User can see search button")
	public void user_can_see_search_button() {
		String btn = driver.findElement(By.xpath("//button[@class=\"prop-search-button flex items-center justify-center btn btn-primary btn-lg\"]")).getText();
	    assertEquals("Search",btn);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify that the "Post Free Property Ad" button is visible*/
	@Then("User can see post free property ad")
	public void user_can_see_post_free_property_ad() {
		String add = driver.findElement(By.xpath("//button[text()='Post Free Property Ad']")).getText();
	    assertEquals("Post Free Property Ad",add);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to click on the dropdown button in the Commercial page*/
	@When("User enter dropdown button")
	public void user_enter_dropdown_button() {
	    cp.dropdown();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select a location from the dropdown*/
	@When("User enter location")
	public void user_enter_location() {
	    cp.location();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to enter three localities from the provided DataTable*/
	@When("User enter any three locality")
	public void user_enter_any_three_localities(DataTable table) throws InterruptedException {
		List<String> list=table.asList();
	    cp.landmark();
	    cp.enter(list.get(0));
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select the Rent option*/
	@When("User select rent option")
	public void user_select_rent_option() {
	    cp.rent();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select the Property type dropdown*/
	@When("User enters property type")
	public void user_enters_property_type() {
	    cp.propertydd();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select one property from the dropdown*/
	@When("user select any one property")
	public void user_select_any_one_property() throws InterruptedException {
	    cp.propertyc();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to click the search button*/
	@When("User enter search button")
	public void user_enter_search_button() {
	    cp.search();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify if the user is navigated to the next page*/
	@Then("User navigate to next page")
	public void user_navigate_to_next_page() {
	    String nt = driver.findElement(By.xpath("//div[text()='Commercial-Rent']")).getText();
	    assertEquals("Commercial-Rent",nt);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select the Metro option*/
	@When("User select metro option")
	public void user_select_metro_option() throws InterruptedException {
	    cp.metro();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select the Metro line*/
	@When("User select metro line")
	public void user_select_metro_line() throws InterruptedException {
	    cp.metroline();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to select the Metro station*/
	@When("User select metro station")
	public void user_select_metro_station() throws InterruptedException {
	   cp.metrostation();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to click the metro search button*/
	@When("User select search button")
	public void user_select_search_button() throws InterruptedException {
	    cp.mssearch();
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify if the user is navigated to the Maps page*/
	@Then("User navigate to maps page")
	public void user_navigate_to_maps_page() {
		String map = driver.findElement(By.xpath("//div[@class=\"flex text-12 font-semibold items-center justify-center\" and text()=\"Map\"]")).getText();
	    assertEquals("Map",map);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to verify if the user did not navigate to the next page*/
	@Then("User will not navigate to next page")
	public void user_will_not_navigate_to_next_page() {
		String nn = driver.findElement(By.xpath("//div[@class=\"nb__wN4jP\"]")).getText();
	    assertEquals("World's Largest NoBrokerage Property Site",nn);
	}
	
	/* Created by: Abhipsa Dash
	 * Reviewed by: SME Name
	 * Step definition to enter three localities directly as a string (passed parameter)*/
	@When("User enter any three localities {string}")
	public void user_enter_any_three_localities(String string) throws InterruptedException {
	    cp.landmark();
		cp.enter(string);
	}
	
	// Step definition to capture a screenshot after each step and attach it to the report
	@AfterStep
	public static void screenShot(Scenario scenario) {
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
	}

	// After each scenario, close the browser
	@After
	  public void tearDown() {
		  driver.quit();
    }

}


 
