Feature: TestAddressBook  Signup Feature 

#Data driven using Maps
Scenario: testaddressbook signup test 

	Given user is already on sign up page 
	When title of the page is signup	
	Then user provides email and password
		|email | password |
		| hellotest4@gmail.com | hello123 |
	Then user clicks on signup button 
	And user is on TestAddressBook home page
	
	
	
	