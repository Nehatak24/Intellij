package steps;
import com.test_framework.*;
import com.test_framework.Util.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginBBCSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    LoginBBC loginBBC = new LoginBBC(driver);


    @And("^I am able to see WeatherPage successfully$")
    public void iAmAbleToSeeWeatherPageSuccessfully()
    {
        loginBBC.ClickLink();
    }

    @And("^I click on Bitesize$")
    public void iClickOnBitesize()
    {
        loginBBC.WeatherPageLoad();
    }

    @Then("^I am able to see BitesizePage successfully$")
    public void iAmAbleToSeeBitesizePageSuccessfully()
    {
        loginBBC.CheckPageLoad();
    }

}
