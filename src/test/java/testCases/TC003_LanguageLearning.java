package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LanguageLearningPage;

public class TC003_LanguageLearning extends TC002_WebDevelopmentPage {
	
	@Test(priority=9,groups= {"regression","Master"})
	public void displayLevels() throws IOException {
		LanguageLearningPage ll = new LanguageLearningPage(driver);
		ll.findLevels();
		logger.info("---//Data Captured from Levels//---");
		
	}
	
	@Test(priority=10,groups= {"regression","Master"})
	public void displayLanguages() throws InterruptedException, IOException {
		LanguageLearningPage ll = new LanguageLearningPage(driver);
		ll.clickShowmore();
		ll.findLanguages();
		Thread.sleep(2000);
		ll.closeShowmore();
		Thread.sleep(1000);
		ll.clickLogo();
		logger.info("---//Data Captured from Languages//---");
	}

}
