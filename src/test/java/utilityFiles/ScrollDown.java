package utilityFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import testBase.BaseClass;

public class ScrollDown extends BaseClass {
	
	public ScrollDown(WebDriver driver) {
		this.driver = driver;
	}
	public void scrolldown() {
		Actions act = new Actions(driver);
		int j =0;
		while(j!=8) {
		act.keyDown(Keys.ARROW_DOWN).perform();
		j++;
		}

	}
}
