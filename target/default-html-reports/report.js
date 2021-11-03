$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserStory1.feature");
formatter.feature({
  "name": "Main tabs on home page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@user_story1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "verify that user can open main tabs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testCase1"
    }
  ]
});
formatter.step({
  "name": "verify user can see main tabs",
  "keyword": "And "
});
formatter.step({
  "name": "click to \"\u003cmainTabs\u003e\" tabs",
  "keyword": "And "
});
formatter.step({
  "name": "verify that the \"\u003cmainTabs\u003e\" is opened",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mainTabs"
      ]
    },
    {
      "cells": [
        "Our Technologies"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigates to url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.navigatesToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user can open main tabs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@user_story1"
    },
    {
      "name": "@testCase1"
    }
  ]
});
formatter.step({
  "name": "verify user can see main tabs",
  "keyword": "And "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.verifyUserCanSeeMainTabs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click to \"Our Technologies\" tabs",
  "keyword": "And "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.clickToTabs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the \"Our Technologies\" is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.verifyThatTheIsOpened(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify that user can open Software Development section",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testCase2"
    }
  ]
});
formatter.step({
  "name": "scroll down to the page",
  "keyword": "When "
});
formatter.step({
  "name": "verify Open roles section is present",
  "keyword": "Then "
});
formatter.step({
  "name": "verify that \"\u003cpositions\u003e\" position is under the Software Development section",
  "keyword": "Then "
});
formatter.step({
  "name": "click to \"\u003cpositions\u003e\" section",
  "keyword": "And "
});
formatter.step({
  "name": "verify the new tab is opened",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "positions"
      ]
    },
    {
      "cells": [
        "iOS Developer"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigates to url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.navigatesToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user can open Software Development section",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@user_story1"
    },
    {
      "name": "@testCase2"
    }
  ]
});
formatter.step({
  "name": "scroll down to the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.scrollDownToThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Open roles section is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.verifyOpenRolesSectionIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"iOS Developer\" position is under the Software Development section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.verifyThatPositionIsUnderTheSoftwareDevelopmentSection(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click to \"iOS Developer\" section",
  "keyword": "And "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.clickTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the new tab is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ProteinTech.step_definitions.MyStepdefs.verifyTheNewTabIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});