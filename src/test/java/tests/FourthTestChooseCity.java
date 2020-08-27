package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;

public class FourthTestChooseCity extends TestBase {
	WebDriver driver;
	MainScreen mainScreen;
	
	
	
	@Test
	  public void Rozetka4() {
		mainScreen = new MainScreen(driver);
		mainScreen.ChooseYourCity.click();
		//log.info("Click on a city page");
		mainScreen.AddYouCityField.click();
		//log.info("Click on a city input");
		mainScreen.AddYouCityField.clear();
		mainScreen.AddYouCityField.sendKeys("Лисичанск");
		driver.findElement(By.cssSelector(".header-location__autocomplete-city:nth-child(1)")).click();
		
		
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