package steps;

import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends DriverManager{

  private final WebDriver driver = DriverManager.getDriver();

   Login login = new Login(driver);

    @Given("^I navigate to BBC page$")
    public void iNavigateToBBCPage()
    {
     login.navigateFunction();

    }

    @When("^I click signin link$")
    public void iClickSigninLink()
    {

     login.ClickSignin();
    }

    @And("^I enter my valid userdetails$")
    public void iEnterMyValidUserdetails()
    {
     login.EnterUserDetails();
    }

    @And("^I click login$")
    public void iClickLogin()
    {
     login.ClickLoginButton();
    }

    @Then("^I am able to login successfully$")
    public void iAmAbleToLoginSuccessfully()
    {
     login.CheckLoginSuccessful();
    }

}
