
@tag
Feature: ProuctAdd
 
  @tag1
  Scenario: Adding product to cart
    Given I launch chrome browser
    And I go to "https://cornerstone-light-demo.mybigcommerce.com"
    When I Search for a product called "Oak Cheese Grater"
    When I Add the product to cart
    When I click on checkout 
    Then Page Title should be "Cornerstone Demo"


