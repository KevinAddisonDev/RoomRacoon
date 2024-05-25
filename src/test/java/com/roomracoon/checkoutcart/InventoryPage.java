package com.roomracoon.checkoutcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
	
	private WebDriver driver;

	public InventoryPage(WebDriver driver) {
		super();
		this.driver = driver;	
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement sauceLabBackpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement sauceLabBackBikeLight;
	
	@FindBy(id = "shopping_cart_container")
	WebElement shoppingCartContainer;
	
	public void addItemsToCart() {
		
		sauceLabBackpack.click();
		sauceLabBackBikeLight.click();
		
	}
	
	public void GoToCheckout() {
		
		shoppingCartContainer.click();
	}
	
}
