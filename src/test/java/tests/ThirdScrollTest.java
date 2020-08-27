package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;
import pageObjects.WelcomePage;

public class ThirdScrollTest extends TestBase {
	WebDriver driver;
	MainScreen mainScreen;
WelcomePage welcomePage;
	@Test
	  public void Rozetka1() throws InterruptedException {
		 welcomePage=new WelcomePage(driver);
		mainScreen = new MainScreen(driver);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		welcomePage.ScrollDown();
		Thread.sleep(2000);
		welcomePage.ScrollUp();
	}
	 @BeforeTest
	  
	  public void beforeTest2() {
		  
		  driver=chromeWebDriver();
	}
	}