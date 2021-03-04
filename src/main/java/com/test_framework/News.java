package com.test_framework;


import com.test_framework.Util.Utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class News
{
    WebDriver driver ;
    public News(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }
    @FindBy(how = How.LINK_TEXT,using = "News")
    private WebElement NewsLink;
    @FindBy(how = How.CLASS_NAME,using = "nw-o-news-branding")
    private WebElement NewsPageLoad;
    String expectedUrl = "https://www.bbc.co.uk/news";

    public void ClickNewsLink()
    {
    NewsLink.click();
    Utils.waitForSomeTime();
    File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Utils.waitForSomeTime();
    //FileUtils.copyFile(file , new File (""));
    }

    public void CheckNewsPage()
    {
       // assert NewsPageLoad.isDisplayed();
        String currentUrl=driver.getCurrentUrl();
        assert currentUrl.equals(expectedUrl);
    }

}
