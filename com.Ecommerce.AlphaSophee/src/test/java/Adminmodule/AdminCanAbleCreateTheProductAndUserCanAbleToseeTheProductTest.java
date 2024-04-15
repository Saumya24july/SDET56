package Adminmodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.Alphasophee.ObjectRepository.AdminSignInpage;
import com.Ecommerce.Alphasophee.ObjectRepository.ShoppingPortalDetailsPage;
import com.Ecommerce.Alphasophee.ObjectRepository.ShoppingPortalInsertProductPage;
import com.Ecommerce.Alphasophee.ObjectRepository.UserLogInPage;
import com.Ecommerce.Alphasophee.ObjectRepository.UserModuleHomePage;
import com.GenericUtility.BaseClass;
import com.GenericUtility.DataBaseUtility;
import com.GenericUtility.ExcelFileUtility;
import com.GenericUtility.IpathConstant;
import com.GenericUtility.JaavUtility;
import com.GenericUtility.PropertiesFileutility;
import com.GenericUtility.WebDriverUtility;

//@Listeners(com.GenericUtility.ListenerImplimentation.class)
public class AdminCanAbleCreateTheProductAndUserCanAbleToseeTheProductTest extends BaseClass {

	

	@Test(priority = 0,retryAnalyzer = com.GenericUtility.RetryImplclass.class)

	public void AdminCanAbleCreateTheProductAndUserCanAbleToseeTheProductTest() throws Throwable {
		// TODO Auto-generated method stub

		AdminSignInpage ap = new AdminSignInpage(driver);
		ShoppingPortalDetailsPage sp = new ShoppingPortalDetailsPage(driver);

		String url = putil.getpropertiesFileData("AdminUrl");
		String AdminUsername = putil.getpropertiesFileData("AdminUsername");
		String AdminPassword = putil.getpropertiesFileData("AdminPassword");
		String category = eutil.ReadDataFromExcelFile("CreateAccount", 10, 3);
		String Subcategoryname = eutil.ReadDataFromExcelFile("CreateAccount", 12, 3);
		driver.get(url);
		

		System.out.println(AdminUsername);
		System.out.println(AdminPassword);

		ap.getUsernameTextField().sendKeys(AdminUsername);
		ap.getPasswordTextField().sendKeys(AdminPassword);
		ap.getSubMitButton().click();

		ShoppingPortalInsertProductPage spi = new ShoppingPortalInsertProductPage(driver);
		spi.getInsertproductLink().click();

		wutil.DropDownselectByvisibleText(spi.getDropdownCreateCategory(), category);
		wutil.DropDownselectByvisibleText(spi.getDropDownSubcategory(), Subcategoryname);
		String ProductName = eutil.ReadDataFromExcelFile("ProductDetails", 0, 1);
		String Productcompany = eutil.ReadDataFromExcelFile("ProductDetails", 1, 1);
		String productPriceBeforeDiscount = eutil.ReadDataFromExcelFile("ProductDetails", 2, 1);
		String productAfterDiscount = eutil.ReadDataFromExcelFile("ProductDetails", 3, 1);
		String productDescription = eutil.ReadDataFromExcelFile("ProductDetails", 4, 1);
		String productShippingCharge = eutil.ReadDataFromExcelFile("ProductDetails", 5, 1);

		spi.getProductNameTextFiled().sendKeys(ProductName);
		spi.getProductcompanyTExtFiled().sendKeys(Productcompany);
		spi.getProductPriceBeforeDiscountTextFiled().sendKeys(productPriceBeforeDiscount);
		spi.getProductPriceAfterDiscountTextField().sendKeys(productAfterDiscount);
		spi.getProductDescriptionTextFiled().sendKeys(productDescription);
		spi.getProductShippingchargeTextField().sendKeys(productShippingCharge);

		wtil.DropDownselectByvisibleText(spi.getDropdownProductAvailibility(),
				eutil.ReadDataFromExcelFile("CreateAccount", 12, 1));

		spi.getImageUploadLink1().sendKeys(IpathConstant.ImagePath);
		spi.getImageUploadLink2().sendKeys(IpathConstant.ImagePath);
		spi.getImageUploadLink3().sendKeys(IpathConstant.ImagePath);
		spi.getInsertProductButton().click();

		String UserUrl = putil.getpropertiesFileData("UserUrl");

		driver.get(UserUrl);

		// driver.switchTo().newWindow(WindowType.WINDOW);

		UserLogInPage ui = new UserLogInPage(driver);
		ui.getUserLoginButton().click();

		String UserEmail = eutil.ReadDataFromExcelFile("CreateAccount", 14, 0);

		String UserPassword = eutil.ReadDataFromExcelFile("CreateAccount", 14, 1);

		ui.getEmailId_SignInTextFiled().sendKeys(UserEmail);
		ui.getPasswordTextfiledSignIn().sendKeys(UserPassword);
		ui.getLoginButton().click();

		UserModuleHomePage um = new UserModuleHomePage(driver);
		um.getSearchTextFiled().sendKeys(ProductName);

		driver.findElement(By.name("search")).click();

	}
	@Test(priority = 1,retryAnalyzer = com.GenericUtility.RetryImplclass.class)

