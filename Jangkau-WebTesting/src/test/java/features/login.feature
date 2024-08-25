Feature: Login functionality for Jangkau by BCA Website

  As a user of Jangkau by BCA
  I want to be able to login with my account
  So that I can access my account-related features and manage my money

  Scenario: User successfully login with valid credentials
    Given User is on the Login Page
    And User input credentials with username "Fulan123" and password "Fulan123!"
    When User click login button
    Then User redirected to homepage with correct account number "404938255577"

  Scenario: User failed login with invalid credentials
    Given User is on the Login Page
    And User input credentials with username "fulan123" and password "fulan123!"
    When User click login button
    Then Page occur username and password handler

  Scenario: User can use hide and show password
    Given User is on the Login Page
    And User input credentials with username "Fulan123" and password "Fulan123!"
    When User click show password button
    Then Input password is displayed
    When User click hide password button
    Then Input password is hidden



