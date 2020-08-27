package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.TestBase;

public class ProductsPage {
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[@name='search']")
	public WebElement MainSearchInput;
	
	@FindBy(xpath="//*[@class='button button_color_green button_size_medium search-form__submit']")
		public WebElement SearchButton;	
	
	@FindBy(xpath="//*[@href='/computers/c80095/seller=rozetka/']")
	public WebElement CheckRozetkaBox;
	
	@FindBy(xpath="//*['html/body/app-root/div/div[1]/rz-category/div/main/ctg-catalog/div/div[1]/div/ctg-sort/select\']")
			public WebElement DropDown;
	
	@FindBy(xpath="//*[@id='+1 или +2 года гарантии']")
	public WebElement CheckBoxesButton;
	
	
}


	
