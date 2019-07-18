package org.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Child extends BaseClass1{
	public static void main(String[] args) {
		getDriver();
		url("https://www.facebook.com/");
		WebElement user =driver.findElement(By.id("email"));
		type(user,"sandhya");
		WebElement pass=driver.findElement(By.id("pass"));
		type(pass,"Meditation@1");
		WebElement btn=driver.findElement(By.id("u_0_2"));
		btn.click();
		
	}

}
