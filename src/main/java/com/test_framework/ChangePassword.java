package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword
{
    WebDriver driver;
    public ChangePassword(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID,using = "edit-current-pass")
    private WebElement CurrentPassword;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement ChangePasswordButton;
    @FindBy(how = How.ID,using = "edit-pass-pass1")
    private WebElement NewPassword;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement Continue;
    @FindBy(how=How.ID,using = "edit-pass-pass2")
    private WebElement ConfirmPassword;
    @FindBy(how=How.ID,using = "edit-submit")
    private WebElement SaveButton;

    String Expected ="https://it.intouch.bmigroup.com/it/user/login";

    public void Navigate()
    {
        driver.get("https://it.intouch.bmigroup.com/");
        Utils.waitForSomeTime();
    }
    public void ChangePassword()
    {
        CurrentPassword.sendKeys("password");
        ChangePasswordButton.click();
        NewPassword.sendKeys("password");
        Continue.click();
        ConfirmPassword.sendKeys("password");

    }
    public void PasswordChangeSuccessfully()
    {
        String CurrentUrl =driver.getCurrentUrl();
    }




}
