package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilityFiles.ExcelUtils;

public class LanguageLearningPage extends BasePage{
	public LanguageLearningPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "//div[@data-testid='search-filter-group-Level']//label[@class='cds-checkboxAndRadio-label']") List<WebElement> levels;
//	@FindBy(xpath = "//button[@aria-label='Show more Language options']") WebElement showMoreLanguages;
	@FindBy(xpath= "//div[@data-testid='search-filter-group-Language']//button//span[contains(text(),'Show more')]") WebElement showmoreLang;
	@FindBy(xpath = "//button[@data-track-component=\"expand_filter_items_button_language\"]//span[contains(text(),'Show more')]")WebElement showmoreLang1;
	@FindBy(xpath = "//div[@class='cds-Modal-container']//label[contains(@class,'checkboxAndRadio')]") List<WebElement> languageList;
	@FindBy(xpath = "//button[contains(@class,'css-1orckby')]")WebElement CloseButton;
	@FindBy(xpath = "//a[@data-click-key=\"search.search.click.logo\"]")WebElement Logo;
	
	public void findLevels() throws IOException {
		System.out.println("Levels in Language Learning: ");
		int i=1;
		for(WebElement level:levels) {
			String l = level.getText();
			System.out.println(level.getText());
			ExcelUtils excel = new ExcelUtils();
			String xlFile = System.getProperty("user.dir")+"\\testData\\testDataCoursera.xlsx";
			excel.setCellData(xlFile, "Levels", i, 0, l);
			i++;
		}
		System.out.println("-------------------------------------");
	}
	
	public void clickShowmore() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",showmoreLang);
//		js.executeScript("arguments[0].click();",showmoreLang);
		showmoreLang1.click();
	}
	
	public void findLanguages() throws IOException {
		System.out.println("Languages Available in Language Learning: ");
		int j=1;
		for(WebElement lang:languageList) {
			String lg = lang.getText();
			System.out.println(lang.getText());
			ExcelUtils excel = new ExcelUtils();
			String xlFile = System.getProperty("user.dir")+"\\testData\\testDataCoursera.xlsx";
			excel.setCellData(xlFile, "Languages", j, 0, lg);
			j++;
		}
		System.out.println("-------------------------------------");
	}
	
	public void closeShowmore() {
		CloseButton.click();
	}
	
	public void clickLogo() {
		Logo.click();
	}

}
