Feature: Payment function testing
Scenario: As a Smart Banking user, I need to check payment function with valid information

Given Login application
When add valid credit card information
And Click payment button
Then validate payment go successfully