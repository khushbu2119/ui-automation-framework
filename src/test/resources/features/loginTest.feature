Feature: Check Login functionality

  @login
  Scenario: Verify Successful login for Standard user
    Given User launch swag lab url
    When User logged into to swag lab website with standard_user and secret_sauce
    Then User navigates to home page
    And User logged out from swag lab website

  @login
  Scenario: Verify Successful login for Visual user
    Given User launch swag lab url
    When User logged into to swag lab website with visual_user and secret_sauce
    Then User navigates to home page
    And User logged out from swag lab website


