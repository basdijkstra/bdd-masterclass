@rotterdam
Feature: Municipality of Rotterdam home page functions
	As a visitor to Rotterdam
	I want to see where I can park my car
	So I can plan my trip accordingly

	Scenario: Search for parking information from the homepage
		Given John is on the Rotterdam.nl home page
		When he searches for parking info using the search widget
		Then he sees a link to information about general parking
		And he sees a link to information about paid parking