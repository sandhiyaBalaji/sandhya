package org.tcs.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\eclipse-workspace\\Day1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,snapdeal");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement btn=driver.findElement(By.xpath("(//div[text()='Lenovo Ideapad 330 (AMD A6 - 9225/4 GB RAM/1 TB HDD/39.62 cm (15.6 Inch)/DOS) 81D6007JIN (Onyx Black , 2.2 Kg)'])[1]"));
		
			btn.click();
			String parent = driver.getWindowHandle();
			Set<String> all = driver.getWindowHandles();
			System.out.println(parent+"\n"+all);
			for(String x:all) {
				if(!x.equals(parent)) {
					driver.switchTo().window(x);
				}
			}
			WebElement addCart=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
			addCart.click();
	}
}
