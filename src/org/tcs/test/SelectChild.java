package org.tcs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectChild extends BaseClass1 {
	public static void main(String[] args) {
		getDriver();
		url("https://www.toolsqa.com/automation-practice-form/");
		WebElement day=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(day);
		List<WebElement> list = s.getOptions();
		int size = list.size();
		isMultiple(s);
		selectIndex(s,4);
		System.out.println(size);
		//selectValue(s,"31");
		//selectText(s,"Day");
		selectAll(s,list);
		printAll(s,list,size);
		deselectIndex(s,4);
		deselectAll(s);
	}
}
