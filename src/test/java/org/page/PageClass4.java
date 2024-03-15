package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass4 extends BaseClass {

	
	public PageClass4() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(how=How.XPATH,using="//input[@id='last_name']")
	public WebElement lastName; 
	
	@FindBy(how=How.XPATH,using="//textarea[@id='address']")
	public WebElement address; 
	
	@FindBy(how=How.XPATH,using="//input[@id='cc_num']")
	public WebElement creaditNum;
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_type']")
	public WebElement creaditType;
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_exp_month']")
	public WebElement expMonth;
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_exp_year']")
	public WebElement expYear;
	
	@FindBy(how=How.XPATH,using="//input[@id='cc_cvv']")
	public WebElement cvvNum;
	
	@FindBy(how=How.XPATH,using="//input[@id='book_now']")
	public WebElement bookNow;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='order_no']")
	public WebElement orderNo;

	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCreaditNum() {
		return creaditNum;
	}
	
	public WebElement getCreaditType() {
		return creaditType;
	}
	
	public WebElement getExpMonth() {
		return expMonth;
	}
	
	public WebElement getExpYear() {
		return expYear;
	}
	
	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	public WebElement getOrderNo() {
		return orderNo;
	}
}
