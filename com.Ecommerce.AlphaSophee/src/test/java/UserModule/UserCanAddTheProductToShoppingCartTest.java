package UserModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.Alphasophee.ObjectRepository.ShoppingPortalDetailsPage;
import com.Ecommerce.Alphasophee.ObjectRepository.UserLogInPage;
import com.Ecommerce.Alphasophee.ObjectRepository.UserModuleHomePage;
import com.GenericUtility.BaseClass;
import com.GenericUtility.DataBaseUtility;
import com.GenericUtility.ExcelFileUtility;
import com.GenericUtility.JaavUtility;
import com.GenericUtility.PropertiesFileutility;
import com.GenericUtility.WebDriverUtility;

//@Listeners(com.GenericUtility.ListenerImplimentation.class)
public class UserCanAddTheProductToShoppingCartTest extends BaseClass {


	@Test
	public void UserCanAddTheProductToShoppingCartTest() throws Throwable, IOException {
		// TODO Auto-generated method stub


		
		UserModuleHomePage hp=new UserModuleHomePage(driver);
		UserLogInPage  lp=new UserLogInPage(driver);
		ShoppingPortalDetailsPage sp=new ShoppingPortalDetailsPage(driver);
		
		

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

	
		

	}

}
