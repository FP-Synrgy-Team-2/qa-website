Feature: Account info feature on Homepage of Jangkau by BCA

  As a user of Jangkau by BCA
  I want to be able to see my account information
  So that I can my account number and balance

  Background:
    Given User is on the Login Page
    And User input credentials with username "Johndoe123" and password "Johndoe123!"
    When User click login button
    Then User redirected to homepage with correct account number "403956851440"

  Scenario: User can hide their account balance
    Given User is on the Home Page
    When User click hide balance
    Then User account balance is hidden
    When User click show balance
    Then User account balance is displayed