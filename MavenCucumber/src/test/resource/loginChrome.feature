Feature: Proof of concept of cucucmber test running in chrome browser

  @chrome
  Scenario Outline: Login to newtours site
    Given I Navigate to the newtours <url>
    When I Click on the Login link
    And I Enter <Username> and <Password>
    And I Click on Login
    Then I Verify Login

    Examples: 
      | url                          | Username | Password |
      | http://newtours.demoaut.com/ | mercury  | mercury  |
