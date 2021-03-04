package steps;
import com.test_framework.Sports;
import com.test_framework.TestPractise;
import com.test_framework.Weather;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestPractiseSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    TestPractise testPractise  = new TestPractise(driver);

    @When("^I Click on Header iplayer$")
    public void iClickOnHeaderIplayer()
    {
        testPractise.ClickIplayer();
    }

    @Then("^I see iplayer page load$")
    public void iSeeIplayerPageLoad()
    {
        testPractise.ClickPlayerPage();
    }

    @And("^I Click on Local$")
    public void iClickOnLocal()
    {
        testPractise.ClickLocal();
    }

    @And("^I Enter Location$")
    public void iClickOnLocation()
    {
        testPractise.EnterLocation();
    }

    @Then("^I can see Location Page opens successfully$")
    public void iCanSeeLocationPageOpensSuccessfully()
    {
       testPractise.CheckPageLoad();
    }

}
