Feature: login feature

  @tag1
  Scenario: suceesful login with valid credebtials
    Given user Launch the edge browser
    When user is open to URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter username as "Admin" and password as "admin123"
    And click on submit
    Then page Title

  Scenario Outline: Suceesful login with credebtials with DDT
    Given user Launch the edge browser
    When user is open to URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And enter username "<username>" and password "<password>"
    And click on submit
    Then page Title

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | admin    | admin1234 |
