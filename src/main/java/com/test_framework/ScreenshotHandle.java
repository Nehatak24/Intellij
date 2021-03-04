package com.test_framework;

import com.sun.deploy.cache.Cache;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ScreenshotHandle
{
         WebDriver driver ;

    public  ScreenshotHandle(WebDriver driver)
        {
            this.driver = driver;
            PageFactory.initElements(driver,this );
        }
    @FindBy(how = How.ID, using = "email")
    private WebElement Email;
    @FindBy(how = How.ID, using = "pass")
    private WebElement Password;
    @FindBy(how = How.ID, using = "login")
    private WebElement Login;

   String CurrentUrl = "https://www.facebook.com/";
    public void takeScreenshot(WebDriver webdriver,String File)
        {
            driver.get("https://www.facebook.com/");
           // takeScreenshot("Facebook_LoginPage");
            TakesScreenshot screenshot=((TakesScreenshot)webdriver);
            File ScrFile =screenshot.getScreenshotAs(OutputType.FILE);
        }
        public void SaveFile()
        {
     //      File file=.getScreenshotAs(OutputType.FILE);

            File DestFile=new File("C:\\Users\\nehat\\IdeaProjects\\TestFramework\\src\\main\\java"+".jpg");
         //   System.out.println("ScreenShotTaken");
            //Copy file at destination



        }
}
