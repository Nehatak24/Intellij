package com.test_framework;

import com.test_framework.Util.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;

public class Sports
{
    WebDriver driver ;
    public Sports(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
    }
    @FindBy(how = How.LINK_TEXT,using = "Sport")
    private WebElement SportsLink;
    @FindBy(how = How.CLASS_NAME,using ="sp-c-global-header__inner")
    private WebElement SportsPageLoad;
  //  String expectedUrl = "https://www.bbc.co.uk/sport";

    public void ClickSportsLink()
    {
        SportsLink.click();
        TakesScreenshot screenshot=((TakesScreenshot) driver);
        Utils.waitForSomeTime();
        File ScrFile=screenshot.getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(ScrFile,new File("C:\\Users\\nehat\\IdeaProjects\\TestFramework\\screenshots\\sportspage.png"));

        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        Utils.waitForSomeTime();

    }
    public void CheckSportsPage()
    {
       assert SportsPageLoad.isDisplayed();

    }
}
