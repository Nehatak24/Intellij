$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TestPractise.feature");
formatter.feature({
  "line": 1,
  "name": "BBC",
  "description": "",
  "id": "bbc",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6856458900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Check BBC page",
  "description": "",
  "id": "bbc;check-bbc-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@BBC"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I navigate to BBC page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Click on Header iplayer",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see iplayer page load",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Click on Local",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Enter Location",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can see Location Page opens successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iNavigateToBBCPage()"
});
formatter.result({
  "duration": 3026428700,
  "status": "passed"
});
formatter.match({
  "location": "TestPractiseSteps.iClickOnHeaderIplayer()"
});
formatter.result({
  "duration": 3728513300,
  "status": "passed"
});
formatter.match({
  "location": "TestPractiseSteps.iSeeIplayerPageLoad()"
});
formatter.result({
  "duration": 909014900,
  "status": "passed"
});
formatter.match({
  "location": "TestPractiseSteps.iClickOnLocal()"
});
formatter.result({
  "duration": 6999665600,
  "status": "passed"
});
formatter.match({
  "location": "TestPractiseSteps.iClickOnLocation()"
});
formatter.result({
  "duration": 46115834700,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d88.0.4324.182)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-UV1DCHPA\u0027, ip: \u0027192.168.0.33\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\nehat\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54136}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 556d8501d163dc496a36661cda1c56ae\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.test_framework.TestPractise.EnterLocation(TestPractise.java:63)\r\n\tat steps.TestPractiseSteps.iClickOnLocation(TestPractiseSteps.java:39)\r\n\tat ✽.And I Enter Location(src/test/resources/features/TestPractise.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestPractiseSteps.iCanSeeLocationPageOpensSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 160080800,
  "status": "passed"
});
});