package steps;

import com.test_framework.Util.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;

public class Hooks
{
    @Before
    public void setUp(Scenario scenario) throws IOException {
        DriverManager.OpenBrowser("chrome");
        //after creating the DriverManager class on Main folder add the following
//
//       new DriverManager().OpenBrowser();
    }
    @After
    public void tearDown()
    {
        new DriverManager().CloseBrowser();
    }
}
