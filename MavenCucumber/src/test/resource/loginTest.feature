Feature: Proof of concept of cucucmber test running in firefox browser

  @firefox
  Scenario Outline: Login to newtours site
    Given I Navigate to the newtours <url>

    Examples: 
      | url                          | Username | Password |
      | http://newtours.demoaut.com/ | mercury  | mercury  |

 
