package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Header
{
    WebDriver driver;

    public Header(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT,using = "News")
    private WebElement NewsLink;
    @FindBy(how = How.CLASS_NAME,using = "nw-o-news-branding")
    private WebElement NewsPageLoad;
    @FindBy(how = How.LINK_TEXT,using = "Weather")
    private WebElement WeatherLink;
    @FindBy(how = How.CLASS_NAME,using = "wr-c-weather-logo")
    private WebElement WeatherPageLoad;
    String expectedUrl = "https://www.bbc.co.uk/news";

    public void ClickLink(String link)
    {
        switch(link)
        {
            case "News": NewsLink.click();
            break;
            case "Weather": WeatherLink.click();
            break;
            default:System.out.println("wrong");
            break;
        }
    }

    public void CheckPage(String link) {
        switch (link) {
            case "News":
                assert NewsPageLoad.isDisplayed();
                break;
            case "Weather":
                assert WeatherPageLoad.isDisplayed();
                break;
            default:
                System.out.println("Wrong Link Passed");
                break;
        }

    }
}

