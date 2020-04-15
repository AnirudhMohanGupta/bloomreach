Feature: Edit Already Created Document with Document type as Simple Document with Input type are Title , Summary & Description and verify changes

  Scenario Outline: Edit Document Test Scenario

    Given user is already on Login Page
    When title of login page is "Bloomreach Experience 14"
    Then user enters username and password
    Then user clicks on login button
    Then user clicks on To the Content from Navigation area of Hippo CMS
    Then user clicks on folder name as Hippo Go
    Then user clicks on Document name in Document Viewer Script as "<Document_name>"
    When user clicks on Edit Button
    Then user edit Title in Document Viewer area as "<Title>"
    Then user edit Summary in Document Viewer area as "<Summary>"
    Then user edit Description in Document Viewer area as "<Description>"
    When user clicks on Save and Done Button
    Then user should validate edited Title is Displayed in Core Document Screen as "<Title>"
    Then user should validate edited Summary is Displayed in Core Document Screen as "<Summary>"
    Then user should validate edited Description is Displayed in Core Document Screen as "<Description>"
    Then Logout from Application


    Examples:
      | Document_name   | Document_type   | Title            | Summary                                        | Description                |
      | My New Document | Simple Document | My Title Updated | This website is a demo website Updated Version | Editors love Hippo Updated |