package com.qsp.Magneto.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.magneto.ObjectRepo.HomePage;

public class BaseClass {
	public static WebDriver driver;
	FileUtils futil = new FileUtils();
	public static WebDriverUtility wUtil = new WebDriverUtility();

	@BeforeSuite
	public void connectToDB() {
		System.out.println("DB-Connected");
	}

	@BeforeClass
	public void launchBrowser() throws Throwable {
		String BROWSER = futil.readTheDataFromPropertiesFile("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}

	@BeforeMethod

	public void loginToApplication() throws Throwable {
		String URL = futil.readTheDataFromPropertiesFile("url");
		driver.manage().window().maximize();
		driver.get(URL);
		wUtil.implicitWait(driver, 10);
		
		

	}

	@AfterClass
	public void closeBrowser() {
		// driver.quit();
	}

}
