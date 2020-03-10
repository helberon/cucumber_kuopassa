Feature: Purchase items feature

  @debug
  Scenario: I want to verify that after purchasing some item this item was added to shopping cart
    Given I am on main page
    When I buy 'Red Duck'
    And go to shopping cart
    Then I see that item present in table