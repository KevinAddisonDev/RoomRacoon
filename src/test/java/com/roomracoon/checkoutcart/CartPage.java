package com.roomracoon.checkoutcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "checkout")
	WebElement checkoutButton;
	
	public void clickCheckout() {
		
		checkoutButton.click();
	}
}
