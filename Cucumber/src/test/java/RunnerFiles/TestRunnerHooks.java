package RunnerFiles;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\JavaProjects\\RestAssured\\Cucumber\\src\\test\\resources\\featuresHook", glue={"StepDefinitionsHook"}
,tags = "@jisan123 or @mursalin"


)


public class TestRunnerHooks {

}
