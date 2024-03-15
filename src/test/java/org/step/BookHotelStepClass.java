package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookHotelStepClass extends BaseClass{
	
	public static BaseClass b = new BaseClass();
	public static PageClass4 p4 = new PageClass4();
	
	@Given("User should give the name and address")
	public void user_should_give_the_name_and_address() {
	    try {
	    	Thread.sleep(2000);
	    PageClass4 p4 = new PageClass4();
			WebElement firstName = p4.getFirstName();
			b.textSendByJs(firstName,b.readExcel(7, 3));
			WebElement lastName = p4.getLastName();
			b.textSendByJs(lastName, b.readExcel(7, 4));
			WebElement address = p4.getAddress();
			b.textSendByJava(address, "No:2,Chennai");
		} catch (Exception e) {
			System.out.println("Not entered");
		}
	}

	@When("User should fill the payment details")
	public void user_should_fill_the_payment_details() {
	   try {
		   Thread.sleep(2000);
	   PageClass4 p4 = new PageClass4();
	    WebElement creaditNum = p4.getCreaditNum();
		b.textSendByJava(creaditNum, "1122334455667788");
		WebElement creaditType = p4.getCreaditType();
		b.selectByValue(creaditType, "VISA");
		WebElement expMonth = p4.getExpMonth();
		b.selectByValue(expMonth, "7");
		WebElement expYear = p4.getExpYear();
		b.selectByValue(expYear, "2028");
		WebElement cvvNum = p4.getCvvNum();
		b.textSendByJs(cvvNum, b.readExcel(11, 3));
	} catch (Exception e) {
		System.out.println("Not entered");
	}
	}

	@When("User give the book now option")
	public void user_give_the_book_now_option() {
	   try {
	   PageClass4 p4 = new PageClass4();
	    WebElement bookNow = p4.getBookNow();
		bookNow.click();
		
	} catch (Exception e) {
		System.out.println("Not clicked");
	}
	}

	@Then("User will get the order number")
	public void user_will_get_the_order_number() {
	    try {
	    	Thread.sleep(5000);
	    PageClass4 p4 = new PageClass4();
		  WebElement orderNo = p4.getOrderNo();
		  String attribute = orderNo.getAttribute("value");
		  System.out.println(attribute);
		
		Thread.sleep(5000);
		  WebElement orderNo1 = p4.getOrderNo();
		  b.scrollByJs(orderNo1, "Down");
		
		} catch (Exception e) {
			System.out.println("Not created");
		}
	}


}
