package steps;
import com.test_framework.AddUser;
import com.test_framework.DifferentUrls;
import com.test_framework.Header;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class DifferentUrlSteps
{
    private final WebDriver driver = DriverManager.getDriver();
   DifferentUrls differentUrls= new DifferentUrls(driver);

    @Then("^I type ([^\"]*)$")
    public void iClickBMIDifferentCountriesUrl(String link)
    {
        differentUrls.CheckUrl(link);
    }


}
