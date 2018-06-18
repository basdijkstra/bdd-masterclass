package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountancySteps {

	@Given("^I am on the organization page for (.*)$")
	public void i_am_on_the_organization_page_for(String organizationName) {

		System.out.println(String.format("GIVEN I am on the organization page for %s", organizationName));
	}

	@Given("^no accounts exist for (.*)$")
	public void no_accounts_exist_for(String organizationName) {

		System.out.println(String.format("GIVEN no accounts exist for %s", organizationName));
	}

	@When("^I import financial data for (.*)$")
	public void i_import_financial_data_for(String organizationName) {

		System.out.println(String.format("WHEN I import financial data for %s", organizationName));
	}

	@When("^I rename the (.*) account to (.*)$")
	public void i_rename_the_account_to(String oldAccountName, String newAccountName) {

		System.out.println(String.format("WHEN I rename the %s account to %s", oldAccountName, newAccountName));
	}

	@When("^I delete the (.*) account$")
	public void i_delete_the_account(String accountName) {

		System.out.println(String.format("WHEN I delete the %s account", accountName));
	}

	@Then("^the account (.*) exists for (.*)$")
	public void the_account_exists_for(String accountName, String organizationName) {

		System.out.println(String.format("THEN the account %s exists for %s", accountName, organizationName));
	}

	@Then("^the account (.*) does not exist for (.*)$")
	public void the_account_does_not_exist_for(String accountName, String organizationName) {

		System.out.println(String.format("THEN the account %s does not exist for %s", accountName, organizationName));
	}
}
