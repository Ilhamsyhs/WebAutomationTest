Feature: Filter

  Scenario Outline: Filter items
    Given I Already logged in
    And I Already had "add-to-cart-sauce-labs-backpack" in cart
    When I click sort by "<Filter>"
    Then Item should be filtered by "<Filter>"
    Examples:
      |Filter|
      |Name (Z to A)|