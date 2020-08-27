package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;

public class SecondTest extends TestBase {
	
	WebDriver driver;
	MainScreen mainScreen;
	String url= "https://rozetka.com.ua/";
	
	
		
		
	
     @Test
public void rozetka2() {
    	 driver.get(url);
    	 mainScreen = new MainScreen(driver);
    	 mainScreen.TelArrow.click();
    	 String actualResult = driver.findElement(By.cssSelector(".modal__heading")).getText();
    	 String expectedResult="Контактные телефоны";
    	 AssertJUnit.assertEquals(actualResult, expectedResult);
    			 
    	 
    	 
	}   	 
     
     @BeforeTest
     public void beforeTest1 () {
   	  
   	  driver=chromeWebDriver();
   	  
   }
     @AfterTest
 	public void closeBrowser() {
    	 //driver.close();
 		  
 	}
}
