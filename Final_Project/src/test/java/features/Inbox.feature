Feature: Test inbox page
@All_Tests
@InboxPage_Tests

Scenario: delete mail
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I select mail checkbox
    When I click on Delete button
    Then I wait for OK notification
@All_Tests
@InboxPage_Tests
Scenario: archive mail
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I select mail checkbox
    When I click on Archive button
    Then I wait for OK notification
@All_Tests
@InboxPage_Tests
Scenario: send message to spam
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I select mail checkbox
    When I click on spam button
    Then I wait for OK notification
@All_Tests
@InboxPage_Tests
Scenario: flagging mail
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I select mail checkbox
    When I mark mail with a flag
    Then I see flag is displayed
@All_Tests
@InboxPage_Tests  
 Scenario: filter by flagged mails
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I click filter by flags button
    Then I see flag is displayed  
