package com.nobroker.driversetup;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.nobroker.parameters.ParameterReader;

public class DriverSetup {
	 
	WebDriver driver;
	static int input;
	static {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 to open edge");
		System.err.println("2 to open chrome");
		
		input=sc.nextInt();
	}
 
	public WebDriver getDriver() throws IOException {
		
		ParameterReader cfs = new ParameterReader();
 
		// calling the edge driver
		if (input == 1) {
			System.setProperty(cfs.getEdgeDriverName(), cfs.getEdgeDriverPath());
			driver = (WebDriver) new EdgeDriver();
		}
		// calling the chrome driver
		else {
			System.setProperty(cfs.getDriverName(), cfs.getDriverPath());
			driver = (WebDriver) new ChromeDriver();
		}
 
		driver.get(cfs.getMainUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
		return driver;
	}
}
 
