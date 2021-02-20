$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/CucumberBDDFramework/src/main/java/features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "OpenCart Application testing",
  "description": "",
  "id": "opencart-application-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 292515,
  "status": "passed"
});
formatter.before({
  "duration": 145558,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Adding Address",
  "description": "",
  "id": "opencart-application-testing;adding-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Address page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user fills address details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on add button",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_Address_page()"
});
formatter.result({
  "duration": 363712959,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_fills_address_details()"
});
formatter.result({
  "duration": 114301,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_click_on_add_button()"
});
formatter.result({
  "duration": 118499,
  "status": "passed"
});
formatter.after({
  "duration": 90973,
  "status": "passed"
});
formatter.after({
  "duration": 74179,
  "status": "passed"
});
formatter.before({
  "duration": 277586,
  "status": "passed"
});
formatter.before({
  "duration": 1417791,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Remove Address",
  "description": "",
  "id": "opencart-application-testing;remove-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on Address page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user selects the address",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on delete button",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_Address_page()"
});
formatter.result({
  "duration": 270589,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_selects_the_address()"
});
formatter.result({
  "duration": 291115,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_click_on_delete_button()"
});
formatter.result({
  "duration": 134362,
  "status": "passed"
});
formatter.after({
  "duration": 92373,
  "status": "passed"
});
formatter.after({
  "duration": 101238,
  "status": "passed"
});
});