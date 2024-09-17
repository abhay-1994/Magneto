package com.qsp.Magneto.user;

import org.testng.annotations.Test;

import com.magneto.ObjectRepo.CreateAccountPage;
import com.qsp.Magneto.GenericUtility.BaseClass;

public class UserRegistrationTest extends BaseClass {
	 
	
	
	@Test
	public void veriFyUserIsAbleToRegister() throws Throwable {
		
		CreateAccountPage CA=new CreateAccountPage(driver);
		CA.registerToTheApplication(driver);
		
		//changes
		
	}

}
