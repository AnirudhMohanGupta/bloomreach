Feature: CMS brXM Login Feature


  Scenario Outline: brMx Login Test Scenario

    Given user is already on Login Page
    When title of login page is "Bloomreach Experience 14"
    Then user enters username and password
    Then user clicks on login button
    Then user is on home page
    Then Close the browser


    Examples:
      | username | password |
      | admin17  | admin17  |

