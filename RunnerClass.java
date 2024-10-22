package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/Login.featuer",
					glue="stepDefinition",
					monochrome=true)
					
public class RunnerClass extends AbstractTestNGCucumberTests {

	
}
