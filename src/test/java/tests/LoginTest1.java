package tests;

import org.testng.annotations.Test;


import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;
import pageObjects.Helpers;

public class LoginTest1 extends TestBase {
	WebDriver driver;
	MainScreen mainScreen;
	
  @Test
  @Parameters({"userName","password"})
  public void loginTest(String userName,String password) throws InterruptedException, IOException {
	  mainScreen = new MainScreen(driver);
	  
	  mainScreen.EnterToYourCabinetButton.click();
	  mainScreen.AddYourEmailField.click();
	  log.info("Click on a city page");
	  mainScreen.AddYourEmailField.sendKeys(userName);
	 mainScreen.AddYourPassField.sendKeys(password);
	log.info("Click on a city input");
	  mainScreen.EnterInYourAccButton.click();
	  Thread.sleep(6000);	 
	  String actualName = driver.findElement(By.xpath("//*[@class='header-topline__user-link link-dashed']")).getText();
	  String expectedName = "Serg92";
	  Assert.assertEquals(actualName, expectedName);
	  
	  //скриншот
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("screenshots/111.png"));
	//
	
	  Actions action = new Actions(driver);
	  WebElement element=driver.findElement(By.cssSelector(".header-topline__user-link"));
	  //клик правой кнопкой мыши
	  //action.contextClick(element).perform();
	  //навести курсор мыши
	  action.moveToElement(element).perform();
	  driver.findElement(By.cssSelector(".header-dropdown__list-item:nth-child(12) > a")).click();
	  Thread.sleep(3000);
	 driver.navigate().back();
	
  }
  @BeforeTest
  public void beforeTest1 () {
	  initLogger(this.getClass());
	  driver=chromeWebDriver();
	  
}
  /*
  @AfterTest
  public void checkStatus(ITestResult test) throws IOException{
	  if(test.getStatus()==ITestResult.FAILURE){
		  //SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
	  //Helpers.takeScreenShot(driver,test.getName()); 
		  
		  Helpers.takeScreenshot(driver,test.getName());
		  driver.close();
	  }
	  */
  }

		 
	

