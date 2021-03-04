package steps;
import com.test_framework.AddUser;
import com.test_framework.Header;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HeaderSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    Header header = new Header(driver);
 //  @When("^I Click ([^\"]*)$")
    public void iClickHeaderLink(String link)
    {
        header.ClickLink(link);
    }

  //  @Then("^I see([^\"]*)$")
    public void iSeeHeaderLinkPage(String link)
    {
        header.CheckPage(link);

    }
}
