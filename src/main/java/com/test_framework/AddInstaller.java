package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class AddInstaller
{
    WebDriver driver;
    public AddInstaller(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
       ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
    }
    @FindBy(how =How.CSS,using = ".project-menu-link>a>span")
    private WebElement ProjectIcon;
   // @FindBy(how =How.CSS,using = ".mobile-active-row>div:nth-child(1)>div")
   // private WebElement Flat;
    @FindBy(how = How.CSS,using = ".project-details-wrapper > div > nav > ul > li:nth-child(2)")
    private WebElement Team;
    @FindBy(how = How.CSS, using = ".content-buttons > button")
    private WebElement ClickAddInstaller;
    @FindBy(how =How.CLASS_NAME,using ="add-team-member-checkbox")
    private WebElement ClickTeamMember;
    @FindBy(how =How.CSS,using =".ok-button.add-team-member-ok-button")
    private WebElement AddAnInstaller;

    String Expected="https://it.intouch.bmigroup.com/project/7253#team";

    public void Navigate()
    {
        driver.get("https://it.intouch.bmigroup.com/en/user/login");

        Utils.waitForSomeTime();

    }

    public void ClickProjectIcon()
    {
        ProjectIcon.click();
    }
    public void ClickTeam()
    {
        Team.click();
    }
    public void AddInstaller()
    {
        Utils.waitForSomeTime();
        ClickAddInstaller.click();
    }

    public void TeamMember()
    {
        Utils.waitForSomeTime();
        ClickTeamMember.click();
        Utils.waitForSomeTime();
    }
    public void UserAdded()
    {
        Utils.waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        AddAnInstaller.click();
        Utils.waitForSomeTime();
    }
    public void UserAddedSuccessfully()
    {

        String CurrentUrl =driver.getCurrentUrl();
        assert CurrentUrl.equals(Expected);
    }
}
