package com.roomracoon.checkoutcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage {
	
	private WebDriver driver;
	
	public CheckoutStepOnePage(WebDriver driver) {
		super();
		this.driver = driver;	
	}
	
	@FindBy(id = "first-name")
	WebElement firstName;
	
	@FindBy(id = "last-name")
	WebElement lastname;
	
	@FindBy(id = "postal-code")
	WebElement postalCode;
	
	@FindBy(id = "continue")
	WebElement continueButton;
	
	
	public void enterFirstName(String firstname) {
		
		firstName.sendKeys(firstname);
	}
	
	public void enterlastName(String lastName) {
		
		lastname.sendKeys(lastName);
	}
	
	public void enterPostalCode(String postalcode) {
		
		postalCode.sendKeys(postalcode);
	}
	
	public void addInfoAndContinue(String firstname, String lastname, String postalcode) {
		
		enterFirstName(firstname);
		enterlastName(lastname);
		enterPostalCode(postalcode);
		continueButton.click();
		
	}
}
