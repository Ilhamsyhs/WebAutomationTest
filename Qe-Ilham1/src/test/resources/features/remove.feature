Feature: Remove item

  Scenario: Remove one item
    Given I Already logged in
    And I Already had "add-to-cart-sauce-labs-backpack" in cart
    And I had item "add-to-cart-test.allthethings()-t-shirt-(red)" in cart
    When I click cart icon
    And I click remove button on "remove-test.allthethings()-t-shirt-(red)"
    Then Data should be removed
