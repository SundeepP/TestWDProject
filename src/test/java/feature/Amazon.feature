Feature: UserValidation 

Scenario: Authenticate user login before purchase the product 
Given user naviagates to amazon "https://www.amazon.co.uk"
When user search for "iPhone 13 pro max"
And Select all "apple iPhone 13 pro max" with "4 & up" star rating
And Select "I phone" with the lowest price
And add to trolly
And verify the product price
When proceeds to check out
Then Verify user gets navigated to SignIn page 
