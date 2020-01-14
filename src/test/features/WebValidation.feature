@active
Feature: Create a new design

  Scenario Outline: As USER I want be able to create a new design

    Given I open "<browser for test>" browser
    And I open "Login" page
    When I login
    Then I validate that the "User menu" present


    Examples:
      | browser for test |
      | Chrome           |