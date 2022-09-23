Feature: Add to cart

  Scenario: Add item to cart
    Given I Already logged in
    When I select item "add-to-cart-test.allthethings()-t-shirt-(red)"
    Then "add-to-cart-test.allthethings()-t-shirt-(red)" should be added to cart







