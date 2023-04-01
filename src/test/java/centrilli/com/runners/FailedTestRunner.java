package centrilli.com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/step_definitons",
        features = "@target/rerun.txt"

)

public class FailedTestRunner {

}
