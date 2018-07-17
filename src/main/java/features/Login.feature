Feature: Free CRM login

Scenario: Checking the login functionality of FreeCRM

Given 	When User is already on Login Page
When  	the title of page is Free CRM
And  	User enters username and password
And 	User clicks on login button
Then 	Login should be successful 
Then 	User closes the browser
Then    Close the program
Then    done with cucumber

  


