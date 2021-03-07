package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Facebook
{
    WebDriver driver;
    public Facebook (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.CLASS_NAME, using = "eu-cookie-compliance-secondary-button")
    private WebElement PopUpCookie;
    @FindBy(how = How.LINK_TEXT,using = "email")
    private WebElement Email;
    @FindBy(how = How.ID,using = "pass")
    private WebElement Password;
    @FindBy(how = How.ID, using = "u_0_h_0W")
    private WebElement LogIn;

    String Expected = "https://www.facebook.com/";

    public void navigateFunction()
    {

        driver.get("https://www.facebook.com/");
        Utils.waitForSomeTime();
        PopUpCookie.click();
        Utils.waitForSomeTime();
    }
    public void LoginFacebook()
    {
        Email.sendKeys("nehatak.mba@gmail.com");
        Password.sendKeys("Atharvatak1");
        LogIn.click();
    }

    public void CheckPage()
    {
        String CurrentUrl =driver.getCurrentUrl();
        assert CurrentUrl.equals(Expected);
    }


}
