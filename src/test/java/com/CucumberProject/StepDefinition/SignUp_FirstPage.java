package com.CucumberProject.StepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.CucumberProject.ObjectRepository.objectrepository;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignUp_FirstPage extends objectrepository{
	WebDriver driv=getDriver();
    objectrepository browser =Singleton();
	@Given("Launch the Url")
	public void launch_the_Url() {
		launch("https://build.fundsindia.com/");
	}


	@When("Enter Customer Details")
	public void enter_Customer_Details() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int ran_int=generateRandomInt(2000);
		String ran=Integer.toString(ran_int);
		String Email_ID="sample"+ran+"@sample.com";
		String Name="Sample";
		type(browser.getName(),Name);
		type(browser.getMobilenumber(),"1234567890");
		type(browser.getEmailid(),Email_ID);
		type(browser.getPass(),"asdf1525$");
		click(browser.getAgreeterms());
	}

	@When("click on signUP")
	public void click_on_signUP() {
		click(browser.getSign());		
	}
}