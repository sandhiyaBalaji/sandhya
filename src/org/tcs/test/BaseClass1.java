package org.tcs.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1{
	static WebDriver driver;
	
	
	
	 static JavascriptExecutor jk=(JavascriptExecutor)driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
			}
	public static void url(String url) {
		driver.get(url);
	}
	public static void type(WebElement e,String name) {
		e.sendKeys(name);
	}
	public static void btnclick(WebElement e) {
		e.click();
			}
	public static void rightclick(WebElement e) {
		Actions acc=new Actions(driver);
		acc.contextClick(e).perform();
	}
	public static void doubleClick(WebElement e) {
		Actions acc=new Actions(driver);
		acc.doubleClick(e).perform();
		
	}
	public static void key(int a) throws AWTException {
		Robot r1=new Robot();
		r1.keyPress(a);
		r1.keyRelease(a);
				
	}
	public static void alert() {
	org.openqa.selenium.Alert a1=driver.switchTo().alert();
	a1.accept();
	}
	
	public static void scrollDown( WebElement e) {
		jk.executeScript("arguments[0].scrollIntoView(true)", e);
		
			}
	public static void isMultiple(Select s) {
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	public static void selectIndex(Select s,int x) {
		s.selectByIndex(x);
		
	}
	public static void selectValue(Select s,String x) {
		s.selectByValue(x);
		
	}
	public static void selectText(Select s,String x) {
		s.selectByVisibleText(x);
		
	}
	public static void selectAll(Select s,List<WebElement> list) {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int a=allSelectedOptions.size();
		for(int i=0;i<a;i++) {
			WebElement element = list.get(i);
			String t=element.getText();
			System.out.println(t);
			s.selectByVisibleText(t);
		}
	}
		public static void printAll(Select s,List<WebElement> list,int size) {
			for(int i=0;i<size;i++) {
				WebElement element = list.get(i);
				String t=element.getText();
				System.out.println(t);
				s.selectByVisibleText(t);
					
		}
	}
		public static void deselectIndex(Select s,int index){
		s.deselectByIndex(index);
		}
		public static void deselectAll(Select s) {
			s.deselectAll();

		}
	public static void quitBrowser() {
		driver.quit();
	}
}