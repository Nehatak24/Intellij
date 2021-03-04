package steps;

import com.test_framework.ScreenshotHandle;
import com.test_framework.Util.DriverManager;
import com.test_framework.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ScreenShotSteps
{
    private final WebDriver driver = DriverManager.getDriver();
    ScreenshotHandle screenshotHandle= new ScreenshotHandle(driver);

    @Given("^I navigate to facebook page$")
    public void iNavigateToFacebookPage()
    {
  //  screenshotHandle.takeScreenshot("https://www.facebook.com/");
    }

    @Then("^I am able to take screenshot successfully$")
    public void iAmAbleToTakeScreenshotSuccessfully()
    {
        screenshotHandle.SaveFile();
    }
}