	public void AdminCanAbleToaddTheProductandCanAbleToUpdateTheProductTest() throws Throwable {
		AdminSignInpage ap = new AdminSignInpage(driver);
		ShoppingPortalDetailsPage sp = new ShoppingPortalDetailsPage(driver);
		String url = putil.getpropertiesFileData("AdminUrl");
		String AdminUsername = putil.getpropertiesFileData("AdminUsername");
		String AdminPassword = putil.getpropertiesFileData("AdminPassword");
		String category = eutil.ReadDataFromExcelFile("CreateAccount", 10, 3);
		String Subcategoryname = eutil.ReadDataFromExcelFile("CreateAccount", 12, 3);
		driver.get(url);
		ap.getUsernameTextField().sendKeys(AdminUsername);
		ap.getPasswordTextField().sendKeys(AdminPassword);
		ap.getSubMitButton().click();

		sp.getCreateCategoryOption().click();
		sp.getCategoryName().sendKeys(category);
		sp.getCategorySubmitbutton().click();

		sp.getSubCategory().click();
		sp.getCategoryName().sendKeys(category);
		sp.getSubcategoryName().sendKeys(Subcategoryname);
		sp.getSubactegoryCreatebutton().click();
		sp.getSubcategorySearchBar().sendKeys(Subcategoryname);
        sp.getSubcategoryclickAction().click();
        sp.getProductupdateButton().click();

	}
	

