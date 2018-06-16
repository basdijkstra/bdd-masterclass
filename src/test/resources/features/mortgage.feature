@mortgage
Feature: Mortgage orientation web application
	As a visitor to the MoneYou mortgage page
	I want to complete the mortgage orientation tool
	So I can find out if I'm eligible for a MoneYou mortgage

	Scenario: Single applicant is eligible for a mortgage
		Given John is able to finance a mortgage on his own
		And he is on the MoneYou mortgage home page
		When he completes the mortgage orientation tool
		Then he sees a message stating that he is eligible for a mortgage