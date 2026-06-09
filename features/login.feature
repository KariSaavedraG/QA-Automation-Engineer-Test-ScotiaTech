Feature: Login functionality

Scenario: Successful login with valid credentials
Given the user is on the SauceDemo login page
When the user enters username "standard_user"
And the user enters password "secret_sauce"
And clicks the login button
Then the products page should be displayed

Scenario: Login with locked out user
Given the user is on the SauceDemo login page
When the user enters username "locked_out_user"
And the user enters password "secret_sauce"
And clicks the login button
Then an error message should be displayed
