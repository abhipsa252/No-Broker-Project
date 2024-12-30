package com.nobroker.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features", glue= {"com.nobroker.stepDefinition"})

public class JUnitRunner {

}

