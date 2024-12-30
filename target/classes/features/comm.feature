@Commercial
Feature: Commercial Functional Testing

  Background:
  Given User is in the No Broker website
  When User clicks on the Commercial button
  And user is on the Commercial Page

  #Testing visibility
  @UI_Test
  Scenario: Testing UI for Commercial page
    Then User can see location field
    And User can see localities or landmark field
    And User can see Rent button
    And User can see Buy button
    And User can see search button
    And User can see post free property ad   
    

  @Valid_Input_Test
  Scenario: Testing commercial with valid inputs
    When User enter dropdown button
    And User enter location 
    And User enter any three locality
    | SortBy.xlsx |
    And User select rent option
    And User enters property type
    And user select any one property
    And User enter search button
    Then User navigate to next page
 
  @metro_option_test
  Scenario: Testing commercial metro option
    When User enter dropdown button
    And User enter location 
    And User enter any three locality
    | SortBy.xlsx |
    And User select rent option
    And User enters property type
    And user select any one property
    And User enter search button
    And User navigate to next page
    And User select metro option
    And User select metro line
    And User select metro station
    And User select search button
    Then User navigate to maps page
    

  @Button_Test
  Scenario: Testing search button 
    When User enter dropdown button
    And User enter location 
    And User enter any three locality
    | SortBy.xlsx |
    And User select rent option
    And User enters property type
    And user select any one property
    And User enter search button
    Then User navigate to next page
    
  @invalid_input_test
  Scenario: Testing commercial with invalid inputs
    When User enter dropdown button
    And User enter location 
    And User select rent option
    And User enters property type
    And user select any one property
    And User enter search button
    Then User will not navigate to next page

  @multiple_Input_Test
  Scenario Outline: Testing for Different Locations
    When User enter dropdown button
    When User enter location 
    And User enter any three localities "<local>"
    And User select rent option
    And User enters property type
    And user select any one property
    And User enter search button
    Then User navigate to next page
    


  Examples:
       | local  |
       |   11   |
       |   12   |
    
    
