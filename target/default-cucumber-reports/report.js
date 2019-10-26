$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "login to prestashop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify user name and last name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testingTech"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Step_Definitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using username \"nitoyey@dumoac.net\" and password \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Step_Definitions.the_user_logs_in_using_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users full name \"ibadat\" \"kyzy\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Definitions.users_full_name_should_be_displayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});