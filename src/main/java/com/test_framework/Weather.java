package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Weather
{
    WebDriver driver ;
    public Weather(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    }
    @FindBy(how = How.LINK_TEXT,using = "Weather")
    private WebElement WeatherLink;
    @FindBy(how = How.CLASS_NAME,using = "wr-c-weather-logo")
    private WebElement WeatherPageLoad;
    @FindBy(how = How.LINK_TEXT,using = "Bitesize")
    private WebElement BiteSize;
    String Expected="https://www.bbc.co.uk/bitesize";

    public void ClickWeatherLink()
    {
        WeatherLink.click();
        Utils.waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        BiteSize.click();
    }


    public void CheckWeatherPage()
    {
        WeatherPageLoad.isDisplayed();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        String CurrentUrl =driver.getCurrentUrl();
        assert CurrentUrl.equals(Expected);

    }
}
