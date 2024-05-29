package testBase;
 
import java.io.FileReader;

import java.io.IOException;

import java.time.Duration;

import java.util.Properties;

import java.util.Scanner;
 
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
 
public class BaseClass {
 
	public static WebDriver driver;

	public Properties p;

	public int choice;

	public Logger logger;

	Scanner sc;

	@BeforeTest(groups= {"sanity","regression","Master"})

	@Parameters({"os","browser"})

	public void setup(String os,String br) throws IOException {

		//loading properties file

		FileReader file = new FileReader(".//src//test//resources//config.properties");

		p = new Properties();

		p.load(file);

		ChromeOptions chromeOptions=new ChromeOptions();

		chromeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		chromeOptions.addArguments("--disable-notifications");

		EdgeOptions edgeOptions=new EdgeOptions();

		edgeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		edgeOptions.addArguments("--disable-notifications");


		logger = LogManager.getLogger(this.getClass());


						//Switch Case to Choose the browser
 
						switch(br.toLowerCase()) {
 
						case "chrome":
 
							driver = new ChromeDriver(chromeOptions);     //  Launch Chrome
 
							break;
 
						case "edge":
 
							driver = new EdgeDriver(edgeOptions);		 // Launch Edge
 
							break;
 
 
						default:
 
							System.out.println("No matching browser.");
 
							return;
 
						}


		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(p.getProperty("appURL"));

		driver.manage().window().maximize();

	}

	@AfterTest(groups= {"sanity","regression","master"})

	public void tearDown() {

		driver.quit();

	}

 
	

}
