package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;
import pageObjects.ProductsPage;

public class CheckBoxesTest extends TestBase {
	
	WebDriver driver;
	MainScreen mainScreen;
	ProductsPage productsPage;
	/*
	protected By checkboxR=By.xpath("//*[@type='checkbox']");
	List<WebElement> checkboxes=driver.findElements(checkbox);
	*/
	
	@Test
	public void checkBoxesTest() {
		
		
		mainScreen = new MainScreen(driver);
	    productsPage = new ProductsPage(driver);
		productsPage.MainSearchInput.click();
		productsPage.MainSearchInput.sendKeys("Компьютеры");
		productsPage.SearchButton.click();
		driver.findElement(By.cssSelector(".catalog-grid__cell:nth-child(1) .goods-tile__title")).click();
		driver.findElement(By.cssSelector(".additional-services__item:nth-child(2) .additional-service__heading")).click();
		
		Select dropDown = new Select (driver.findElement(By.cssSelector(".additional-services__item:nth-child(2) .select-css")));
		dropDown.selectByVisibleText("Продление гарантии на 2 года (20001-25000)");
	}
	
@BeforeTest
public void beforeTest5() {
	driver=chromeWebDriver();
}
}