	@Test(priority=2,retryAnalyzer = com.GenericUtility.RetryImplclass.class)
	public void AdminCanApprovetheProductTest() throws IOException, Throwable {
		
		
		
		UserModuleHomePage hp=new UserModuleHomePage(driver);
		UserLogInPage  lp=new UserLogInPage(driver);
		ShoppingPortalDetailsPage sp=new ShoppingPortalDetailsPage(driver);
		AdminSignInpage ap=new AdminSignInpage(driver);
	

		driver.get(putil.getpropertiesFileData("UserUrl"));
		String USERNAME = eutil.ReadDataFromExcelFile("CreateAccount", 1, 0);
		String email = eutil.ReadDataFromExcelFile("CreateAccount", 1, 1);
		String contactnumber = eutil.ReadDataFromExcelFile("CreateAccount", 1, 2);
		String password = eutil.ReadDataFromExcelFile("CreateAccount", 1, 3);
		String Confirmpassword = eutil.ReadDataFromExcelFile("CreateAccount", 1, 4);

		int random = jutil.getRandomNo(1000);

		
		int newNumber=jutil.getRandomNo(1000);
		hp.getLoginButton().click();
		

		lp.getUsernameTextField().sendKeys(USERNAME);
		lp.getEmailIdTextField().sendKeys(newNumber+email);
		lp.getContactNoTextField().sendKeys(contactnumber);
		lp.getPasswordTextField().sendKeys(password);
		lp.getConfirmPasswordTextField().sendKeys(Confirmpassword);
		lp.getSubmitButton().click();
		
		wutil.AcceptAlert(driver);
		
		lp.getEmailId_SignInTextFiled().sendKeys(newNumber+email);
		lp.getPasswordTextfiledSignIn().sendKeys(password);
		lp.getLoginButton().click();
		String ProductName = eutil.ReadDataFromExcelFile("CreateAccount", 4, 4);
			
		
		hp.getSearchTextFiled().sendKeys(ProductName);
		hp.getSearchButton().click();
		hp.getAddToCartOption().click();
		
				
		wutil.AcceptAlert(driver);

		String BillingAddress = eutil.ReadDataFromExcelFile("CreateAccount", 4, 0);
		String BillingState = eutil.ReadDataFromExcelFile("CreateAccount", 4, 1);
		String Billingcity = eutil.ReadDataFromExcelFile("CreateAccount", 4, 2);
		String Billingpincode = eutil.ReadDataFromExcelFile("CreateAccount", 4, 3);


		
		sp.getBillingAddressTextFiled().sendKeys(BillingAddress);
		sp.getBilingstateTextFiled().sendKeys(BillingState);
		sp.getBillingcityTextFiled().sendKeys(BillingState);
		sp.getBillingpincodeTextFiled().sendKeys(Billingpincode);
		sp.getUpdateButton().click();

		String ShippingAddress = eutil.ReadDataFromExcelFile("CreateAccount", 7, 0);
		String Shippingstate = eutil.ReadDataFromExcelFile("CreateAccount", 7, 1);
		String ShippingCity = eutil.ReadDataFromExcelFile("CreateAccount", 7, 2);
		String Shippingpincode = eutil.ReadDataFromExcelFile("CreateAccount", 7, 3);
		
		sp.getShippingaddressTextFiled().sendKeys(ShippingAddress);
	
		sp.getShippingstateTextFiled().sendKeys(Shippingstate);
		sp.getShippingcityTextFiled().sendKeys(ShippingCity);
		sp.getShippingpincodeTextFiled().sendKeys(Shippingpincode);
		sp.getShipupdateButton().click();
		
		wutil.AcceptAlert(driver);

		sp.getBillingAddressTextFiled().sendKeys(BillingAddress);
		sp.getBilingstateTextFiled().sendKeys(BillingState);
		sp.getBillingcityTextFiled().sendKeys(BillingState);
		sp.getBillingpincodeTextFiled().sendKeys(Billingpincode);
		sp.getUpdateButton().click();

		wutil.AcceptAlert(driver);

		sp.getProCeedCheckOutButton().click();
		sp.getPaymentButton().click();

		sp.getTrackProductOrderButton().click();

		wutil.switchWindow(driver, "Order Tracking Details");


		wutil.switchWindow(driver, "Order History");

	
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		String AdminUrl = putil.getpropertiesFileData("AdminUrl");

		driver.navigate().to(AdminUrl);
		
		String AdminUsername=putil.getpropertiesFileData("AdminUsername");
		String AdminPassword=putil.getpropertiesFileData("AdminPassword");

	
		
		
		ap.getUsernameTextField().sendKeys(AdminUsername);
		ap.getPasswordTextField().sendKeys(AdminPassword);
		ap.getSubMitButton().click();
		sp.getOrderManageMentOption().click();
		
		
		
		wutil.waitforvisiblityOfElement(driver, 20, sp.getPendingOrderOption());
		sp.getPendingOrderOption().click();
		
		sp.getPendingorderSerrchBar().sendKeys(email);
		

		
		

	}

}
