package com.test_framework.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class DriverManager
{
    public static WebDriver driver;
    static Properties properties;
    private static String browser;
    private static String url;
    private Object io;


    public void getProperties()throws IOException {

        properties = new Properties();
        FileInputStream fis = new FileInputStream(Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "config.properties").toString());
        //FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        properties.load(fis);

        browser= properties.getProperty("browser");
        //url= properties.getProperty("url");
        url=properties.getProperty("url");

    }


    public static void OpenBrowser(String browser)
    {
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);


    }

    public void CloseBrowser()
    {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
