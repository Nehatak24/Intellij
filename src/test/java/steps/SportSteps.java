package steps;
import com.test_framework.Sports;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SportSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    Sports sports = new Sports(driver);

    @When("^I click on sport$")
    public void iClickOnSport()
    {
sports.ClickSportsLink();
    }

    @Then("^I see sport page load successfully$")
    public void iSeeSportPageLoadSuccessfully()
    {
        sports.CheckSportsPage();
    }
}
