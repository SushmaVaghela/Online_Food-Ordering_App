Feature: Pizza Hut Order Flow

@smoke
Scenario Outline: Validate Pizzahut pizza order flow

    Given User launch Pizzahut application with "<URL>"
    When User wait for auto location black pop up screen
    Then User close the pop up screen
    And User see pop up for Collect From Store
    And User see textbox to enter the location
    Then User type address as "<Location>"
    
    
    
    Examples:
      | URL                         | Location 			|
      | https://www.pizzahut.co.in/ | Lulu mall Bengaluru |