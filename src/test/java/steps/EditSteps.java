package steps;

import com.test_framework.EditUserDetails;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class EditSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();

    EditUserDetails editUserDetails = new EditUserDetails(driver);

    @Given("^I navigate to BMIGroupPage$")
    public void iNavigateToBMIGroupPage()
    {
        editUserDetails.navigate();
        editUserDetails.LogInBMI();
    }

    @When("^I Click on ProfileIcon$")
    public void iClickOnProfileIcon()
    {
        editUserDetails.ClickProfileIcon();

    }
    @And("^I Click on Edit$")
    public void iClickOnEdit()
    {
        editUserDetails.ClickEditButton();
    }


    @And("^I Enter my personal Details$")
    public void iEnterMyPersonalDetails()
    {

        editUserDetails.AddNumber();

    }


    @Then("^I am able to Edit my Details Successfully$")
    public void iAmAbleToEditMyDetailsSuccessfully()
    {
        editUserDetails.EditDetailsSuccessfully();
      //  editUserDetails.ClearData();
    }


}
