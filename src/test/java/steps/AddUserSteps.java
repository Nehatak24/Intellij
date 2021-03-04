package steps;
import com.test_framework.AddUser;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddUserSteps extends DriverManager
{
    private final WebDriver driver = DriverManager.getDriver();
    AddUser addUser = new AddUser(driver);


    @Given("^I navigate to BmiGroup page$")
    public void iNavigateToBmiGroupPage()
    {
        addUser.Navigate();
        addUser.LogInBMI();
    }


    @When("^I click icon Team$")
    public void iClickIconTeam() {
        addUser.ClickIconTeam();
    }


    @And("^I click on AddToProject$")
    public void iClickOnAddToProject() {
        addUser.AddToProject();
    }

    @And("^I click on FlatRoof$")
   public void iClickOnFlatRoof() {
      addUser.ClickFlatRoof();
    }



    @Then("^I am able to add user successfully to project$")
    public void iAmAbleToAddUserSuccessfullyToProject() {
        addUser.AbleToAddUserSuccessfully();
        addUser.RemoveUser();
    }


}
