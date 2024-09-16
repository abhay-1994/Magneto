package com.magneto.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qsp.Magneto.GenericUtility.ExcelUtils;

public class CreateAccountPage {
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	ExcelUtils excelUtil=new ExcelUtils();
	
	@FindBy (id = "firstname") 
	private WebElement fNameTxtField;
	
	@FindBy (id = "lastname") 
	private WebElement lastNameTxtField;
	
	@FindBy(id = "email_address")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//button/span[text()='Create an Account']")
	private WebElement createAccountButton;

	public WebElement getfNameTxtField() {
		return fNameTxtField;
	}

	public WebElement getLastNameTxtField() {
		return lastNameTxtField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	//Business library
	public void registerToTheApplication(WebDriver driver) throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.getCreateAccountLink().click();
		String firstName = excelUtil.readTheDataFromExcelSheet("registerData", 0, 1);
		String lastName = excelUtil.readTheDataFromExcelSheet("registerData", 1, 1);
		String email = excelUtil.readTheDataFromExcelSheet("registerData", 2, 1);
		String password = excelUtil.readTheDataFromExcelSheet("registerData", 3, 1);
		String confirmPassword = excelUtil.readTheDataFromExcelSheet("registerData", 4, 1);
		System.out.println(firstName);
		fNameTxtField.sendKeys(firstName);
		lastNameTxtField.sendKeys(lastName);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(confirmPassword);
		createAccountButton.click();
		
	}
	

}
