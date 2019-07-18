package org.tcs.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://netbanking.canarabank.in/entry/ENULogin.jsp");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
		driver.close();
		
	
	}

}
