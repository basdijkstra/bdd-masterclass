package stepdefinitions;

import cucumber.api.java.en.*;

public class RotterdamSteps {

	@Given("^John is on the Rotterdam.nl home page$")
	public void john_is_on_the_rotterdam_nl_home_page() {

		System.out.println("GIVEN John is on the Rotterdam.nl home page");
	}

	@When("^he searches for parking info using the search widget$")
	public void when_he_searches_for_parking_info_using_the_search_widget() {

		System.out.println("WHEN he searches for parking info using the search widget");
	}

	@Then("^he sees a link to information about (.*)$")
	public void he_sees_a_link_to_information_about(String description) {

		System.out.println(String.format("THEN he sees a link to information about %s", description));
	}
}
