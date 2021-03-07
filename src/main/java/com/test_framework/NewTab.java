package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewTab
{
    WebDriver driver ;
    public NewTab(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
      // ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
       // driver.switchTo().window(tabs.get(1));

    }
    @FindBy(how = How.CSS,using = ".logged-in__main-right>div.logged-in__header-wrapper>div>div>div>div>div>div>div>a")
    private WebElement MyLinks;
    @FindBy(how = How.CSS,using = ".reward-links-popup-content--links>a:nth-child(1)")
    private WebElement BMIProofApp;

    String Expected="http://it.merits.bmigroup.com/utenti/login";

    public void ClickOnLinks ()
    {
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        MyLinks.click();
        Utils.waitForSomeTime();

    }

    public void ClickOnApp() {
        BMIProofApp.click();
        Utils.waitForSomeTime();
    }

    public void CheckNewPageOpens()
    {
        Utils.waitForSomeTime();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String currentUrl= driver.getCurrentUrl();
        assert currentUrl.equals(Expected);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
      //  driver.close();
    }


}
