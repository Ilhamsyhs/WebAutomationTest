Feature: Checkout

  Scenario: Checkout item
    Given I Already logged in
    And I Already had "add-to-cart-sauce-labs-backpack" in cart
    And I click on cart button
    When I click checkout
    And I input firstname "ilham"
    And I input lastname "syahrul"
    And I input postal code "12345"
    And I click continue button
    And I click finish button
    Then I successfully checkout item
