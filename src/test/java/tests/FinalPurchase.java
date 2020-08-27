package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.BasketPage;
import pageObjects.MainScreen;
import pageObjects.WelcomePage;

public class FinalPurchase extends TestBase {
	WebDriver driver;
	MainScreen mainScreen; 
	BasketPage basketPage;
	WelcomePage welcomePage;
	
	@Test
	  @Parameters({"userName","password","surName","telephone"})
	  public void PurchaseTest(String userName,String password,String surName,String telephone) throws InterruptedException, IOException {
		welcomePage=new WelcomePage(driver); 
		mainScreen = new MainScreen(driver);
		  basketPage=new BasketPage(driver);
		  log.info("1.Click on a LoginButton");
		  mainScreen.EnterToYourCabinetButton.click();
		  log.info("2.AddEmail and Password");
		  mainScreen.AddYourEmailField.click();
		  
		  mainScreen.AddYourEmailField.sendKeys(userName);
		 mainScreen.AddYourPassField.sendKeys(password);
		log.info("3.Enter to your AccButton");
		  mainScreen.EnterInYourAccButton.click();
		  log.info("4.Check UserName");
		  Thread.sleep(6000);	 
		  String actualName = driver.findElement(By.xpath("//*[@class='header-topline__user-link link-dashed']")).getText();
		  String expectedName = "Serg92";
		  Assert.assertEquals(actualName, expectedName);
		  
		  Actions action = new Actions(driver);
		  WebElement element=driver.findElement(By.cssSelector(".header-topline__user-link"));
		  //клик правой кнопкой мыши
		  //action.contextClick(element).perform();
		  //навести курсор мыши
		  action.moveToElement(element).perform();
		  WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-dropdown__list-item:nth-child(4) > a")));
			log.info("5.Click on a111");
		  driver.findElement(By.cssSelector(".header-dropdown__list-item:nth-child(4) > a")).click();
		 log.info("6.jifhisfuh");
		  welcomePage.ScrollDown();
		  log.info("7.jfififuh");
		  Thread.sleep(4000);
		  welcomePage.ScrollDown();
		  driver.findElement(By.xpath("//*[@id='popup-checkout']")).click();

		  WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".checkout-heading")));
		 
		  
		  String actualresult=driver.findElement(By.cssSelector(".checkout-heading")).getText();
		  Assert.assertEquals(actualresult, "Оформление заказа");
		  
		  basketPage.AddYourSurNameField.sendKeys(surName);
		  basketPage.AddYourTelephoneField.sendKeys(telephone);
		  
		 welcomePage.ScrollDown();
		
		  

}
	@BeforeTest
	public void beforeTest1 () {
		initLogger(this.getClass());
		  driver=chromeWebDriver();
	}
}