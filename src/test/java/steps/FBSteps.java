package steps;
import com.test_framework.Facebook;
import com.test_framework.Sports;
import com.test_framework.Weather;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class FBSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    Facebook facebook  = new Facebook (driver);

    @Given("^I navigate to FacebookPage$")
    public void iNavigateToFacebookPage()
    {
        facebook.navigateFunction();
    }

    @When("^I Enter my FacebookUserDetails$")
    public void iEnterMyFacebookUserDetails()
    {
        facebook.LoginFacebook();
    }

    @Then("^I am able to Login successfully$")
    public void iAmAbleToLoginSuccessfully()
    {
        facebook.CheckPage();
    }
}
