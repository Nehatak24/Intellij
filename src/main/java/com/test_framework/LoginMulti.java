package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginMulti
{
    WebDriver driver;

    public LoginMulti(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   // @FindBy(how = How.ID,using = "popup-buttons")
  //  private WebElement PopUpCookie;
    @FindBy(how = How.ID,using = "edit-name")
    private WebElement Username;
    @FindBy(how = How.ID,using = "edit-pass")
    private WebElement Password;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement LogInButton;

    String Expected ="https://it.intouch.bmigroup.com/home";


    public void Navigate()
    {
        driver.get("https://it.intouch.bmigroup.com/user/login");

        Utils.waitForSomeTime();
    }
    public void Login(String username, String password)
    {
        Utils.waitForSomeTime();
       // PopUpCookie.click();
        Username.sendKeys(username);
        Password.sendKeys(password);
        Utils.waitForSomeTime();
        LogInButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void CheckLogIn()
    {
        Utils.waitForSomeTime();
        String currentUrl=driver.getCurrentUrl();
        assert currentUrl.equals(Expected);
    }
}
