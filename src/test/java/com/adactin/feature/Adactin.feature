Feature: Login functionality of adactin application

Scenario: User enters valid username and password
    Given User launch url of adactin application
    When User enters "SowmiyaSri" as username
    And User enters "Sowmiya05" as password
    And User click login button
    Then User validate login button
    
Scenario: User searches hotel and fill the form
    When User selects Location
    And User selects Hotel
    And User selects Room type
    And User selects number of Rooms
    And User clears the check in date
    And User clears the check out date
    And User selects Adults per room
    And User selects childrens per room
    And User clicks search button
    Then User validate search button
    
Scenario: User selects the hotel
    When User clicks the radio button
    And User clicks the continue button 
    Then User validate the continue button
    
 
Scenario: User books the hotel
    When User enters "Padma" as firstname
    And User enters "Priya" as lastname
    And user enters "1/719,Vasan Nagar,Tiruchirappalli." as Billing address
    And User enters "1234567887654321" as Credit card number
    And User selects credit card type
    And User selects expiry month
    And User selects expiry year
    And User enters "1234" as CVV number
    And User clicks Book now button
    Then User validate Book now button