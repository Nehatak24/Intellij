package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EditUserDetails
{
    WebDriver driver;

    public EditUserDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "eu-cookie-compliance-secondary-button")
    private WebElement PopUpCookie;
    @FindBy(how = How.ID, using = "edit-name")
    private WebElement Username;
    @FindBy(how = How.ID, using = "edit-pass")
    private WebElement Password;
    @FindBy(how = How.ID, using = "edit-submit")
    private WebElement LogInButton;
    @FindBy(how = How.CSS, using = ".company-owner-menu-block-submenus>ul>li.link-profile.has-link>a>span")
    private WebElement ProfileIcon;
    @FindBy(how = How.CSS, using = ".profile-basic-details-edit__edit-button.intouch-edit.inited")
    private WebElement EditButton;
    @FindBy(how = How.ID, using = "edit-user-phone")
    private WebElement TelephoneNumber;
    @FindBy(how = How.ID, using = "edit-submit--2")
    private WebElement SaveButton;


    String Expected =  "https://it.intouch.bmigroup.com/profile/";

    public void navigate ()
    {
        driver.get("https://it.intouch.bmigroup.com/");
        Utils.waitForSomeTime();
        PopUpCookie.click();

    }
    public void LogInBMI()
    {
        Utils.waitForSomeTime();
        Username.sendKeys("sheetal.samnani+777@bmigroup.com");
        Password.sendKeys("password");
        LogInButton.click();

    }
    public void ClickProfileIcon()
    {
       ProfileIcon.click();
        Utils.waitForSomeTime();

    }
    public void ClickEditButton()
    {
        EditButton.click();
        Utils.waitForSomeTime();
    }
    public void AddNumber()
    {
        TelephoneNumber.sendKeys("77");
        SaveButton.click();
        Utils.waitForSomeTime();
    }


    public void EditDetailsSuccessfully()
    {
       String CurrentUrl =driver.getCurrentUrl();
       assert CurrentUrl.equals(Expected);
       Utils.waitForSomeTime();
        EditButton.click();
        Utils.waitForSomeTime();
        TelephoneNumber.clear();
        SaveButton.click();
    }
   // public void ClearData()
   // {
     //   Utils.waitForSomeTime();
     //   Utils.waitForSomeTime();
     //   EditButton.click();
     //  Utils.waitForSomeTime();
      //  TelephoneNumber.sendKeys("");
       // SaveButton.click();
   // }




}



