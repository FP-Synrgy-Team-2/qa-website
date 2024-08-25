Feature: Transfer feature for registered Jangkau by BCA user to existing account

  As a user of Jangkau by BCA
  I want to be able to transfer my money to another account existed
  So that I can send money quickly and securely

  Background:
    Given User is on the Login Page
    And User input credentials with username "Johndoe123" and password "Johndoe123!"
    When User click login button
    Then User redirected to homepage with correct account number "403956851440"
    When User click the Transfer Page menu
    Then User redirected to the Transfer Page

  Scenario: User successfully transfer to a registered BCA account
    Given User is on the Transfer Page
    And User choose existing account
    And User input nominal "10000" and catatan "Transfer 10000"
    And User click lanjutkan
    And User click kirim
    And User fill PIN with "135797"
    When User click kirim PIN
    Then User redirected to Receipt Page

  Scenario: User cannot transfer if the transfer nominal not filled
    Given User is on the Transfer Page
    And User choose existing account
    And User input nominal " " and catatan "Transfer kosong"
    When User click lanjutkan
    Then Page occur nominal transfer handler

  Scenario: User cannot transfer if the transfer nominal is below the minimum 1000
    Given User is on the Transfer Page
    And User choose existing account
    And User input nominal "999" and catatan "Transfer 999"
    When User click lanjutkan
    Then Page occur minimum transfer handler

  Scenario: User cannot transfer if the account balance is not enough
    Given User is on the Transfer Page
    And User choose existing account
    And User input nominal "9999999" and catatan "Transfer 9999999"
    When User click lanjutkan
    Then Page occur saldo transfer handler

  Scenario: User cannot transfer if the notes character more than 25 characters
    Given User is on the Transfer Page
    And User choose existing account
    And User input nominal "1000" and catatan "This testing notes contains more than 25 characters"
    When User click lanjutkan
    Then Page occur maximum catatan handler