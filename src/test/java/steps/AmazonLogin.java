package steps;

import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import com.test_framework.Amazon;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonLogin extends DriverManager
{
    WebDriver Driver=DriverManager.getDriver();
    Amazon amazon = new Amazon(Driver);
    @Given("^I navigate to Amazon Page$")
    public void iNavigateToAmazonPage()
    {
        amazon.navigate();
    }

    @When("^I click on sign page$")
    public void iClickOnSignPage()
    {
        amazon.ClickSign();
    }

    @And("^I Enter my user details$")
    public void iEnterMyUserDetails() {
        amazon.EnterUserDetails();

    }

    @And("^I click on sign in$")
    public void iClickOnSignIn() {
        amazon.ClickLogInButton();


    }

    @Then("^I am able to login into Amazon page successfully$")
    public void iAmAbleToLoginIntoAmazonPageSuccessfully() {
       amazon.CheckInSuccessfull();
    }
}
