
@tag
Feature: Checkout
  @tag1
  Scenario: Completing checkout
    Given I launch chrome browser
    And I go to "https://cornerstone-light-demo.mybigcommerce.com"
    When I Search for a product called "Oak Cheese Grater"
    When I Add the product to cart
    When I click on checkout 
    And  I enter my email"random email"
    And check the checkbox
    When I click continue as guest button
    And enter my details
    And enter my payment info
    And click on place order button
    Then I see order confirmation page"Thank you john!"
    And I close browser
    
   

  
