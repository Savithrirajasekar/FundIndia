package com.CucumberProject.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.security.acl.Owner;
import java.util.concurrent.TimeUnit;


import org.apache.commons.math3.exception.MathIllegalNumberException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.CucumberProject.ObjectRepository.objectrepository;

import cucumber.api.cli.Main;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Link_Account_SixthPage extends objectrepository{
	objectrepository browser =Singleton();
	//String filepath="C:\\Users\\Yoganadan\\Desktop\\FileUpload.jpg";
	@When("need to link the bank account with Individual Account Holder")
	public void need_to_link_the_bank_account_with_Individual_Account_Holder() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   type(browser.getIfsc(), "CNRB0001760");
			type(browser.getAccountnum(), "1234567891025");
			Thread.sleep(500);	
			click(browser.getAccholder());
	}

	@When("clcik on terms and condition")
	public void clcik_on_terms_and_condition() {
		click(browser.getCB5());
	
	}

	@Then("click the verify button")
	public void click_the_verify_button() throws IOException, AWTException {
		click(browser.getLinkverify());
		//click(browser.getUploadcheque());
		//Robot r=new Robot();
		WebElement ele=driver.findElement(By.className("btn btn-light btn-link-bank"));
		ele.sendKeys("C:\\Users\\Yoganadan\\Desktop\\FileUpload.jpg");
		String Expected=driver.findElement(By.className("btn btn-light btn-link-bank")).getAttribute("value");
		if(Expected.equalsIgnoreCase("FileUpload.jpg"))
		{
			System.out.println("File Uploaded Successfully");
		}
		//r.setAutoDelay(1000);
		//StringSelection ss=new StringSelection("C:\\Users\\Yoganadan\\Desktop\\FileUpload.jpg");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, Owner.null);
		//Runtime.getRuntime().exec("C:\\Users\\Yoganadan\\Desktop\\AutoIT\\FileUpload.exe)");
 	//	ele.sendKeys("C:\\Users\\Yoganadan\\Desktop\\FileUpload.rtf");
		
	}

}
