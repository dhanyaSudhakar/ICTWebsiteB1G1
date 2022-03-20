package com.swaglabs1.scripts;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.swaglabs1.constants.AutomationConstants;
import com.swaglabs1.pages.LoginPage;
import  com.swaglabs1.scripts.TestBase;
import com.swaglabs1.utilities.ExcelUtility;



public class TestClass extends TestBase{
	
	LoginPage objLogin;
	
	
	@Test(priority=0 )
    public void verifyInValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new LoginPage(driver);
    //login to application
    
    String username = ExcelUtility.getCellData(0, 0);
    String password = ExcelUtility.getCellData(0, 1);
    objLogin.setUserName(username);
    objLogin.setPassword(password);
    objLogin.clickLogin();
    String expectedErrorMessage =AutomationConstants.LOGIN_ERROR_MESSAGE;
    String actualErrorMessage =objLogin.getErrorMessage();
    Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }
	

	
	@Test(priority=1)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new LoginPage(driver);
    //login to application
    
    String username = ExcelUtility.getCellData(1, 0);
    String password = ExcelUtility.getCellData(1, 1);
    objLogin.setUserName(username);
    objLogin.setPassword(password);
    objLogin.clickLogin();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    AssertJUnit.assertEquals(expectedTitle,actualTitle);
    }
		
	}


