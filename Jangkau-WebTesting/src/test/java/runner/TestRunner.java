package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"utility", "stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        }
)

public class TestRunner {

}
