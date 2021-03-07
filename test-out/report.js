$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Zanda.feature");
formatter.feature({
  "line": 1,
  "name": "Product",
  "description": "",
  "id": "product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6594684200,
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
  "duration": 4727979600,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnProduct()"
});
formatter.result({
  "duration": 45109535400,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d88.0.4324.182)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-UV1DCHPA\u0027, ip: \u0027192.168.0.33\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\nehat\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49299}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 281683abfdce65923a30835a6fe93db7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.test_framework.Product.ClickMarket(Product.java:42)\r\n\tat steps.ProductSteps.iClickOnProduct(ProductSteps.java:28)\r\n\tat ✽.When I click on Product(src/test/resources/features/Zanda.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductSteps.iSelectProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductSteps.iCanSeeProductPageSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 76745600,
  "status": "passed"
});
});