@1aFinalTask

Feature: Find product on 1a.lv, add to the cart and buy it.

  Scenario: Open home page, find a product, add to cart
    Given Open home page https://www.1a.lv/
    And Validate that https://www.1a.lv/ is open
    When Enter product name irobot into search and click search button
    And Click on vacuum cleaner category
    And Choose a product and click on it
    And Add it to the cart
    And Submit purchase, set up product price
    And Enter email for purchase
    And Choose collection at office
    And Choose city to collect product
    And Enter name, surname and phone number
    Then Checkout to payment
    And Choose payment by cash
    And Validate final price