package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass3 extends BaseClass {

	public PageClass3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='radiobutton_0']")
	public WebElement hotelSelect;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	public WebElement continues;
	
	public WebElement getHotelSelect() {
		return hotelSelect;
	}
	
	public WebElement getContinues() {
		return continues;
	}
	
}
