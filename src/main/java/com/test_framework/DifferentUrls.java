package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DifferentUrls {
    WebDriver driver;

    public DifferentUrls(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String itPageUrl = "https://it.intouch.bmigroup.com/user/login";
    String plPageUrl = "https://pl.intouch.bmigroup.com/user/login";
    String ukPageUrl = "https://uk.intouch.bmigroup.com/user/login";
    String dkPageUrl = "https://dk.intouch.bmigroup.com/user/login";
    String fiPageUrl = "https://fi.intouch.bmigroup.com/user/login";
    String noPageUrl = "https://no.intouch.bmigroup.com/user/login";
    String myPageUrl = "https://my.intouch.bmigroup.com/user/login";
    String esPageUrl = "https://es.intouch.bmigroup.com/user/login";
    String sePageUrl = "https://se.intouch.bmigroup.com/user/login";
    String dePageUrl = "https://de.intouch.bmigroup.com/user/login";


    public void CheckUrl(String link) {
        switch (link) {
            case "it":
                driver.get(itPageUrl);
                break;
            case "pl":
                driver.get(plPageUrl);
                break;
            case "uk":
                driver.get(ukPageUrl);
                break;
            case "dk":
                driver.get(dkPageUrl);
                break;
            case "fi":
                driver.get(fiPageUrl);
                break;
            case "no":
                driver.get(noPageUrl);
                break;
            case "my":
                driver.get(myPageUrl);
                break;
            case "es":
                driver.get(esPageUrl);
                break;
            case "se":
                driver.get(sePageUrl);
                break;
            case "de":
                driver.get(dePageUrl);
                break;

            default:
                System.out.println("wrong");
                break;
        }

    }

}
