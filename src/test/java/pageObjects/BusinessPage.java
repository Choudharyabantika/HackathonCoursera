package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessPage extends BasePage {
	public BusinessPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//a[contains(text(),'Solutions')]")WebElement SolutionButton;
	@FindBy(xpath = "//p[contains(text(),'Coursera for Campus')]")WebElement campus;
	
	//Action Methods
	
	public void clickSolution() {
		SolutionButton.click();
	}
	
	public void clickCampus() {
		campus.click();
	}

}
