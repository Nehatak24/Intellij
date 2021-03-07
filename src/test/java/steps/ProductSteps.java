package steps;
import com.test_framework.Product;
import com.test_framework.Sports;
import com.test_framework.Weather;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class ProductSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    Product product = new Product (driver);

    @Given("^I navigate to BMIGroup$")
    public void iNavigateToBMIGroup()
    {
        product.NavigateFunction();
    }

    @When("^I click on Product$")
    public void iClickOnProduct()
    {
        product.ClickMarket();
    }

    @And("^I Select Product$")
    public void iSelectProduct()
    {
        product.ChooseProduct();
    }

    @Then("^I can see Product Page successfully$")
    public void iCanSeeProductPageSuccessfully()
    {
        product.CheckPage();
    }
}
