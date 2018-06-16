@telecom
Feature: Status changes on existing subscriptions
	As a telecom client
	I want to be able to change the status of my subscription
	So I can adjust it to fit my present needs

	Background:
		Given Susan has a basic subscription
		And the subscription status is active

	Scenario: An existing subscription can be cancelled
		When she cancels the subscription
		Then the subscription status is canceling

	Scenario: An existing subscription can be upgraded
		When she upgrades the subscription to premium
		Then Susan henceforth has a premium subscription
		And the resulting subscription status is active
		And the monthly installment is 25 euro

	Scenario: An existing subscription is automatically renewed
		When a year has passed
		Then the resulting subscription status is active
		And the end date is another year in the future
