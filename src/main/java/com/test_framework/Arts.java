package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.*;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Arts
{
    WebDriver driver ;
    public Arts (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );

    }
    @FindBy(how = How.LINK_TEXT,using = "More")
    private WebElement ClickMore;
    @FindBy(how = How.LINK_TEXT,using = "Arts")
    private WebElement ArtsPage;

    String Expected="https://www.bbc.co.uk/arts";

    public void ClickOnMore()
    {
        Utils.waitForSomeTime();
        ClickMore.click();
        Utils.waitForSomeTime();

    }
    public void ClickOnArts()
    {
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        assert ArtsPage.isDisplayed();
    }
}
