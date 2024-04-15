package Adminmodule;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtility.ExcelFileUtility;

public class newclassTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ExcelFileUtility fs=new ExcelFileUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		HashMap<String, String> map = fs.readmulipleData("Sheet4", 0);
		
		
       for(Entry<String, String> m:map.entrySet())
       {
    	   driver.findElement(By.xpath(m.getKey())).sendKeys(m.getValue());
       }
		
}
}