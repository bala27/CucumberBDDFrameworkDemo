Feature: OpenCart Login Feature

##################################################################
#Data driven with Example keyword
###########################################
#Scenario Outline: OpenCart login test

#Given user is already on login page
#When title of the login page is OpenCart
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user enters pin "<pin>"
#Then user clicks on continue button
#And user is on home page

#2nd record is not valid so step 8 will fail
#Examples:
#|username|password|pin|
#|happytest123@gmail.com|hello123|1254|


##################################################################
#Data driven without Example keyword
###########################################
#Scenario: OpenCart login test

#Given user is already on login page
#When title of the login page is OpenCart
#Then user enters "appytest123@gmail.com" and "hello123"
#Then user clicks on login button
#Then user enters "1254"
#Then user clicks on continue button
#And user is on home page

#################################################################
#Data driven using data table
#########################################


Scenario: OpenCart login test

Given user is already on login page
When title of the login page is OpenCart
Then user enters username and password
| opencarttest121@gmail.com | hello123 |
Then user clicks on login button
Then user enters pin
|1254|
Then user clicks on continue button
#And user is on home page