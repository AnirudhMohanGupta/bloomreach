Feature: Create New Document with Document type as Simple Document when Input type are Title , Summary & Description

  Scenario Outline: Create New Document Test Scenario

    Given user is already on Login Page
    When title of login page is "Bloomreach Experience 14"
    Then user enters username and password
    Then user clicks on login button
    Then user clicks on To the Content from Navigation area of Hippo CMS
    Then user clicks on folder name as Hippo Go
    Then user click on the down-arrow which appears to the right of the about folder name and select Add new document
    Then user enter Document Name as "<Document_name>"
    Then user select Document type as "<Document_type>"
    Then user enters Title in Document Viewer area as "<Title>"
    Then user enters Summary in Document Viewer area as "<Summary>"
    Then user enters Description in Document Viewer area as "<Description>"
    When user clicks on Save and Done Button
    Then user should verify new created Document Name is Displayed in Document Viewer Screen as "<Document_name>"
    Then Logout from Application


    Examples:
      | Document_name   | Document_type   | Title    | Summary                        | Description        |
      | My New Document | Simple Document | My Title | This website is a demo website | Editors love Hippo |