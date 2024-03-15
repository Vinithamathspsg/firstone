package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SelectHotelStepClass extends BaseClass {
	
	public static BaseClass b = new BaseClass();
	public static PageClass3 p3 = new PageClass3();
	
	@Given("User should click the hotel which is displayed in the screen")
	public void user_should_click_the_hotel_which_is_displayed_in_the_screen() {
	    try {
	    	PageClass3 p3 = new PageClass3();
			   WebElement hotelSelect = p3.getHotelSelect();
			   hotelSelect.click();
		} catch (Exception e) {
			System.out.println("not clicked");
		}
	}

	@When("User give continous to move on next page")
	public void user_give_continous_to_move_on_next_page() {
	    try {
	    	PageClass3 p3 = new PageClass3();
	    	   WebElement continues = p3.getContinues();
			   continues.click();
			   System.out.println("Hotel selected successfully");
		} catch (Exception e) {
			System.out.println("not clicked");
		}
	}


}
