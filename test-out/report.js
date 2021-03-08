$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Zanda.feature");
formatter.feature({
  "line": 1,
  "name": "Product",
  "description": "",
  "id": "product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6560658100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Check Product",
  "description": "",
  "id": "product;check-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SearchZanda"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I navigate to BMIGroup",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Product",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Select Product",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I can see Product Page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSteps.iNavigateToBMIGroup()"
});
formatter.result({
  "duration": 4089324300,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnProduct()"
});
formatter.result({
  "duration": 2729949300,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iSelectProduct()"
});
formatter.result({
  "duration": 3378057500,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iCanSeeProductPageSuccessfully()"
});
formatter.result({
  "duration": 17352500,
  "status": "passed"
});
formatter.after({
  "duration": 90460600,
  "status": "passed"
});
});