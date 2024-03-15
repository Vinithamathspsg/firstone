package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass1 extends BaseClass {
	
	public PageClass1() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login']")
	private WebElement login;
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	

}


