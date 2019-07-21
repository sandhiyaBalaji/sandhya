package org.tcs.test;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePOM extends BaseClass1 {
	public SamplePOM() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement txtUserName;
@FindBy(id="password")
private WebElement txtPassword;
@FindBy(xpath="//input[@value='Login']")
private WebElement btnLogin;
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnLogin() {
	return btnLogin;
}



}
