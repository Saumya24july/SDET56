package com.Ecommerce.Alphasophee.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPortalInsertProductPage {
	
	
	public ShoppingPortalInsertProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(.,'Insert Product')]")
	private WebElement InsertproductLink;
	
	@FindBy(name= "productName")
	private WebElement productNameTextFiled;
	
	@FindBy(name="productCompany")
	private WebElement productcompanyTExtFiled;
	
	@FindBy(name="productpricebd")
	private WebElement productPriceBeforeDiscountTextFiled;
	
	@FindBy(name="productprice")
	private WebElement productPriceAfterDiscountTextField;
	
	@FindBy(name="productDescription")
	private WebElement productDescriptionTextFiled;
	
	@FindBy(name = "productShippingcharge")
	private WebElement productShippingchargeTextField;

	@FindBy(xpath = "//select[@name='category']")
	private WebElement DropdownCreateCategory;
	
	@FindBy(xpath = "//select[@id='subcategory']")
	private WebElement DropDownSubcategory;
	
	@FindBy(xpath = "//select[@id='productAvailability']")
	private WebElement DropdownProductAvailibility;
	
	@FindBy(id ="productimage1")
	private WebElement ImageUploadLink1;
	
	@FindBy(name="productimage2")
	private WebElement ImageUploadLink2;
	
	@FindBy(name="productimage3")
	private WebElement ImageUploadLink3;
	
	@FindBy(name = "submit")
	private WebElement InsertProductButton;
	

	public WebElement getInsertproductLink() {
		return InsertproductLink;
	}

	public WebElement getProductNameTextFiled() {
		return productNameTextFiled;
	}

	public WebElement getProductcompanyTExtFiled() {
		return productcompanyTExtFiled;
	}

	public WebElement getProductPriceBeforeDiscountTextFiled() {
		return productPriceBeforeDiscountTextFiled;
	}

	public WebElement getProductPriceAfterDiscountTextField() {
		return productPriceAfterDiscountTextField;
	}

	public WebElement getProductDescriptionTextFiled() {
		return productDescriptionTextFiled;
	}

	public WebElement getProductShippingchargeTextField() {
		return productShippingchargeTextField;
	}

	public WebElement getDropdownCreateCategory() {
		return DropdownCreateCategory;
	}

	public WebElement getDropDownSubcategory() {
		return DropDownSubcategory;
	}

	public WebElement getDropdownProductAvailibility() {
		return DropdownProductAvailibility;
	}

	public WebElement getImageUploadLink1() {
		return ImageUploadLink1;
	}

	public WebElement getImageUploadLink2() {
		return ImageUploadLink2;
	}

	public WebElement getImageUploadLink3() {
		return ImageUploadLink3;
	}

	public WebElement getInsertProductButton() {
		return InsertProductButton;
	}
	

}
