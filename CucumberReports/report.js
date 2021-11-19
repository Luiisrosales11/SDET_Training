$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\cucumberAssignmentFeatures\\Scenario2.feature");
formatter.feature({
  "name": "Validate Job Title",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "I am logged into Orange Application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "On home page of application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinitionScenario2.onHomePageOfApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitionScenario2.loginToApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Admin link",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitionScenario2.clickOnAdminLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Job",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitionScenario2.clickOnJob()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate text Job title",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitionScenario2.validateTextJobTitle()"
});
formatter.result({
  "status": "passed"
});
});