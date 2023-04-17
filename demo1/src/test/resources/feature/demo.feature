Feature: Parabank Demo

Scenario: Parabank_Register


Given open "Orange" webpage
When User enters "Username" at login page
And User gives "Password" at login page
And User click login button at login page
Then "Expected" webpage opened successfully
