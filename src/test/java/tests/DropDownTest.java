package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.TestBase;
import pageObjects.MainScreen;
import pageObjects.ProductsPage;

public class DropDownTest extends TestBase {
WebDriver driver;
MainScreen mainScreen;
ProductsPage productsPage;


@Test
public void DropDownTest() {
	mainScreen = new MainScreen(driver);
    productsPage = new ProductsPage(driver);
	productsPage.MainSearchInput.click();
	productsPage.MainSearchInput.sendKeys("Компьютеры");
	productsPage.SearchButton.click();
	productsPage.CheckRozetkaBox.click();
	//Меняю значение в dropdown
	Select dropDown = new Select (driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > rz-category > div > main > ctg-catalog > div > div:nth-child(1) > div > ctg-sort > select")));
	dropDown.selectByVisibleText("От дешевых к дорогим");
	//dropDown.selectByIndex(1);
	
}
@BeforeTest
public void beforeTest2 () {
	  
	  driver=chromeWebDriver();
}
/*
@AfterTest
public void CloseDriver() {
	driver.close();
}
*/
}
