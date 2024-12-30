package com.nobroker.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resource/features",glue= {"com.nobroker.stepDefinition"},
//tags="@UI_Test"//for running only tag1
plugin= {"pretty", // Designing the reports
		"html:reports/cucumber_report.html", // BDD Report
		"json:target/myjson.json", // Json report
		"junit:target/Cucumber.xml",// BDD report in XML format
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//Extent report)
)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
