package steps;
import com.test_framework.News;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class NewsStep extends DriverManager {
    private final WebDriver driver = DriverManager.getDriver();
    News news = new News(driver);

    @When("^I click on News$")
    public void iClickOnNews()
    {
     news.ClickNewsLink();
    }

    @Then("^I see News page load successfully$")
    public void iSeeNewsPageLoadSuccessfully() {
        news.CheckNewsPage();
    }
}
