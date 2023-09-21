Feature: Login feature

 Scenario Outline: Test Login with valid credentials

	Given User navigates to login page
	When User enters username and password
	And  Click on login button
	Then User is navigate to Homepage