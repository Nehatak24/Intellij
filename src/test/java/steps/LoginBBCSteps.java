package steps;
import com.test_framework.LoginBBC;
import com.test_framework.Sports;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import com.test_framework.Weather;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginBBCSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    LoginBBC loginBBC = new LoginBBC (driver);

    @When("^I click on Links$")
    public void iClickOnFooterLink()
    {
        loginBBC.ClickLink();
    }

    @Then("^I am able to see my Page successfully$")
    public void iAmAbleToSeeMyFooterPageSuccessfully()
    {
        loginBBC.CheckPageLoad();
    }
}
