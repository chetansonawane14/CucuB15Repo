Feature: Facebook login1
As a fb user, I want to enter username and password as a parameter

Scenario: validate fb login scenario11
Given the user is on facebook login Page
When he enters "chetan" as user name
And he enters "pwd" as password
Then check username is present in textbox