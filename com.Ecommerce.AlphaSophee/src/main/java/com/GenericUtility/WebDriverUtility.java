package com.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public static Robot robot ;
		public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitforPageLoad(WebDriver driver,int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	public void waitforvisiblityOfElement(WebDriver driver,int sec,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitforElementToClickable(WebDriver driver,int sec,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitfortoGetTitle(WebDriver driver,int sec,String title)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.titleIs(title));
	}
	public void DropDownselectIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void DropDownselectByvalue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void DropDownselectByvisibleText(WebElement element,String VisibleText)
	{
		Select select = new Select(element);
		select.selectByVisibleText(VisibleText);
	}
	public void ClickAction(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.click(element).perform();
	}
	public void DoubleClickAction(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void RightClickAction(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	public void MoveToElement(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void DragAndDropBy(WebDriver driver,WebElement element,int x,int y)
	{
		Actions action = new Actions(driver);
		action.dragAndDropBy(element,x,y).perform();
	}
	public void DragAndDrop(WebDriver driver,WebElement sorce,WebElement destination)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(sorce,destination).perform();
	}public void ScrollToElement(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
	}
	public void ScrollByAmount(WebDriver driver,int x,int y)
	{
		Actions action = new Actions(driver);
		action.scrollByAmount(x,y).perform();
	}
	public void Sendkeys(WebDriver driver,WebElement element,String text)
	{
		Actions action = new Actions(driver);
		action.sendKeys(element,text).perform();
	}
	public void keyspress(WebDriver driver,WebElement element,String text)
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	public void switchWindow(WebDriver driver,String title)
	{
		Set<String> window = driver.getWindowHandles();
		
		for(String windowids:window)
		{
			driver.switchTo().window(windowids);
			if(driver.getTitle().contains(title))
			{
				break;
			}
		}
	}
	public  Robot robotKeypress() throws AWTException
	{
		 robot = new Robot();
		
	

		robot.keyPress(KeyEvent.VK_ENTER);
		return robot;
		
	}
	public  Robot robotRelease() throws AWTException
	{
		 robot = new Robot();
		

		robot.keyRelease(KeyEvent.VK_ENTER);
		return robot;
		
	}
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameorId)
	{
		driver.switchTo().frame(nameorId);
	}
	public void switchToFrame(WebDriver driver,WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	public void switchToFrameToMainPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void AcceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void DismisstAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public  static String getScreenshot(WebDriver driver,String ScreenshotName) throws IOException
	{
		JaavUtility jutil=new JaavUtility();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path="./screenshot/"+ScreenshotName+jutil.getSystemDateInFormat()+".png";
		File dst = new File(path);
		String scrpath = dst.getAbsolutePath();
		FileHandler.copy(src, dst);
		return scrpath;
	}
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)","");
	}
	public void scrollBarAction(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
	}
	public void ScrollDownTillBottomofPage(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void ScrollTillElementvisible(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",element);
	}
	public void ClickOnEleemnt(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",element);
	}
	public void JseUsinSendkeys(WebDriver driver,WebElement element,String text)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1]",element,text);
	}
	public void scrollUpTillElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point loc = element.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}


}
