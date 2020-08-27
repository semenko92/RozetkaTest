package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage.TestBase;

public class DropDownPage1 extends TestBase {
	protected By dropDown1=By.xpath("//*[@class='select-css ng-pristine ng-valid ng-touched']");
/*
	private By driver;
    
    Select dropDownUi1=new Select(driver.findElement((SearchContext) By.xpath("//*[@class='select-css ng-pristine ng-valid ng-touched']")));
	public DropDownPage1(WebDriver driver) {
		super(driver);
		
	}
public void selectDropDownItem(int index) {
	dropDownUi.selectByIndex(index);
}
public String selectedDropDownItem() {
	return dropDownUi.getFirstSelectedOption().getText();
}
}
*/

}