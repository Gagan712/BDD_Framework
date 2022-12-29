@tag
Feature: User Registration

  @tag1
  Scenario: Register with valid credentials
    Given User launch chrome browser
    When User open URL "https://juice-shop.herokuapp.com/#/register"
    And User click dismiss button
    And User enter email as "aveersingh@gmail.com" and password as "abcdefgh"
    And User enter repeat password as "abcdefgh"
    Then User select the security question
    And User write answer as "rani"
    And User click register

  @tag2
  Scenario: Login with valid credentials
    Given User launch chrome browser2
    When User open login URL "https://juice-shop.herokuapp.com/#/login"
    And User click dismiss button1
    And User enter login email as "aveersingh@gmail.com" and password as "abcdefgh"
    Then User click log in
