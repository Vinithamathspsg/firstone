package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelStepClass extends BaseClass{

	public static BaseClass b = new BaseClass();
	public static PageClass2 p2 = new PageClass2();
	
	
	@Given("User should select location of the hotel")
	public void user_should_select_location_of_the_hotel() {
	   try {
		   PageClass2 p2 = new PageClass2();
			WebElement location = p2.getLocation();
			b.selectByValue(location, "London");
	} catch (Exception e) {
		System.out.println("not selected");
	}
	}

	@When("User should select name of the hotel")
	public void user_should_select_name_of_the_hotel() {
	    try {
	    	PageClass2 p2 = new PageClass2();
	    	  WebElement hotels = p2.getHotels();
			  b.selectByVisibleText(hotels, "Hotel Sunshine");
		} catch (Exception e) {
			System.out.println("not selected");
		}
	}

	@When("User should select number of rooms and types")
	public void user_should_select_number_of_rooms_and_types() {
	  try {
		  PageClass2 p2 = new PageClass2();
		    WebElement roomType = p2.getRoomType();
			b.selectByVisibleText(roomType, "Deluxe");
			WebElement numRooms = p2.getNumRooms();
			b.selectByValue(numRooms, "1");
	} catch (Exception e) {
		System.out.println("not selected");
	}  
	}

	@When("User should select In and Out date as per requirements")
	public void user_should_select_in_and_out_date_as_per_requirements() {
	    try {
	    	PageClass2 p2 = new PageClass2();
	    	  WebElement dateIn = p2.getDateIn();
			  b.textSendByJava(dateIn, "25/04/2024");
			  WebElement dateOut = p2.getDateOut();
			  b.textSendByJava(dateOut, "27/04/2024");
		} catch (Exception e) {
			System.out.println("not selected");
		}
	}

	@When("User should select number of persons will stay in the room")
	public void user_should_select_number_of_persons_will_stay_in_the_room() {
	    try {
	    	PageClass2 p2 = new PageClass2();
	    	   WebElement adultRoom = p2.getAdultRoom();
			   b.selectByValue(adultRoom, "2");
			   WebElement childRooms = p2.getChildRooms();
			   b.selectByValue(childRooms, "1");
	    	
		} catch (Exception e) {
			System.out.println("not selected");
		}
	}

	@Then("Finally the user can search the hotel")
	public void finally_the_user_can_search_the_hotel() {
	    try {
	    	PageClass2 p2 = new PageClass2();
	    	WebElement search = p2.getSearch();
			search.click();
			System.out.println("Search Hotel successfully");
			
		} catch (Exception e) {
			System.out.println("not selected");
		}
	}

}
