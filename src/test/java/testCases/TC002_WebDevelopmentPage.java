package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.WebDevelopmentPage;
import utilityFiles.ScreenShots;

public class TC002_WebDevelopmentPage extends TC001_SearchHomePage {
	
	WebDevelopmentPage wp = null;
	
	@Test(priority =4,groups= {"regression","Master"})
	public void Result() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
		Thread.sleep(2000);
		wp.searchResult();
	}
	
	@Test(priority = 3,groups= {"regression","Master"})
	public void languageSelect() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
		wp.selectLanguage();
		Thread.sleep(2000);
		logger.info("---//Language Selected//---");
	}
	
	@Test(priority = 2,groups= {"regression","Master"})
	public void levelSelector() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
//		wp.scrollScreen();
		wp.selectLevel();
		logger.info("---//Level Selected//---");
	}
	
	@Test(priority = 7,groups= {"regression","Master"})
	public void Headings() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
//		wp.AllLevel();
//		wp.Search();
		wp.clickLogo();
	}
	
//	@Test(priority = 5)
//	public void firstCard() {
//		wp = new WebDevelopmentPage(driver);
//		wp.clickFirstCard();
//	}
	
	@Test(priority = 6,groups= {"regression","Master"})
	public void deatilsFirstCard() throws InterruptedException, IOException {
		ScreenShots ss = new ScreenShots(driver);
		wp = new WebDevelopmentPage(driver);
		wp.FirstNameRatingTime();
		wp.SecondNameRatingTime();
		ss.screenshot("Courses");
//		wp.FirstCardsPage();
	}

}
