Feature: login to prestashop 

@testingTech
Scenario: verify user name and last name 
Given the user is on the login page 
When the user logs in using username "nitoyey@dumoac.net" and password "password"
Then users full name "ibadat" "kyzy" should be displayed

Scenario Outline: Login with diff usernames
Given the user is on the login page 
When the user logs in using "<username>" and "<password >"
