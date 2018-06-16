package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelecomSteps {

	@Given("^Susan has a (.*) subscription$")
	public void susan_has_a_subscription(String subscriptionType) {

		System.out.println(String.format("GIVEN Susan has a %s subscription", subscriptionType));
	}

	@Given("^the subscription status is (.*)$")
	public void the_subscription_status_is(String subscriptionStatus) {

		System.out.println(String.format("GIVEN The subscription status is %s", subscriptionStatus));
	}

	@When("^she cancels the subscription$")
	public void she_cancels_the_subscription() {

		System.out.println("WHEN she cancels the subscription");
	}

	@When("^she upgrades the subscription to (.*)$")
	public void she_upgrades_the_subscription_to(String subscriptionType) {

		System.out.println(String.format("WHEN she upgrades the subscription to %s", subscriptionType));
	}

	@When("^a year has passed$")
	public void a_year_has_passed() {

		System.out.println("WHEN A year has passed");
	}

	@Then("^Susan henceforth has a (.*) subscription$")
	public void susan_henceforth_has_a_subscription(String subscriptionType) {

		System.out.println(String.format("THEN Susan henceforth has a %s subscription", subscriptionType));
	}

	@Then("^the resulting subscription status is (.*)$")
	public void the_resulting_subscription_status_is_remains(String subscriptionStatus) {

		System.out.println(String.format("THEN The resulting subscription status is %s", subscriptionStatus));
	}

	@Then("^the monthly installment is (\\d+) euro$")
	public void the_monthly_installment_is(int amount) {

		System.out.println(String.format("THEN the monthly installment is %d", amount));
	}

	@Then("^the end date is another year in the future$")
	public void the_end_date_is_another_year_in_the_future() {

		System.out.println("THEN The end date is another year in the future");
	}
}
