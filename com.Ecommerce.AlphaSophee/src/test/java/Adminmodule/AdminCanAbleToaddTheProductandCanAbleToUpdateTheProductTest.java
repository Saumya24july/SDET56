package Adminmodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Ecommerce.Alphasophee.ObjectRepository.AdminSignInpage;
import com.Ecommerce.Alphasophee.ObjectRepository.ShoppingPortalDetailsPage;
import com.GenericUtility.BaseClass;
import com.GenericUtility.DataBaseUtility;
import com.GenericUtility.ExcelFileUtility;
import com.GenericUtility.IpathConstant;
import com.GenericUtility.JaavUtility;
import com.GenericUtility.PropertiesFileutility;
import com.GenericUtility.WebDriverUtility;

public class AdminCanAbleToaddTheProductandCanAbleToUpdateTheProductTest extends BaseClass {

	@Test

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

}
