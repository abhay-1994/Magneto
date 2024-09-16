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
	
	@FindBy(xpath = "//div[@class='panel header']//a[text()='Create an Account']")
	private WebElement createAccountLink;
	
	
	
	
	public WebElement getSignInLink() {
		return signInLink;
	}
	public WebElement getCreateAccountLink() {
		return createAccountLink;
	}
	

}
