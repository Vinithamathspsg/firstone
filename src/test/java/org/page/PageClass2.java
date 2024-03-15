package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass2 extends BaseClass {

	public PageClass2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//select[@name='location']")
	private WebElement location;
	
	@FindBy(how=How.XPATH,using="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(how=How.XPATH,using="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(how=How.XPATH,using="//select[@id='room_nos']")
	private WebElement numRooms;
	
	@FindBy(how=How.XPATH,using="//input[@id='datepick_in']")
	private WebElement dateIn;
	
	@FindBy(how=How.XPATH,using="//input[@id='datepick_out']")
	private WebElement dateOut;
	
	@FindBy(how=How.XPATH,using="//select[@id='adult_room']")
	private WebElement adultRoom;
	
	@FindBy(how=How.XPATH,using="//select[@id='child_room']")
	private WebElement childRooms;
	
	@FindBy(how=How.XPATH,using="//input[@id='Submit']")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getNumRooms() {
		return numRooms;
	}
	
	public WebElement getDateIn() {
		return dateIn;
	}
	
	public WebElement getDateOut() {
		return dateOut;
	}
	
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	
	public WebElement getChildRooms() {
		return childRooms;
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	
	
	
}

