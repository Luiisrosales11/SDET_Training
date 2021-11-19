Feature: Login and go to admin menu
	Scenario: Login to OrangeHRP Application
		Given I am in orangeHRP Application
		When Login to Application
		Then Dashboard page is available
		And Click on Admin menu