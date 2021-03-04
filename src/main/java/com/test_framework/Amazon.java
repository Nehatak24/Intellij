package com.test_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;

public class Amazon
{
    WebDriver Driver;
    public Amazon(WebDriver driver)
    {
        this.Driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.LINK_TEXT,using ="Sign in")
    private WebElement SignInButton;
    @FindBy(how = How.ID,using ="ap_email")
    private WebElement Email;
    @FindBy(how = How.CLASS_NAME,using ="a-button-input")
    private WebElement ClickContinue;
    @FindBy(how=How.ID,using="ap_password")
    private WebElement Password;
    @FindBy(how=How.CLASS_NAME,using="a-button-input")
    private WebElement LoginButton;
    @FindBy(how= How.ID,using = "nav-link-accountList-nav-line-1")
    private WebElement AmazonAccount;

    String Expected = "https://www.amazon.co.uk/";

    public void navigate()
    {
        Driver.get("https://www.amazon.co.uk/");
        Utils.waitForSomeTime();
    }
    public void ClickSign()
    {
        SignInButton.click();
        Utils.waitForSomeTime();
    }
    public void EnterUserDetails()
    {
        Email.sendKeys("rahul4r@rediffmail.com");
        ClickContinue.click();
        Password.sendKeys("Neha24111");
    }
    public void ClickLogInButton()
    {
        LoginButton.click();
    }
    public void CheckInSuccessfull()
    {
       assert AmazonAccount.getText().equals(Expected);
    }
}
