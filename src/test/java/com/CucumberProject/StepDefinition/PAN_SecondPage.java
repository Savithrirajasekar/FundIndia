package com.CucumberProject.StepDefinition;
import java.util.NoSuchElementException;
import com.CucumberProject.StepDefinition.SignUp_FirstPage;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.iterators.SingletonIterator;
import org.openqa.selenium.WebDriver;

import com.CucumberProject.ObjectRepository.objectrepository;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PAN_SecondPage extends objectrepository{
	//WebDriver driv=getDriver();
	objectrepository browser=Singleton();
	@When("Enter the PAN Page Details")
	public void enter_the_PAN_Page_Details() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		type(browser.getPanNo(), "ONXPX9999x");
				     type(browser.getDob(), "15051982");
	}

	@When("Click on Proceed")
	public void click_on_Proceed() {
	    click(browser.getProceed());

	}
}
	