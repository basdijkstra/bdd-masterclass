import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"classpath:features"},
	glue = {"stepdefinitions"},
	plugin = {"pretty", "json:target/cucumber-json-report/cucumber-json-report.json"},
	tags = {"@rotterdam, @mortgage, @telecom"}
)

public class RunCucumberTest{
}
