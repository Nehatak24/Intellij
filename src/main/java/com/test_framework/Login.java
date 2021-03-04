package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Login
{
    WebDriver driver;

  public Login(WebDriver driver)
  {
      this.driver = driver;
      PageFactory.initElements(driver,this);
  }
    @FindBy(how = How.LINK_TEXT,using = "Sign in")
    private WebElement SigninButton;
    @FindBy(how = How.ID,using = "user-identifier-input")
    private WebElement Email;
    @FindBy(how = How.ID, using = "password-input")
    private WebElement Password;
    @FindBy(how = How.ID, using = "submit-button")
    private WebElement LoginButton;
    @FindBy(how = How.LINK_TEXT, using = "BBC Account")
    private WebElement BBCAccount;

    String Expected = "BBC Account";

    public void navigateFunction()
    {
        driver.get("https://bbc.co.uk");
        Utils.waitForSomeTime();
    }
     public void ClickSignin()
     {
      SigninButton.click();
      Utils.waitForSomeTime();
     }

     public void EnterUserDetails()
     {
         Email.sendKeys("sheetal_jn@hotmail.com");
         Password.sendKeys("Armaan232407@");
     }

     public void ClickLoginButton()
     {
         LoginButton.click();
     }

     public void CheckLoginSuccessful()
     {
         assert BBCAccount.getText().equals(Expected);
     }
}
