package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilityFiles.ScreenShots;

public class TC001_SearchHomePage extends BaseClass {
	
	@Test(priority = 1,groups= {"sanity","Master"})
	public void searchHomePage() throws IOException, InterruptedException {
		ScreenShots ss = new ScreenShots(driver);
		HomePage hp = new HomePage(driver);
		hp.searchBox();
		Thread.sleep(3000);
		ss.screenshot("WebDevelopment");
		logger.info("---//WebDevelopment Page opened//---");
		
	}
	
	@Test(priority = 8,groups= {"regression","Master"})
	public void Search2() throws IOException, InterruptedException {
		ScreenShots ss = new ScreenShots(driver);
		HomePage hp = new HomePage(driver);
		hp.Search2();
		Thread.sleep(3000);
		ss.screenshot("Language");
		logger.info("---//Language Learning Page opened//---");
	}
	
	@Test(priority = 11,groups= {"regression","Master"})
	public void ThirdtimeHomepage() throws InterruptedException, IOException {
		ScreenShots ss = new ScreenShots(driver);
		HomePage hp = new HomePage(driver);
		hp.ScrollEnd();
		Thread.sleep(3000);
		ss.screenshot("Enterprise");
		Thread.sleep(1000);
		hp.clickEnterprise();
		Thread.sleep(2000);
		logger.info("---//Enterprise opened//---");
	}

}
