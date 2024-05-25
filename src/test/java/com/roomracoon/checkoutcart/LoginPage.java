package com.roomracoon.checkoutcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		driver.get("https://www.saucedemo.com");
		this.driver = driver;
		
	}
	
	@FindBy(id = "user-name")
	 WebElement username;
	
	@FindBy(id = "password")
	 WebElement password;
	
	@FindBy(id = "login-button")
	 WebElement loginButton;
	
public void enterName(String nameToEnter) {
	
	username.sendKeys(nameToEnter);
}

public void enterPassword(String passwordToEnter) {
	
	password.sendKeys(passwordToEnter);
}

public void loginClick(){
	loginButton.click();
}	

public void login(String name, String Password){
	enterName(name);
	enterPassword(Password);
	loginClick();
	
}
}
