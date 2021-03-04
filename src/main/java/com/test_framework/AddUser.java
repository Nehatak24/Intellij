package com.test_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;

public class AddUser
{
    WebDriver driver;
    public AddUser(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID,using = "popup-buttons")
    private WebElement PopUpCookie;
    @FindBy(how = How.ID,using = "edit-name")
    private WebElement Email;
    @FindBy(how = How.ID,using = "edit-pass")
    private WebElement Password;
    @FindBy(how = How.ID,using = "edit-submit")
    private WebElement LogInButton;
    @FindBy(how = How.CSS,using =".team-menu-link>a>span")
    private WebElement TeamIcon;
    @FindBy(how = How.CSS,using = ".action>div>a")
    private WebElement AddToProject;
    @FindBy(how = How.CLASS_NAME,using = "add-team-member-checkbox")
    private WebElement CheckBox;
    @FindBy(how = How.NAME,using = "op")
    private WebElement ClickAddUser;
    @FindBy(how = How.CSS,using = ".team-member-profile-block--project-actions>a")
    private WebElement RemoveFromProject;
    @FindBy(how = How.CSS,using = ".remove-installer-yes-button")
    private WebElement RemoveUser;
    @FindBy(how = How.CSS,using = ".button-group > a")
    private WebElement DoneButton;

    String Expected = "https://it.intouch.bmigroup.com/team/1542";

    public void Navigate()
    {
        driver.get("https://it.intouch.bmigroup.com/en/user/login");

        Utils.waitForSomeTime();
    }


    public void LogInBMI()
    {
        Utils.waitForSomeTime();
        PopUpCookie.click();
        Email.sendKeys("sheetal.samnani+777@bmigroup.com");
        Password.sendKeys("password");
        LogInButton.click();
    }
    public void ClickIconTeam()
    {
        TeamIcon.click();
        Utils.waitForSomeTime();
    }
    public void AddToProject()
    {
        AddToProject.click();
    }
    public void ClickFlatRoof()
    {

        CheckBox.click();
        Utils.waitForSomeTime();
        ClickAddUser.click();
        Utils.waitForSomeTime();
    }
    public void AbleToAddUserSuccessfully()
    {

        String CurrentUrl =driver.getCurrentUrl();
       assert CurrentUrl.equals(Expected);
    }
    public void RemoveUser()
    {
        Utils.waitForSomeTime();
        RemoveFromProject.click();
        RemoveUser.click();
        DoneButton.click();
    }

}
