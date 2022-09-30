package target.bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // which framework you are running with
							            // CucumberOptions come from cucumber library---->field, value
@CucumberOptions(
							features = "features", // where is feature file located
							glue = {"target.bdd.steps", "target.bdd.base"}, // where is step definition located
							tags =  "@dataDriven1",// tag in BDD is same as group in TDD
							plugin = { "pretty", "html:target/Report.html", "json:target/Report.json" }, // report
							monochrome = true, // true is used to remove special characters in console
							dryRun = false) // it doesn't execute any test cases but checks the feature file and glue only
public class TestRunner {
	

}
