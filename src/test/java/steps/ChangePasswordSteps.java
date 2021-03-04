package steps;
import com.test_framework.AddUser;
import com.test_framework.ChangePassword;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ChangePasswordSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    ChangePassword changePassword = new ChangePassword(driver);

    @And("^I change to new password$")
    public void iChangeToNewPassword()
    {
       changePassword.ChangePassword();
    }

    @Then("^I see password change successful$")
    public void iSeePasswordChangeSuccessful()
    {
        changePassword.PasswordChangeSuccessfully();
    }
}
