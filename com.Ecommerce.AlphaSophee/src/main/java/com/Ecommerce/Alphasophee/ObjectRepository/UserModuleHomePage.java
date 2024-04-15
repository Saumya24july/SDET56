package com.Ecommerce.Alphasophee.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserModuleHomePage {

	public UserModuleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='My Account']")
	private WebElement MyAccountButton;
	
	@FindBy(xpath = "//a[.='Wishlist']")
	private WebElement WishList;
	
	
	@FindBy(xpath = "//a[.='My Cart']")
	private WebElement AddTocartButton;
	
	@FindBy(name = "product")
	private WebElement SearchTextFiled;

	@FindBy(xpath = "//button[@name='search']")
	private WebElement SearchButton;
	
	@FindBy(name = "product")
	private WebElement searchTextFiled;
	
	
	@FindBy(xpath = "//a[.='Cricket Bat']/ancestor::div[@class='product']/descendant::button[.='Add to cart']")
	private WebElement AddToCartOption;


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getMyAccountButton() {
		return MyAccountButton;
	}


	public WebElement getWishList() {
		return WishList;
	}


	public WebElement getAddTocartButton() {
		return AddTocartButton;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getSearchTextFiled() {
		return searchTextFiled;
	}


	public WebElement getAddToCartOption() {
		return AddToCartOption;
	}
	
	
	
}
