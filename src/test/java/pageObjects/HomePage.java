package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilityFiles.ScreenShots;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Locators WebElements
	@FindBy(xpath = "(//input[@type='text'])[1]")WebElement SearchBox;
	@FindBy(xpath = "(//div[@class='magnifier-wrapper'])[2]")WebElement SearchButton;
	@FindBy(xpath = "//a[contains(text(),'For Enterprise')]")WebElement Enterprise;
	
	//Action Methods
	public void searchBox() throws IOException {
		ScreenShots ss = new ScreenShots(driver);
		ss.screenshot("Homepage");
		SearchBox.sendKeys("Web Development");
		SearchButton.click();
	}
	
	public void Search2() {
		SearchBox.clear();
		SearchBox.sendKeys("Language Learning");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void ScrollEnd() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void clickEnterprise() {
		Enterprise.click();
	}

}
