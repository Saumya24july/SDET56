package Assignament;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone13Price {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/s?k=iphone13&crid=23IW6Z1KHVP1J&sprefix=iphone13%2Caps%2C201&ref=nb_sb_noss_2");

		WebElement Iphone13Price = driver.findElement(By.xpath(
				"//span[contains(@class,'aok-inline-block p')]/ancestor::div[contains(@class,'a-section a-spacing-s') and contains(.,'Apple iPhone 13 ')]/descendant::span[@class='a-price-whole']"));
		
		String Iphone13Pricen = Iphone13Price.getText();
		
		FileInputStream fin = new FileInputStream("./src/test/resources/AlphaShopee.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		
		sheet.getRow(6).getCell(1).setCellValue("Iphone 13");
		sheet.getRow(7).getCell(1).setCellValue(Iphone13Pricen);
		FileOutputStream fout = new FileOutputStream("./src/test/resources/AlphaShopee.xlsx");
		wb.write(fout);
		
	}

}
