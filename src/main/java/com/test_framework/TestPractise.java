package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class TestPractise
{
    WebDriver driver ;
    public TestPractise(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );

        ((JavascriptExecutor)driver).executeScript("scroll(0,7000)");
    }
    @FindBy(how = How.LINK_TEXT,using = "iPlayer")
    private WebElement IPlayerLink;
    @FindBy(how = How.CLASS_NAME,using = "navigation__logo")
    private WebElement IPlayerPageLoad;
    @FindBy(how = How.LINK_TEXT,using = "Local")
    private WebElement Local;
    @FindBy(how = How.CSS,using =".ls-c-search__input.gel-pica")
    private WebElement Location;
   // @FindBy(how = How.CSS,using = ".ls-c-news__search-container>form>div")
   // private  WebElement TownName;
    @FindBy(how = How.XPATH,using ="//span[@class='gel-long-primer'] ")
    private WebElement Town;

    String Expected="https://www.bbc.co.uk/news/localnews/2643743-london/0";

    public void ClickIplayer()
    {
        IPlayerLink.click();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
    }
    public void ClickPlayerPage()
    {
        Utils.waitForSomeTime();
        assert IPlayerPageLoad.isDisplayed();
    }
    public void ClickLocal()
    {

        ((JavascriptExecutor)driver).executeScript("scroll(0,7000)");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        Local.click();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
    }
    public void EnterLocation()
    {
        Utils.waitForSomeTime();
        Location.sendKeys("Winnersh");
       // WebDriverWait wait = new WebDriverWait(driver, 3000);
      //  WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='ls-c-search__input gel-pica']")));
       // location.sendKeys("London");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        Town.click();

    }

     public void CheckPageLoad()
     {
         Utils.waitForSomeTime();
         String CurrentUrl =driver.getCurrentUrl();
         assert CurrentUrl.equals(Expected);
     }

}
