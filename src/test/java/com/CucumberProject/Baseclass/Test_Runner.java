package com.CucumberProject.Baseclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",tags= {"@Third_Page"},monochrome  = true, dryRun = false, glue="com.CucumberProject.StepDefinition", plugin="html:target")
public class Test_Runner {
	
	}
