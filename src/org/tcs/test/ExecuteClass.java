package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ExecuteClass extends BaseClass1 {
public static void main(String[] args) {
	WebDriver driver=getDriver();
	url("https://adactin.com/HotelApp/index.php");
	SamplePOM page=new SamplePOM();
	type(page.getTxtUserName(),"sandhiya1234");
	type(page.getTxtPassword(),"Meditation@1");
	btnclick(page.getBtnLogin());
	SecondPage page2=new SecondPage();

	type(page2.getLocation1(),"sandhiya1234");
	Select s=new Select(location1);
s.selectByIndex(3);
	quitBrowser();
	
	
	
}
}
