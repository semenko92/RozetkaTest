package BasePage;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	protected static Logger log;
public static WebDriver chromeWebDriver() {
	String OpenURL="https://rozetka.com.ua/";
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	ChromeOptions options=new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get(OpenURL);
	return driver;
}
public void initLogger(Class className) {
	log=LogManager.getLogger(className);
}



}
	


	
