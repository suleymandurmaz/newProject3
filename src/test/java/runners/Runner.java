package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/Deneme.feature",
        glue="stefdefs"
)
public class Runner extends AbstractTestNGCucumberTests {
}
