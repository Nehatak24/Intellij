package steps;
import com.test_framework.AddUser;
import com.test_framework.Header;
import com.test_framework.LoginMulti;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginMultiSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    LoginMulti loginMulti = new LoginMulti(driver);


    @Given("^I navigate to BMIInTouchPage$")
    public void iNavigateToBMIInTouchPage()
    {
        loginMulti.Navigate();
    }

    @When("^I enter ([^\"]*) and ([^\"]*)$")
    public void iClickUsernameAndPassword(String username,String password)
    {

        loginMulti.Login(username,password);
    }

    @Then("^I am logged in with that user$")
    public void iSeeLoggedInWithThatUser()
    {
        loginMulti.CheckLogIn();
    }

}
