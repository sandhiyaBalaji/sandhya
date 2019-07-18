package org.tcs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement day=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(day);
		boolean b = s.isMultiple();
		System.out.println(b);
		List<WebElement> list = s.getOptions();
		int size = list.size();
		System.out.println(size);
		s.selectByIndex(4);
		s.selectByVisibleText("Navigation Commands");
		
		//to select all options from DD
		for(int i=0;i<3;i++) {
		WebElement element = list.get(i);
		String t=element.getText();
		System.out.println(t);
		s.selectByVisibleText(t);
		//}
	}
		//to print all selected options
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int a=allSelectedOptions.size();
		for(int i=0;i<a;i++) {
			WebElement element = list.get(i);
			String t=element.getText();
			System.out.println(t);
			s.selectByVisibleText(t);
		}
		s.deselectByIndex(2);
		s.deselectByVisibleText("Navigation Commands");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
}
	
	
}
