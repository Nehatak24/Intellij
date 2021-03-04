package steps;
import com.test_framework.NewTab;
import com.test_framework.News;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class OpenNewtabSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    NewTab newTab= new NewTab(driver);



    @When("^I click MyLinks$")
    public void iClickMyLinks()
    {
        newTab.ClickOnLinks();
    }

   @And("^I Click on BMI RoofProof App$")
    public void iClickOnBMIRoofProofApp()
   {
       newTab.ClickOnApp();
    }

    @Then("^New tab Opens successfully$")
    public void newTabOpensSuccessfully()
    {
       newTab.CheckNewPageOpens();
    }


}
