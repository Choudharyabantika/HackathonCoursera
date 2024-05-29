package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UniversitiesPage extends BasePage {
	public UniversitiesPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//span[contains(text(),'Contact Us')]")WebElement ContactUs;
	
	//Action Methods
	
	public void clickContactUs() {
		ContactUs.click();
	}

}
