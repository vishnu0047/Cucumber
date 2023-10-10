Feature: To Checking Login Functionality of Facebook

	@smoke
  Scenario: To Check in UserName and Invalid Password to Login
    When User have enter the Valid Email and Invalid Password
      | UserName | Password   | PhneNo     | Email                 |
      | Arafath  | ara6754321 | 1234563214 | arafa123@gmail.com    |
      | Selenium | 7896541sel | 9632587418 | selenium123@gmail.com |
      | Java     | 9632856jav | 8521478963 | java123@gmail.com     |
    And User Have Click the Login button
    Then User Have Enter Invalid Credential Page

  @smoke
  Scenario: To Check login function UserName and Password
    When User have Enter the Valid Email and Valid Password
      | email    | selenium123@gmail.com |
      | password | 245672sel             |
      | userName | vishnu                |
    And User Have Click the Login button
    Then User Have Enter Invalid Credential Page

  
  Scenario: To Check in Multiple UserName and Multiple Password
    When User Have Enter Multiple Email and Multiple Password
      | Java123             |    237632 | python123 | python     |
      | Selenium123         | Selenium  | Gitjenkin | 2344335354 |
      | Greens123@gmail.com | Greens123 | Jira      | Jira123    |
    And User Have Click the Login button
    Then User Have Enter Invalid Credential Page

  Scenario: To Check in Valid UserName and Valid password
    When User Have Enter Valid Email and Valid Password
      | Java123@gmail.com | Java123 | Vishnuraj123@gmail.com | Vishnuraj |
    And User Have Click the Login button
    Then User Have Enter Invalid Credential Page

	
  Scenario: To Check in Valid UserName and Invalid Password
    When User Have Enter Valid Email and Invalid Password
    And User Have Click the Login button
    Then User Have Enter Invalid Credential Page
    
	
  Scenario: To Check Invalid Username and Valid Password
    When user have Enter Invalid Email and Valid Password
    When user have Click the Login button

  @Sanity
  Scenario: User have created the new account in Facebook
    When User have click the create new account button
    And User have fill the first name and last name
    And User have fill Remaining all datas
    And User click the radio button and date of birth selection
    Then User have the signup button
