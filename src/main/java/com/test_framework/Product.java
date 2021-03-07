package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product
{
    WebDriver driver ;
    public Product (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
        // ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    }

    @FindBy(how = How.ID, using = "onetrust-accept-btn-handler")
    private WebElement Cookie;
    @FindBy(how = How.CLASS_NAME,using ="MuiTouchRipple-root")
    private WebElement Product;
    @FindBy(how = How.CSS,using = ".Header-module__NavDrawer--3oB3G>nav>div>ul>li:nth-child(2)>div>ul>li:nth-child(11) > h6")
    private WebElement Market;
    @FindBy(how = How.CLASS_NAME,using = "MuiButton-label")
    private WebElement ClickProduct;

    String Expected = "https://www.bmigroup.com/no/zanda";

    public void NavigateFunction()
    {
        driver.get("https://www.bmigroup.com/no/search");
        Utils.waitForSomeTime();
        Cookie.click();
    }
    public void ClickMarket()
    {
       Market.click();
        Utils.waitForSomeTime();
    }

    public void ChooseProduct()
    {
        Utils.waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        ClickProduct.click();
    }

    public void CheckPage()
    {
        String CurrentUrl =driver.getCurrentUrl();
        assert CurrentUrl.equals(Expected);
    }



}
