Feature: Login feature

 Scenario Outline: Test Login with valid credentials

	Given Navigates to login page
	When Enters username and password
	And  Click login button
	Then Navigate to Homepage