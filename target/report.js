$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Additional_Information_ThirdPage.feature");
formatter.feature({
  "name": "Additional_Information_Third_Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Third_Page"
    }
  ]
});
formatter.scenario({
  "name": "Additional_Information_With_Correct_information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Third_Page"
    }
  ]
});
formatter.step({
  "name": "Launch the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUp_FirstPage.launch_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Customer Details",
  "keyword": "When "
});
formatter.match({
  "location": "SignUp_FirstPage.enter_Customer_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signUP",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp_FirstPage.click_on_signUP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the PAN Page Details",
  "keyword": "And "
});
formatter.match({
  "location": "PAN_SecondPage.enter_the_PAN_Page_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Proceed",
  "keyword": "And "
});
formatter.match({
  "location": "PAN_SecondPage.click_on_Proceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the additional information without Nominee Details",
  "keyword": "And "
});
formatter.match({
  "location": "Additional_Inormation_ThirdPage.fill_the_additional_information_without_Nominee_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Proceed button",
  "keyword": "Then "
});
formatter.match({
  "location": "Additional_Inormation_ThirdPage.click_on_Proceed_button()"
});
formatter.result({
  "status": "passed"
});
});