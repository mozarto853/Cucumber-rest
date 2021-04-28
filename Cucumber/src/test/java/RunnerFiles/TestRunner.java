package RunnerFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\JavaProjects\\RestAssured\\Cucumber\\src\\test\\resources\\features", glue={"StepDefinitions"},
        tags="@googletest"

)


public class TestRunner {
}
