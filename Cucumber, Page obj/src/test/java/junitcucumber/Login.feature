Feature: Test login page

  Scenario: Test moving letter to Spam
    Given I am on main application page
    Given I login as correct user
    Given I wait while canvas loading
    When I select checkbox of the latter
    When I get title of the selected latter
    When I click on spam button
    Then I see moved to spam message
    
  Scenario: Test moving letter from Spam
    Given I click on Spam left side button
    When I select latter checkbox
    When I click on Not Spam button
    Then I see moved ouf of spam message
    
    Scenario: Test send mail to the group of people
    Given I click on Compose Letter button
    When I enter To recipient
    When I enter CC recipients
    When I enter subject
    When I enter message
    When I click on send button
    Then I see success message
    
    Scenario: Test flagging mails
    Given I click on Inbox menu
    When I select 3 mail checkboxes
    When I mark mails with a flag
    Then I see flag is displayed
    
    Scenario: Test unflagging mails
    When I click on More button and unflag mails
    Then I see flag is not displayed
    
    
    
    
    