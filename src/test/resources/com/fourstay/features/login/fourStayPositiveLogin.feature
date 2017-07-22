@Regression
Feature: 4Stay login with valid credentials 
	As a Guest, I should be able to log into the system with correct credentials
	As a Host, I should be able to log into the system with correct credentials

Background:
Given I am on FourStay homepage
Then I click Login Link

@Smoke @Test1
Scenario: Guest logs in with correct credentials 
And I enter "guest" credentials
Then I should see "listings reserved by" message

@Smoke
Scenario: Host logs in with correct credentials
And I enter "host" credentials
Then I should see "listings by" message



