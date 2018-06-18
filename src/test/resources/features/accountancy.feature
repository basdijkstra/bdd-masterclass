@accountancy
Feature: Account management
	As a user of the online SaaS accountancy software
	I want to add and remove accounts for organizations
	So I can manage their subscriptions according to their demands

    Scenario: a new account can be created
        Given I am on the organization page for MyNewOrg
		And no accounts exist for MyNewOrg
	    When I import financial data for MyNewOrg
	    Then the account MyNewAccount exists for MyNewOrg

    Scenario: an existing account can be renamed
	    Given I am on the organization page for AnotherNewOrg
		And the account MyNewAccount exists for MyNewOrg
		And the account MyRenamedAccount does not exist for MyNewOrg
	    When I rename the MyNewAccount account to MyRenamedAccount
	    Then the account MyRenamedAccount exists for MyNewOrg
	    And the account MyNewAccount does not exist for MyNewOrg

    Scenario: an existing account can be deleted
	    Given I am on the organization page for MyNewOrg
		And the account MyRenamedAccount exists for MyNewOrg
	    When I delete the MyRenamedAccount account
	    Then the account MyRenamedAccount does not exist for MyNewOrg