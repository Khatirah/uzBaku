@Regression
Feature: Fourstay login with invalid credentials 

1. As a Guest, I should see login button disabled when I enter incorrect email format
2. As a Guest, I should see login button disabled when I enter blank email
3. As a Guest, I should see login button disabled when I enter blank password
4. As a Guest, I should be able to see an error message when I try to login with a wrong email
5. As a Guest, I should be able to see an error message when I try to login with a wrong pass
6. As a Host, I should be able to see an error message when I try to login with wrong email
7. As a Host, I should be able to see an error message when I try to login with a wrong pass


@Smoke @homepage
Scenario: Guest-LoginButton Disabled with incorrect email format 
	Given I am on FourStay homepage 
	Then I click Login Link 
	When I enter email "khato.lalu#me.com" and password "Kamila1" 
	Then Login button should be disabled 
	
Scenario: Guest-LoginButton Disabled with blank email 
	Given I am on FourStay homepage 
	Then I click Login Link 
	When I enter email "" and password "Kamila1" 
	Then Login button should be disabled 
	
Scenario: Guest-LoginButton Disabled with blank password 
	Given I am on FourStay homepage 
	Then I click Login Link 
	When I enter email "khato.lalu@me.com" and password "" 
	Then Login button should be disabled 
	
	
	
@Test 
Scenario: Guest-error message with wrong email 
	Given I am on FourStay homepage 
	Then I click Login Link 
	When I login with email "khato.lalu@yahoo" and password "Kamila1" 
	Then I should see "Something went wrong" message 
	
	