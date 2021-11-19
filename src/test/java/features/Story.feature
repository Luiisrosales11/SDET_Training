Feature: Search
	Scenario: Google search for Selenium
		Given user should launch browser
		And user goto google website
		When user search for the "selenium"
		Then page title should have "selenium"
		And close the browser