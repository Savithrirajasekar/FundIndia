package com.CucumberProject.StepDefinition;

import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CucumberProject.ObjectRepository.objectrepository;

import cucumber.api.Argument;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration extends objectrepository{
	WebDriver driv=getDriver();
	objectrepository browser =new objectrepository();
	
	@When("Select on Funds Field")
	public void select_on_Funds_Field() {
		//click(browser.getFunds());
		 	}

	@When("Enter the INVESTMENT Sections")
	public void enter_the_INVESTMENT_Sections() {
		// type(browser.getInvestAmount(), "2000");
		 //dropdown		
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //Select s=new Select(driver.findElement(By.xpath("//select[@name='sipdateweb']")));
		 //s.selectByIndex(2);
		 //click(browser.getValidcheckbox());
		 // type(browser.getSipduration(), "25");
		  //click(browser.getCheckbox());
		 // click(browser.getProceed2());
	}

	@When("Fill the Additional Information")
	public void fill_the_Additional_Information()  {
	    type(browser.getAincome(), "30000");
	    type(browser.getFathername(), "xxxxxx");
	    type(browser.getMotherName(), "yyyyy");
	    //dropdown  //click(browser.getOccupation());
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	  Select s1=new Select(driver.findElement(By.name("occupation")));
		  s1.selectByIndex(1);
	     type(browser.getStrAddressLine1(), "234efergreg");
	     //dropdown //click(browser.getLocation());
	     Select s3=new Select(driver.findElement(By.name("location")));
   		 s3.selectByValue("C6");
	     //dropdown //click(browser.getState());
   		 Select s4=new Select(driver.findElement(By.name("strStateID")));
   		 s4.selectByValue("TN");
	     type(browser.getStrPincode(), "607000");
	     click(browser.getCB());
	     click(browser.getCB2());
	     click(browser.getCB3());
	     click(browser.getCB4());
		 click(browser.getAddinfoproceed());

	}

	@When("need to link the bank account")
	public void need_to_link_the_bank_account() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   type(browser.getIfsc(), "CNRB0001760");
	type(browser.getAccountnum(), "1234567891025");
	Thread.sleep(500);	
	click(browser.getAccholder());
	//WebElement e=driver.findElement(By.xpath("//input[@type='radio'])[1]"));
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollIntiView();", e);
	click(browser.getCB5());
	click(browser.getLinkverify());
	click(browser.getUploadcheque());

	}

	@Then("Click Continue to approve")
	public void click_Continue_to_approve() {
	click(browser.getVerify());
	click(browser.getContinue());
	}

	@Then("Choose Skip & Continue")
	public void choose_Skip_Continue() {
	    click(browser.getSkip());
	}

	@Then("Registration Successfully done")
	public void registration_Successfully_done() {
		type(browser.getConfirmationpage(), "confirmation");
		}
}	