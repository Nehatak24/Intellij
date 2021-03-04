package steps;
import com.test_framework.Sports;
import com.test_framework.Weather;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class WeatherSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    Weather weather = new Weather (driver);


    @When("^I click on weather$")
    public void iClickOnWeather()
    {
       // weather.ClickLink();
        weather.ClickWeatherLink();
    }

    @Then("^I see weather page load successfully$")
    public void iSeeWeatherPageLoadSuccessfully()
    {
        weather.CheckWeatherPage();

    }
}
