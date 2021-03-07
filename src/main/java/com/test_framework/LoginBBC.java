package com.test_framework;

import com.test_framework.Util.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;

public class LoginBBC
{
    WebDriver driver ;
    public LoginBBC(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
       // ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    }
    @FindBy(how = How.LINK_TEXT,using = "Weather")
    private WebElement WeatherLink;
    @FindBy(how = How.CLASS_NAME,using = "wr-c-weather-logo")
    private WebElement WeatherPageLoad;
    @FindBy(how = How.LINK_TEXT,using = "Bitesize")
    private WebElement BiteSize;

    String Expected="https://www.bbc.co.uk/bitesize";

    public void ClickLink()
    {
        driver.get("https://bbc.co.uk");
        WeatherLink.click();
        Utils.waitForSomeTime();
    }

    public void WeatherPageLoad()
    {
        Utils.waitForSomeTime();
        assert WeatherPageLoad.isDisplayed();
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Utils.waitForSomeTime();
    }
    public void CheckPageLoad()
    {
        BiteSize.click();
        Utils.waitForSomeTime();
        TakesScreenshot screenshot=((TakesScreenshot) driver);
        Utils.waitForSomeTime();
        File ScrFile=screenshot.getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(ScrFile,new File("C:\\Users\\nehat\\IdeaProjects\\TestFramework\\screenshots\\Bitesizepage.png"));

        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        Utils.waitForSomeTime();
        String currentUrl=driver.getCurrentUrl();
        assert currentUrl.equals(Expected);
    }
}
