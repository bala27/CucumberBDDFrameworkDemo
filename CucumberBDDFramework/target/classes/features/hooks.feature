Feature: OpenCart Application testing 

@First
Scenario: Adding Address 

	Given user is on Address page 
	When user fills address details 
	Then user click on add button 
	
@Second	
Scenario: Remove Address
	Given user is on Address page 
	When user selects the address
	Then user click on delete button	
	
	
	