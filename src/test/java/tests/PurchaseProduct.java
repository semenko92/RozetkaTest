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
import pageObjects.MainScreen;
import pageObjects.WelcomePage;

public class PurchaseProduct extends TestBase {
	WebDriver driver;
	MainScreen mainScreen;
	WelcomePage weclomePage;

	
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
			  mainScreen.BasketButton.click();
			 
			  WebDriverWait wait2 = new WebDriverWait(driver, 10);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart-product__title")));
		      
		      /*
			  JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollTo(0, 6000)");
				 */
				 
				   WebElement Elmnt = driver.findElement(By.cssSelector(".cart-service__variants-item:nth-child(4) .cart-service__title"));
                   Actions actions = new Actions(driver);
                   actions.moveToElement(Elmnt);
                   actions.perform();
                   driver.findElement(By.cssSelector(".simple-slider__item:nth-child(1) .buy-button")).click();
                   WebDriverWait wait3 = new WebDriverWait(driver, 10);
   				wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".simple-slider__item:nth-child(1) .buy-button")));
                   driver.findElement(By.cssSelector(".simple-slider__item:nth-child(1) .buy-button")).click();
				  
	}

@BeforeTest
public void beforeTest1 () {
	initLogger(this.getClass());
	  driver=chromeWebDriver();
	  
}
}