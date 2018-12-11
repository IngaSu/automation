Feature: Test compose mail
@All_Tests
@ComposeMailPage_Tests

Scenario: send message
    Given I am on main application page
    When I enter valid credentials taken from DB and click Enter
    When I send message to the group
    Then I am redirected to success message