package com.qsp.Magneto.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.magneto.ObjectRepo.CreateAccountPage;
import com.qsp.Magneto.GenericUtility.BaseClass;

public class UserRegistrationTest extends BaseClass {
	WebDriver driver;
	
	@Test
	public void veriFyUserIsAbleToRegister() throws Throwable {
		CreateAccountPage createAcc=new CreateAccountPage(driver);
		createAcc.registerToTheApplication(driver);
		
		System.out.println("textCase failed");
		//changes
		
	}

}
