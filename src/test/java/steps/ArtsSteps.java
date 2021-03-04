package steps;
import com.test_framework.Arts;
import com.test_framework.Weather;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ArtsSteps
{

    private final WebDriver driver = DriverManager.getDriver();
    Arts arts = new Arts(driver);
    @When("^I click on More$")
    public void iClickOnMore()
    {
        arts.ClickOnMore();
    }

    @And("^I click on Arts$")
    public void iClickOnArts()
    {
        arts.ClickOnArts();
    }

    @Then("^I see Arts page load successfully$")
    public void iSeeArtsPageLoadSuccessfully()
    {

    }
}
