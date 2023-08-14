Feature: Country Multi Scenario

  Background:  # before senaryo her senaryofan önce çalışacak
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page

  Scenario: Create country
    When create a country
    Then Success message should be displayed

  Scenario: Create a country 2
    When create a country name as "yasintufan12" code as "tufan12"
    Then Success message should be displayed