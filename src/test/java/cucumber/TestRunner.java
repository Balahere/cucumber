package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\MyJava\\cucumber\\src\\main\\java\\features",
		glue={"stepdefitions"},
		//format={"pretty","html:test-output"}
		dryRun = false,
		monochrome = true,
		strict=true
		)

public class TestRunner {

}
