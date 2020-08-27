package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

	WebDriver driver;
	public BasketPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(css=".js-surname > .ng-pristine")
	public WebElement AddYourSurNameField;
	
	@FindBy(css=".js-phone > .ng-untouched")
	public WebElement AddYourTelephoneField;
	
		// TODO Auto-generated method stub
		
	@FindBy(css=".checkout-total__call > label")
	public WebElement DontCallMeBox;
	}
	
	

