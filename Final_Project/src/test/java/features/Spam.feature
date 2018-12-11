 Feature: Test spam page
 @All_Tests
 @SpamPage_Tests
 
  Scenario: Test moving letter from Spam
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I click on Spam left side button
    When I select mail checkbox
    When I click on Not Spam button
    Then I wait for OK notification