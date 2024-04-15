package com.Ecommerce.Alphasophee.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPortalDetailsPage {

	
	public ShoppingPortalDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="shippingaddress")
	private  WebElement shippingaddressTextFiled;
	
	@FindBy(id="shippingstate")
	private  WebElement shippingstateTextFiled;
	
	@FindBy(name="shippingcity")
	private  WebElement shippingcityTextFiled;
	
	@FindBy(id="shippingpincode")
	private  WebElement shippingpincodeTextFiled;
	
	@FindBy(name="shipupdate")
	private  WebElement shipupdateButton;
	
	@FindBy(name="billingaddress")
	private  WebElement billingAddressTextFiled;
	
	@FindBy(id="bilingstate")
	private  WebElement bilingstateTextFiled;
	
	@FindBy(name="billingcity")
	private  WebElement billingcityTextFiled;
	
	@FindBy(id="billingpincode")
	private  WebElement billingpincodeTextFiled;
	
	@FindBy(name="update")
	private  WebElement updateButton;
	
	@FindBy(xpath = "//button[@name='ordersubmit']")
	private WebElement ProCeedCheckOutButton;
	
	@FindBy(name = "submit")
	private WebElement PaymentButton;
	
	@FindBy(xpath = "//a[contains(.,'Order Management')]")
	private WebElement OrderManageMentOption;
	
	@FindBy(xpath = "//a[contains(.,'Pending Orders')]")
	private WebElement pendingOrderOption;
	
    @FindBy(xpath ="//label[contains(.,'Search')]")
    private WebElement pendingorderSerrchBar;
	
    @FindBy(xpath = " //a[contains(.,'Create Category')] ")
    private WebElement CreateCategoryOption;
    
    @FindBy(name = "submit")
    private WebElement categorySubmitbutton;
    
    @FindBy(name= "category")
    private WebElement CategoryName;
    
    @FindBy(xpath = " //a[contains(.,'Sub Category ')] ")
    private WebElement SubCategory;
	
    @FindBy(xpath = "//input[@name='subcategory']")
    private WebElement SubcategoryName;
    
    @FindBy(name ="submit")
    private WebElement SubactegoryCreatebutton;
    
    @FindBy(xpath = "//input[@aria-controls='DataTables_Table_0']")
    private WebElement subcategorySearchBar;
    
    @FindBy(xpath ="(//tr[@class='odd' ]/descendant::i[@class='icon-edit'])[1]")
    private WebElement subcategoryclickAction;
   
    @FindBy(name = "submit")
    private WebElement productupdateButton;
    
    
	public WebElement getSubCategory() {
		return SubCategory;
	}

	public WebElement getCreateCategoryOption() {
		return CreateCategoryOption;
	}
	

	@FindBy(xpath = "//td/a[contains(.,'Track')]")
	private WebElement TrackProductOrderButton;

	public WebElement getBillingAddressTextFiled() {
		return billingAddressTextFiled;
	}

	public WebElement getBilingstateTextFiled() {
		return bilingstateTextFiled;
	}

	public WebElement getBillingcityTextFiled() {
		return billingcityTextFiled;
	}

	public WebElement getBillingpincodeTextFiled() {
		return billingpincodeTextFiled;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

	public WebElement getShippingaddressTextFiled() {
		return shippingaddressTextFiled;
	}

	public WebElement getShippingstateTextFiled() {
		return shippingstateTextFiled;
	}

	public WebElement getShippingcityTextFiled() {
		return shippingcityTextFiled;
	}

	public WebElement getShippingpincodeTextFiled() {
		return shippingpincodeTextFiled;
	}

	public WebElement getShipupdateButton() {
		return shipupdateButton;
	}

	public WebElement getProCeedCheckOutButton() {
		return ProCeedCheckOutButton;
	}

	public WebElement getPaymentButton() {
		return PaymentButton;
	}
	public WebElement getOrderManageMentOption() {
		return OrderManageMentOption;
	}
	
	public WebElement getTrackProductOrderButton() {
		return TrackProductOrderButton;
	}

	public WebElement getPendingOrderOption() {
		return pendingOrderOption;
	}

	public WebElement getPendingorderSerrchBar() {
		return pendingorderSerrchBar;
	}

	public WebElement getCategoryName() {
		return CategoryName;
	}

	public WebElement getCategorySubmitbutton() {
		return categorySubmitbutton;
	}

	public WebElement getSubcategoryName() {
		return SubcategoryName;
	}

	public WebElement getSubactegoryCreatebutton() {
		return SubactegoryCreatebutton;
	}

	public WebElement getSubcategorySearchBar() {
		return subcategorySearchBar;
	}

	public WebElement getSubcategoryclickAction() {
		return subcategoryclickAction;
	}

	public WebElement getProductupdateButton() {
		return productupdateButton;
	}
	
	
	
	
	
}
