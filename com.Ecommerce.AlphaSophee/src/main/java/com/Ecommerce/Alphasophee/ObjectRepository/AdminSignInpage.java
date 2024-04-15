package com.Ecommerce.Alphasophee.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSignInpage {
	
	public AdminSignInpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id ="inputEmail")
	private WebElement UsernameTextField;
	
	@FindBy(id ="inputPassword")
	private WebElement PasswordTextField;
	
	@FindBy(name ="submit")
	private WebElement SubMitButton;
	


	public WebElement getUsernameTextField() {
		return UsernameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getSubMitButton() {
		return SubMitButton;
	}


	
	
}
