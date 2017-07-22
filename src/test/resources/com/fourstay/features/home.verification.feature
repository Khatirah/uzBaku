Feature: Search options 


Scenario: Verify number of beds 
	Given I am on FourStay homepage 
	When I click on the beds dropdown list 
	Then I should see the following dep options: 
	
		| 1 Bed |
		| 2 Beds|
		| 3 Beds|
		| 4 Beds|
		| 5 Beds|
		| 6 Beds|
		| More  |				
		
@homepage
Scenario Outline: Guest-LoginButton Disabled with incorrect email format 
	Given I am on FourStay homepage 
	Then I click Login Link 
	When I enter email "<email>" and password "Kamila1" 
	Then Login button should be disabled 
	
	Examples: 
		| email         |
		| bad email.com |
		| bademail.com@ |
		| @bademail.com |
		| bademail@.com |


		
Scenario: Login negative test 
	Given I am on FourStay homepage 
	And I click Login Link 
	When I enter user information: 
	
		|email            |password| firstName | lastName |
		|khato.lalu@me.com|Kamila1 | Kamila    | Nyla     |
		
	Then I should see "listings reserved by" message
		
 # for this we had to create a class called UserModel, and we use the UserModel list to get the values
 # List<UserModel>users