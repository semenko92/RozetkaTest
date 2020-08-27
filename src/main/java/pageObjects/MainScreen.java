package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainScreen {
	WebDriver driver;
	public MainScreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//driver.get("https://rozetka.com.ua/");
	}
	@FindBy(css=".menu-toggler__icon")
	public WebElement CatalogButton;
	
	@FindBy(xpath="//*[@href='\\https://rozetka.com.ua/computers-notebooks/c80253/']")
	public WebElement LaptopAndComputersButton;
	
	
	@FindBy(xpath="//*[@href='#']")
	public WebElement EnterToYourAccountButton;
	
	@FindBy(xpath="//*[@href='https://rozetka.com.ua/newseller/']")
	public By SellOnRozetkaButton;
	
	@FindBy(css=".header-phones__button-icon")
	public WebElement TelArrow;
	
	@FindBy(xpath="//*[@class='header-cities__link link-dashed']")
	public WebElement ChooseYourCity;
	
	@FindBy(css=".header-location__autocomplete-input")
	public WebElement AddYouCityField;
	
	@FindBy(xpath="//*[@class='header-location__autocomplete-input ng-valid ng-dirty ng-touched']")
	public WebElement AddYourCityField2;
	
	@FindBy(xpath="//*[@href='#']")
	public WebElement EnterToYourCabinetButton;
	
	@FindBy(xpath="//*[@id='auth_email']")
	public WebElement AddYourEmailField;
	
	@FindBy(xpath="//*[@id='auth_pass']")
	public WebElement AddYourPassField;
	
	@FindBy(xpath="//*[@class='button button_size_large button_color_green auth-modal__submit']")
	public WebElement EnterInYourAccButton;
	
	@FindBy(css=".header-actions__button_type_basket > svg")
	public WebElement BasketButton;
}
