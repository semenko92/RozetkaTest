package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BasePage.TestBase;
import pageObjects.MainScreen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends TestBase {
	WebDriver driver;
	MainScreen mainScreen;
	String url= "https://rozetka.com.ua/";
	
	public static WebDriver chromeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		//убираем Timed out receiving message from renderer: 0.100 из теста (консоли)
		
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// обязательно добавить options в скобки chromeDriver
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return driver;
	}
	
  @Test
  public void Rozetka1() {
	  driver.get(url);
	mainScreen = new MainScreen(driver);
	//WebDriverWait wait=new WebDriverWait(driver,5);
	 //wait.until(ExpectedConditions.presenceOfElementLocated(mainScreen.SellOnRozetkaButton));
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 //js.executeScript("window.scrollTo(document.body.scrollHeight,0");
	 //wait.until(ExpectedConditions.presenceOfElementLocated(mainScreen.SellOnRozetkaButton));
	//mainScreen.CatalogButton.click();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//mainScreen.LaptopAndComputersButton.click();
	
  }
  @BeforeTest
  
  public void beforeTest1 () {
	  
	  driver=chromeWebDriver();
}
}