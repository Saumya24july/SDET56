package UserModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.Alphasophee.ObjectRepository.ShoppingPortalDetailsPage;
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
public class ToCreateAccTest extends BaseClass {
	
	
	@Test(priority = 0,retryAnalyzer = com.GenericUtility.RetryImplclass.class)
	public void ToCreateAccTest() throws Throwable {
		
	
		
		
		UserModuleHomePage hp=new UserModuleHomePage(driver);
		UserLogInPage  lp=new UserLogInPage(driver);
		
		driver.get(putil.getpropertiesFileData("UserUrl"));
		
		
		String username=eutil.ReadDataFromExcelFile("CreateAccount", 1, 0);
		String emailId=eutil.ReadDataFromExcelFile("CreateAccount", 1, 1);
		String Contactnum=eutil.ReadDataFromExcelFile("CreateAccount", 1, 2);
		String password=eutil.ReadDataFromExcelFile("CreateAccount", 1, 3);
		String Confirmpassword=eutil.ReadDataFromExcelFile("CreateAccount", 1, 4);
		
		int newNumber=jutil.getRandomNo(1000);
		hp.getLoginButton().click();
		

		lp.getUsernameTextField().sendKeys(username);
		lp.getEmailIdTextField().sendKeys(newNumber+emailId);
		lp.getContactNoTextField().sendKeys(Contactnum);
		lp.getPasswordTextField().sendKeys(password);
		lp.getConfirmPasswordTextField().sendKeys(Confirmpassword);
		lp.getSubmitButton().click();
		
		
		wutil.AcceptAlert(driver);
		
		lp.getEmailId_SignInTextFiled().sendKeys(newNumber+emailId);
		lp.getPasswordTextfiledSignIn().sendKeys(password);
		lp.getLoginButton().click();
		
		
	}

	
		
		
		
		
	

}
