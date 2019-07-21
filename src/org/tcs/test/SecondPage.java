package org.tcs.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SecondPage extends BaseClass1 {

		public SecondPage() {
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(id="location")
	private WebElement location1;

	public WebElement getLocation1() {
		return location1;
	}
	
	//@FindBy(id="password")
	//private WebElement txtPassword;
	//@FindBy(xpath="//input[@value='Login']")
	//private WebElement btnLogin;

	

}
