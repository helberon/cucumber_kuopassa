Feature: Login on site


  Scenario: I want to see error message when I enter wrong credentials
    Given I am on main page
    When I login to application with username 'login@email.com' and password 'password'
    Then I see error message