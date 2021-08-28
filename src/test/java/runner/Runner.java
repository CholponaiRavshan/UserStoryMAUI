package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","rerun:target/rerun.txt"},
        features = "src/test/resources/features",//path for feature files
        glue = "steps",//path for java with steps
        //For run exaclty that App what i want
        tags = "@MB2P-129",
        dryRun = false
)
public class Runner {

}
