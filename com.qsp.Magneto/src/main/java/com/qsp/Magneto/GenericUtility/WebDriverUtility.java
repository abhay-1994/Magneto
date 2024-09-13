package com.qsp.Magneto.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	WebDriverWait wait;
	Actions act;
	/**
	 * This method is used to provide implicit wait
	 * @param time
	 */
	public void implicitWait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public void explicitWaitElementToBeSelected(WebDriver driver, WebElement ele, int time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}
	
	public void moveToEle(WebDriver driver ,WebElement ele) {
		act= new Actions(driver);
		act.moveToElement(ele);
	}
	
}
