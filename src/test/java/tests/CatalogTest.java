package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;
import pageObjects.WelcomePage;

public class CatalogTest extends TestBase {
	
	WebDriver driver;
	MainScreen mainScreen;
	WelcomePage welcomePage;
	@Test
	public void catalogTest() throws InterruptedException {
		mainScreen=new MainScreen(driver);
		welcomePage=new WelcomePage(driver);
		mainScreen.CatalogButton.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
			wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".menu-categories__item:nth-child(1) .menu__main-brand:nth-child(5) img")));
			driver.findElement(By.cssSelector(".menu-categories__item:nth-child(1) .menu__main-brand:nth-child(5) img")).click();
			Thread.sleep(3000);
			
			WebDriverWait wait4 = new WebDriverWait(driver, 100);
			wait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select-css")));
			Select dropDown = new Select (driver.findElement(By.cssSelector(".select-css")));
			dropDown.selectByVisibleText("От дешевых к дорогим");
			
			welcomePage.ScrollDown();
			Thread.sleep(1000);
			WebDriverWait wait5 = new WebDriverWait(driver, 10);
			wait5.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".slider-filter__input:nth-child(1)")));
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(1)")).click();
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(1)")).clear();
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(1)")).sendKeys("100");
			Thread.sleep(1000);
			/*
			String actualResult=driver.findElement(By.cssSelector(".slider-filter__input:nth-child(1)")).getText();
			String expectedResult="100";
			Assert.assertEquals(actualResult,expectedResult);
			*/
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(3)")).click();
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(3)")).clear();
			driver.findElement(By.cssSelector(".slider-filter__input:nth-child(3)")).sendKeys("100000");
			driver.findElement(By.cssSelector(".slider-filter__button")).click();
			
	}
	
	
	@BeforeTest
	public void beforeTest3 () {
		  
		  driver=chromeWebDriver();
	}
	

}
