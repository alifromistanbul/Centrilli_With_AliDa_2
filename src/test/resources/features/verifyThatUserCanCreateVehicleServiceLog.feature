@CENT10-322
Feature: verify that user can create new Vehicle Service Logs

  Background: user is expected to be login and go to vehicle service logs page
    Given user is on the posmanager homepage
    Given user clicks the More button
    Then user clicks the Fleet button
    And user clicks the Vehicle Service Logs Button
    Then user checks the total vehicle number


  @CENT10-260
  Scenario:
    Given user clicks the More button
    Then user clicks the Fleet button
    And user clicks the Vehicle Service Logs Button
    Then user checks the total vehicle number
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    And user chooses service type as Summer tires
    Then user inputs "23.000" as total price
    And user clicks save button
    Then user sees Audi/A1/ - Odoo as title
    Given user clicks Vehicle Service Logs link
    Then user checks the total vehicle number more than before

  @CENT10-316
  Scenario:
     Given user clicks the create button
     And  user clicks save button without selecting vehicle
     Then user should see The following fields are invalid warning message

  @CENT10-317
  Scenario:
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    And user chooses service type as Summer tires
    Then user inputs "23.000" as total price
    And user clicks save button
    Then user sees Audi/A1/ - Odoo as title

  @CENT10-318
  Scenario:
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    Then user clicks Discard button
    And user sees warning to discard
    Then user clicks Ok for the warning message
    And user goes back to Vehicle Service Logs page
    Then user checks the total vehicle number

    @CENT10-319
    Scenario:
      Given user clicks the create button
      When user chooses Audi/A1/ as vehicle
      And user chooses service type as Summer tires
      Then user inputs "23.000" as total price
      And user clicks save button
      And user sees Attachment button
      Then user sees Action button

    @CENT10-320
    Scenario:
      Given user clicks the create button
      When user chooses Audi/A1/ as vehicle
      And user chooses service type as Summer tires
      Then user inputs "23.000" as total price
      And user clicks save button
      Then user sees Audi/A1/ - Odoo as title
      Given user clicks the Vehicle Service Logs Button
      Then user inputs Audi/A1/ to the search box
      And user goes to the last page of the list
      And user sees the new created Audi/A1/ on the screen displayed

      @CENT10-321
      Scenario: Verify that user can change Service Logs display to Kanban / List / Graph
        Given  user clicks the Kanban button
        When user checks if it is a Kanban page
        And  user clicks the graph button
        Then user checks if it is a graph page
        Then user clicks the List button
        Then user checks if it is a list page





