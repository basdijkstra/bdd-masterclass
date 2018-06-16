package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MortgageSteps {

	@Given("^John is able to finance a mortgage on his own$")
	public void john_is_able_to_finance_a_mortgage_on_his_own() {

		System.out.println("GIVEN John is able to finance a mortgage on his own");
	}

	@Given("^he is on the MoneYou mortgage home page$")
	public void he_is_on_the_moneyou_mortgage_home_page() {

		System.out.println("GIVEN he is on the MoneYou mortgage home page");
	}

	@When("^he completes the mortgage orientation tool$")
	public void he_completes_the_mortgage_orientation_tool() {

		System.out.println("WHEN he completes the mortgage orientation tool");
	}

	@Then("^he sees a message stating that he is eligible for a mortgage$")
	public void he_sees_a_message_stating_that_he_is_eligible_for_a_mortgage() {

		System.out.println("THEN he sees a message stating that he is eligible for a mortgage");
	}
}
