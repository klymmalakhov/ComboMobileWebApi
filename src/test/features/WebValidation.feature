@active
Feature: Create a new design

  Scenario Outline: As USER I want be able to create a new design

    Given I open "Login" page in "<browser for test>" browser
    When I login
    Then I validate that the "User menu" present


    Examples:
      | browser for test |
      | Chrome           |