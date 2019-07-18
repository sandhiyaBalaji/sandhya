package org.tcs.test;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Child2 extends BaseClass1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		getDriver();
		url(" https://netbanking.canarabank.in/entry/ENULogin.jsp");
	//	WebElement user =driver.findElement(By.id("email"));
		//type(user,"sandhya");
		//WebElement pass=driver.findElement(By.id("pass"));
		//type(pass,"Meditation@1");
		WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		
		//WebElement btn=driver.findElement(By.xpath("//button[@id='u_0_15']"));
		//rightclick(btn);

//WebElement btn1=driver.findElement(By.xpath("//button[@id='u_0_15']"));
//doubleClick(btn1);
//key(KeyEvent.VK_2);
//key(KeyEvent.VK_0);
alert();




WebElement scrldwn=driver.findElement(By.xpath("//a[text()='Help']"));
scrollDown(scrldwn);

}
}