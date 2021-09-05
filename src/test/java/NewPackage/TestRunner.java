package NewPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(format = {"json:target/cucmber.json"},tags = {"@hello"})
public class TestRunner {
}
