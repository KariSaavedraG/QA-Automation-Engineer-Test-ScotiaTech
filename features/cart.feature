Feature: Shopping cart functionality

  Scenario: Add product to shopping cart
    Given the user is logged into SauceDemo
    When the user selects a product
    And clicks Add to Cart
    And opens the shopping cart
    Then the product should appear in the cart
    And the cart badge should display quantity 1
