Feature: About us footer block

  @debug
  Scenario: I want to verify that on About Us page displayed correct text
    Given I am on main page
    When I go to About Us page
    Then I see correct text