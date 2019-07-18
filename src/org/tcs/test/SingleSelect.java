package org.tcs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		boolean b = s.isMultiple();
		System.out.println(b);
		List<WebElement> list = s.getOptions();
		int size = list.size();
		System.out.println(size);
		//s.selectByIndex(8);
		//s.selectByValue("18");
		s.selectByVisibleText("29");
		
		
		
	}
}
