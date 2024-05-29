package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BusinessPage;
import pageObjects.ContactUsPage;
import pageObjects.UniversitiesPage;

public class TC004_BusinessCoursera extends TC003_LanguageLearning{
	
	@Test(priority = 12,groups= {"regression","Master"})
	public void clickSolution() throws InterruptedException {
		BusinessPage bp = new BusinessPage(driver);
		bp.clickSolution();
		Thread.sleep(1000);
		bp.clickCampus();
				
	}
	
	@Test(priority = 13,groups= {"regression","Master"})
	public void clickContactUs() throws InterruptedException {
		UniversitiesPage up = new UniversitiesPage(driver);
		up.clickContactUs();
		Thread.sleep(2000);
		logger.info("---//Contact Us Page Opened//---");
	}
	
	@Test(priority = 14,groups= {"regression","Master"})
	public void details() throws InterruptedException, IOException {
		ContactUsPage cp = new ContactUsPage(driver);
		String msg = cp.enterDetails();
		System.out.println("Error msg: " + msg);
		logger.info("---//Error Message Captured from Contact Us Page//---");
	}
}