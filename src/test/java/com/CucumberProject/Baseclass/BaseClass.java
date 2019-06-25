package com.CucumberProject.Baseclass;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;	
	
	public WebDriver getDriver() {
		//kill driver
//Runtime rt = Runtime.getRuntime();
//Process proc = rt.exec("taskkill /im chrome.exe /f /t");
			
System.setProperty("webdriver.chrome.driver", "D:\\Savithri\\New_FundsIndia\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
return driver;
	}
	public static void launch(String url) {
    driver.get(url);
	}
	public static void type(WebElement ele, String name) {
		ele.sendKeys(name);
	}
		public static void click(WebElement ele) {
		ele.click();
	}
			public static void close() {
			driver.close();
			driver.quit();
		}
	public static void dropdown(WebElement ele, int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public static int generateRandomInt(int upperRange){
	    Random random = new Random();
	    return random.nextInt(upperRange);
	}
	public static void dropdown(WebElement ele, String name) {
		Select s=new Select(ele);
		s.selectByValue(name);	 
	} 
	  
}


