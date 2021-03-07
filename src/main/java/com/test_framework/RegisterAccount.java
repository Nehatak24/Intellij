package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccount
{
    WebDriver driver ;
    public RegisterAccount(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
    }
    @FindBy(how = How.LINK_TEXT,using = "Register now")
    private WebElement Register;
    @FindBy(how = How.CSS,using =".form>fieldset>div.buttons__wrapper>a:nth-child(2)")
    private WebElement Over;
    @FindBy(how = How.ID,using = "day-input")
    private WebElement Day;
    @FindBy(how = How.ID,using ="month-input")
    private WebElement Month;
    @FindBy(how = How.ID,using ="year-input")
    private WebElement Year;
    @FindBy(how = How.ID,using ="submit-button")
    private WebElement Continue;
    @FindBy(how = How.ID,using ="user-identifier-input")
    private WebElement Email;
    @FindBy(how = How.ID,using ="password-input")
    private WebElement Password;
    @FindBy(how = How.ID,using ="postcode-input")
    private WebElement Postcode;
    @FindBy(how = How.ID,using ="gender-input")
    private WebElement Gender;
    @FindBy(how = How.ID,using = "submit-button")
    private WebElement ClickRegister;
    @FindBy(how = How.ID,using = "Yes please")
    private WebElement ClickYes;
    @FindBy(how = How.ID,using = "submit-button")
    private WebElement ClickContinue;


    String Expected ="https://account.bbc.com/account/settings/overview?updated=displayName";




}
