package steps;
import com.test_framework.AddInstaller;
import com.test_framework.AddUser;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import com.test_framework.Util.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddInstallerSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    AddInstaller addInstaller= new AddInstaller(driver);

    @When("^I Click on ProjectIcon$")
    public void iClickOnProjectIcon()
    {
        addInstaller.Navigate();
        Utils.waitForSomeTime();
        addInstaller.ClickProjectIcon();
    }

    @And("^I Click on Team$")
    public void iClickOnTeam()
    {
        Utils.waitForSomeTime();
        addInstaller.ClickTeam();
    }

    @And("^I Click on AddAnInstaller$")
    public void iClickOnAddAnInstaller()
    {
        Utils.waitForSomeTime();
        addInstaller.AddInstaller();
    }

    @And("^I Select team member$")
    public void iSelectTeamMember()
    {
        addInstaller.TeamMember();
        Utils.waitForSomeTime();
        Utils.waitForSomeTime();

    }

    @And("^I click on User$")
    public void iClickOnUser()
    {
        Utils.waitForSomeTime();
        addInstaller.UserAdded();
    }

    @Then("^Installer Added successfully$")
    public void installerAddedSuccessfully()
    {
        addInstaller.UserAddedSuccessfully();
    }


}
