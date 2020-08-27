package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.TestBase;

public class WelcomePage extends TestBase {
	private WebDriver driver;
	
	
	public WelcomePage(WebDriver driver){
		this.driver=driver;
	 }
public void ScrollDown() {
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0, 1000)");
	 
 }
public void ScrollUp() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(6000, 0)");
}
}

