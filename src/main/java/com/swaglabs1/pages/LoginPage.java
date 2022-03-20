package com.swaglabs1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	 WebDriver driver;
	    
	    @FindBy(id="user-name")
	    private WebElement username;
	    @FindBy(id="password")
	    private WebElement password;    
	    @FindBy(id="login-button")
	    private WebElement login;
	    
	    @FindBy(xpath="//h3[@data-test='error']")
	    private WebElement errorMessage;
	    
	    
	    public LoginPage(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }

	    //Set user name in textbox
	    public void setUserName(String strUserName){
	    	username.clear();
	    	username.sendKeys(strUserName);     
	    }
	    
	    //Set password in password textbox
	    public void setPassword(String strPassword){
	    	password.clear();
	       password.sendKeys(strPassword);
	    }
	    
	    //Click on login button
	    public void clickLogin(){
	            login.click();
	    }

		public String  getErrorMessage() {
			return errorMessage.getText();
		} 	    
	
	
}
