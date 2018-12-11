Feature: Test login page
@All_Tests
@LoginPage_Tests

Scenario: login with valid credentials
Given I am on main application page
When I enter valid credentials taken from DB and click Enter
Then I see logout link