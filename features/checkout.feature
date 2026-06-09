Feature: Checkout functionality

  Scenario: Complete checkout successfully
    Given the user has a product in the shopping cart
    When the user proceeds to checkout
    And enters valid personal information
    And clicks Continue
    And reviews the order information
    And clicks Finish
    Then the order should be completed successfully
    And the confirmation message should be displayed
