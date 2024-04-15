package com.Ecommerce.Alphasophee.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogInPage {

	
	public UserLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "fullname")
	private WebElement UsernameTextField;
	
	
	@FindBy(id= "email")
	private WebElement EmailIdTextField;
	
	@FindBy(id= "contactno")
	private WebElement ContactNoTextField;
	
	@FindBy(id= "password")
	private WebElement PasswordTextField;
	
	@FindBy(id= "confirmpassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(id = "submit")
	private WebElement SubmitButton;
	
	@FindBy(id="exampleInputEmail1")
	private WebElement EmailId_SignInTextFiled;
	
	@FindBy(id="exampleInputPassword1")
	private WebElement PasswordTextfiledSignIn;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(.,'Login')]")
	private WebElement UserLoginButton;
	
	
	public WebElement getUsernameTextField() {
		return UsernameTextField;
	}

	public WebElement getEmailIdTextField() {
		return EmailIdTextField;
	}

	public WebElement getContactNoTextField() {
		return ContactNoTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getEmailId_SignInTextFiled() {
		return EmailId_SignInTextFiled;
	}

	public WebElement getPasswordTextfiledSignIn() {
		return PasswordTextfiledSignIn;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getUserLoginButton() {
		return UserLoginButton;
	}

	


	
	

	
}
