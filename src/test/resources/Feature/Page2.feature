Feature: To search Hotel based on user needs

 Scenario: To search hotel after all the mantatory fields where filled
    Given User should select location of the hotel
    When User should select name of the hotel
    When User should select number of rooms and types
    When User should select In and Out date as per requirements
    When User should select number of persons will stay in the room
    Then Finally the user can search the hotel