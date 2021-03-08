package com.test_framework;

import com.test_framework.Util.DriverManager;
import com.test_framework.Util.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org . openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Product
{
    WebDriver driver ;
    public Product (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this );
      //   ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    }

    @FindBy(how = How.ID, using = "onetrust-accept-btn-handler")
    private WebElement Cookie;
    @FindBy(how = How.CLASS_NAME,using ="MuiTab-wrapper")
    private WebElement Products;
   // @FindBy(how = How.LINK_TEXT,using = "Our brands")
  //  private WebElement ClickBrands;
    @FindBy(how = How.CSS,using =".Header-module__NavDrawer--3oB3G>nav>div>ul>li:nth-child(2)>div>ul>li:nth-child(13)>a>span.MuiButton-label>span")
    private WebElement ClickZanda;


    String Expected = "https://www.bmigroup.com/no/zanda";

    public void NavigateFunction()
    {
        driver.get("https://www.bmigroup.com/no/search");
        Utils.waitForSomeTime();
        Cookie.click();
        Utils.waitForSomeTime();
    }
    public void ClickProducts()
    {

        Utils.waitForSomeTime();
        Products.click();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
    }

    public void ChooseProduct()
    {
        //Utils.waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("scroll(0,9000)");
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();
        ClickZanda.click();
        Utils.waitForSomeTime();
    }

    public void CheckPage()
    {
        String CurrentUrl =driver.getCurrentUrl();
        assert CurrentUrl.equals(Expected);
    }



}
