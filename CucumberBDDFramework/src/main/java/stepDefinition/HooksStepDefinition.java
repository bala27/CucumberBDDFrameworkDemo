package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {

	//global hook
	@Before
	public void invoke() {
		System.out.println("Browser launched");
	}
	
	@After
	public void teardown() {
		System.out.println("Broser closed");
	}
	
	//tagged hooks - specific to particular scenario
	@Before("@First")
	public void first_invoke() {
		System.out.println("----Before first method----");
	}
	
	@After("@First")
	public void first_teardown() {
		System.out.println("----After first method----");
	}
	
	@Before("@Second")
	public void second_invoke() {
		System.out.println("----Before second method----");
	}
	
	@After("@Second")
	public void second_teardown() {
		System.out.println("----After second method----");
	}
	
	@Given("^user is on Address page$")
	public void user_is_on_Address_page() throws Throwable {
	    System.out.println("user is on Address page");
	}

	@When("^user fills address details$")
	public void user_fills_address_details() throws Throwable {
		System.out.println("user fills address details");
	}

	@Then("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
		System.out.println("user click on add button");
	}
	

	@Given("^user selects the address$")
	public void user_selects_the_address() throws Throwable {
	    System.out.println("user selects the address");
	}

	@When("^user click on delete button$")
	public void user_click_on_delete_button() throws Throwable {
		System.out.println("user click on delete button");
	}

	
}
