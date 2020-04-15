$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/EditDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Already Created Document with Document type as Simple Document with Input type are Title , Summary \u0026 Description and verify changes",
  "description": "",
  "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Edit Document Test Scenario",
  "description": "",
  "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes;edit-document-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is \"Bloomreach Experience 14\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on To the Content from Navigation area of Hippo CMS",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on folder name as Hippo Go",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Document name in Document Viewer Script as \"\u003cDocument_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Edit Button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user edit Title in Document Viewer area as \"\u003cTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user edit Summary in Document Viewer area as \"\u003cSummary\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user edit Description in Document Viewer area as \"\u003cDescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks on Save and Done Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should validate edited Title is Displayed in Core Document Screen as \"\u003cTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user should validate edited Summary is Displayed in Core Document Screen as \"\u003cSummary\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user should validate edited Description is Displayed in Core Document Screen as \"\u003cDescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Logout from Application",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes;edit-document-test-scenario;",
  "rows": [
    {
      "cells": [
        "Document_name",
        "Document_type",
        "Title",
        "Summary",
        "Description"
      ],
      "line": 24,
      "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes;edit-document-test-scenario;;1"
    },
    {
      "cells": [
        "My New Document",
        "Simple Document",
        "My Title Updated",
        "This website is a demo website Updated Version",
        "Editors love Hippo Updated"
      ],
      "line": 25,
      "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes;edit-document-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Edit Document Test Scenario",
  "description": "",
  "id": "edit-already-created-document-with-document-type-as-simple-document-with-input-type-are-title-,-summary-\u0026-description-and-verify-changes;edit-document-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is \"Bloomreach Experience 14\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on To the Content from Navigation area of Hippo CMS",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on folder name as Hippo Go",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Document name in Document Viewer Script as \"My New Document\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Edit Button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user edit Title in Document Viewer area as \"My Title Updated\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user edit Summary in Document Viewer area as \"This website is a demo website Updated Version\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user edit Description in Document Viewer area as \"Editors love Hippo Updated\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks on Save and Done Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should validate edited Title is Displayed in Core Document Screen as \"My Title Updated\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user should validate edited Summary is Displayed in Core Document Screen as \"This website is a demo website Updated Version\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user should validate edited Description is Displayed in Core Document Screen as \"Editors love Hippo Updated\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Logout from Application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 11017056582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bloomreach Experience 14",
      "offset": 24
    }
  ],
  "location": "LoginStepDefination.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 14560264,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 317402442,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1824962836,
  "status": "passed"
});
formatter.match({
  "location": "DocumentStepDefination.user_clicks_on_To_the_Content_from_Navigation_area_of_Hippo_CMS()"
});
formatter.result({
  "duration": 20259151830,
  "status": "passed"
});
formatter.match({
  "location": "DocumentStepDefination.user_clicks_on_folder_name_as_Hippo_Go()"
});
formatter.result({
  "duration": 206608320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My New Document",
      "offset": 59
    }
  ],
  "location": "DocumentStepDefination.user_clicks_on_Document_name_in_Document_Viewer_Script_as(String)"
});
formatter.result({
  "duration": 699686266,
  "status": "passed"
});
formatter.match({
  "location": "DocumentStepDefination.user_clicks_on_Edit_Button()"
});
formatter.result({
  "duration": 1226756598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Title Updated",
      "offset": 44
    }
  ],
  "location": "DocumentStepDefination.user_edit_Title_in_Document_Viewer_area_as(String)"
});
formatter.result({
  "duration": 2959128684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This website is a demo website Updated Version",
      "offset": 46
    }
  ],
  "location": "DocumentStepDefination.user_edit_Summary_in_Document_Viewer_area_as(String)"
});
formatter.result({
  "duration": 665900109,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Editors love Hippo Updated",
      "offset": 50
    }
  ],
  "location": "DocumentStepDefination.user_edit_Description_in_Document_Viewer_area_as(String)"
});
formatter.result({
  "duration": 724570852,
  "status": "passed"
});
formatter.match({
  "location": "DocumentStepDefination.user_clicks_on_Save_and_Done_Button()"
});
formatter.result({
  "duration": 548573919,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Title Updated",
      "offset": 75
    }
  ],
  "location": "DocumentStepDefination.user_should_validate_edited_Title_is_Displayed_in_Core_Document_Screen_as(String)"
});
formatter.result({
  "duration": 23853219167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This website is a demo website Updated Version",
      "offset": 77
    }
  ],
  "location": "DocumentStepDefination.user_should_validate_edited_Summary_is_Displayed_in_Core_Document_Screen_as(String)"
});
formatter.result({
  "duration": 69497196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Editors love Hippo Updated",
      "offset": 81
    }
  ],
  "location": "DocumentStepDefination.user_should_validate_edited_Description_is_Displayed_in_Core_Document_Screen_as(String)"
});
formatter.result({
  "duration": 70968094,
  "status": "passed"
});
formatter.match({
  "location": "DocumentStepDefination.logout_from_Application()"
});
formatter.result({
  "duration": 134548534,
  "status": "passed"
});
});