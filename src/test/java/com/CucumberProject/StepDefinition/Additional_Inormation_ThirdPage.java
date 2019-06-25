package com.CucumberProject.StepDefinition;

import java.util.concurrent.TimeUnit;

import com.CucumberProject.ObjectRepository.objectrepository;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Additional_Inormation_ThirdPage extends objectrepository{
	objectrepository browser=Singleton();
	@When("Fill the additional information without Nominee Details")
	public void fill_the_additional_information_without_Nominee_Details() {
		type(browser.getAincome(), "30000");
	    type(browser.getFathername(), "xxxxxx");
	    type(browser.getMotherName(), "yyyyy");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    dropdown(browser.getOccupation(),1);
	     type(browser.getStrAddressLine1(), "234efergreg");
	     //Drop Down
	     dropdown(browser.getLocation(),"C6");
	     dropdown(browser.getState(),"TN");
   		 type(browser.getStrPincode(), "607000");
	     click(browser.getCB());
	     click(browser.getCB2());
	     click(browser.getCB3());
	     click(browser.getCB4());
	}

	@Then("Click on Proceed button")
	public void click_on_Proceed_button() {
		click(browser.getAddinfoproceed());
	}

}
