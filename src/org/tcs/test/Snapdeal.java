package org.tcs.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		//typecast
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		//Taking a screenshot ina  file format but it is stored file
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc=new File("C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\screenshot//canara.png");
		FileUtils.copyFile(src, desc);
		
		
		
		
		
			}
}
