package com.magneto.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='panel wrapper']//a[contains(text(),'Sign In')]")
	private WebElement signInLink;
	
	
	public WebElement getSignInLink() {
		return signInLink;
	}
	

}
