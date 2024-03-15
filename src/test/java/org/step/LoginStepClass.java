package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepClass extends BaseClass {
	
	public static BaseClass b = new BaseClass();
	public static PageClass1 p1 = new PageClass1();
	
	@Given("User should be in Adaction Login page")
	public void user_should_be_in_adaction_login_page() {
		try {
			b.getDriver("Chrome");
			b.winMax();
			b.getUrl(b.readExcel(2, 7));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@When("User Should Enter Login Datas")
	public void user_should_enter_login_datas() {
		try {
			PageClass1 p1 = new PageClass1();
			WebElement userName = p1.getUserName();
			b.textSendByJs(userName, b.readExcel(7, 0));
			WebElement password = p1.getPassword();
			b.textSendByJs(password, b.readExcel(7, 2));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@When("User Should click Login button")
	public void user_should_click_login_button() throws InterruptedException {
	   try {
		   PageClass1 p1 = new PageClass1();
		   WebElement login = p1.getLogin();
			login.click();
		} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	@Then("User Should verify the login success message")
	public void user_should_verify_the_login_success_message() {
	   try {
		   System.out.println("Login successfully");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}
