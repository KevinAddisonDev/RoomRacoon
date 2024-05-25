package com.roomracoon.checkoutcart;

import org.testng.annotations.Test;

import com.roomracoon.checkoutcart.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class UpdateAndCheckoutCartTest {
	WebDriver driver;	
 @BeforeTest
public void beforeTest() {
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		
	  }
  @Test
  public void LoginAddToCartAndCheckout() {
	  //start by logging in successfully 
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  loginPage.login("standard_user","secret_sauce");
	  
	  //once logged in navigate to the inventory page and add items to cart then go to checkout
	  InventoryPage inventoryPage = PageFactory.initElements(driver, InventoryPage.class);
	  inventoryPage.addItemsToCart();
	  inventoryPage.GoToCheckout();
	  
	  
	  CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	  cartPage.clickCheckout();
	  
	  
	  CheckoutStepOnePage checkoutStepOnePage = PageFactory.initElements(driver, CheckoutStepOnePage.class);
	  checkoutStepOnePage.addInfoAndContinue("Kevin","QA","1234");
	  
	  
  }



}
