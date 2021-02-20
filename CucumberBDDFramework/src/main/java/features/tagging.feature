Feature: TestAddressBook  application testing


@Smoke
Scenario: login with correct username and correct password
Given This is valid test

@Smoke
Scenario: login with incorrect username and incorrect password
Given This is invalid test

@Regression
Scenario: Register a user
Given This is signup test case

@Smoke @Regression
Scenario: Add address
Given This is add address test case

@Smoke
Scenario: Edit address
Given This is edit address test case

@Smoke @Regression
Scenario: Delete address
Given This is delete address test case

Scenario: logout
Given This is logout test case
	
	
	