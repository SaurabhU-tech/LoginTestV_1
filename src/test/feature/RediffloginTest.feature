#https://www.guru99.com/using-cucumber-selenium.html#
Feature: Login page Functionality feature

Scenario Outline: Test Login with credentials
Given user is on login page
When user enter "<username>" and "<password>"
Then user should be able to login
And close the browser

Examples:
	      |username|password|
	      |satishgangwani19|Sati1234|
	      |satishgangwani19|Sati1234|
	      |satishgangwani19|Sati1234|