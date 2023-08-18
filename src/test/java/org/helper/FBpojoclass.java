package org.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBpojoclass extends LibGlobal{
	
	public FBpojoclass() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotbtn;
	@FindBy(xpath="//input[@autofocus='1']")
	private WebElement textemail;
	@FindBy(id="did_submit")
	private WebElement searchbtn;
	
	
	public WebElement getForgotbtn() {
		return forgotbtn;
	}
	public WebElement getTextemail() {
		return textemail;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}

}
