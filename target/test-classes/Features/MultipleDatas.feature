Feature: To Check Multiple Scenario of Facebook Login Function

  Scenario Outline: 
    User Enter Multiple Datas To Check Login Function Through EdgeBrowser

    When User Have Enter "<email>" and "<password>" to Check
    And User Have click the Login button
    Then User Have Invalid Credential Page

    Examples: 
      | email                 | password    |
      | Selenium123@gmail.com | Selenium123 |
      | Java123@gmail.com     | Java123     |
      | Python123@gmail.com   | Python123   |
      | Jenkins123@gmail.com  | Jenkins123  |
      | Vishnu123@gmail.com   | Vishnu123   |
