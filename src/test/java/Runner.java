import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
        tags ="@BBC",
        format = {"pretty","html:test-out","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
        dryRun = false)


public class Runner {
}
