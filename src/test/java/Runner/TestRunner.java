package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = ".//features/SearchProduct.feature",
		features ="C:\\Users\\priya\\eclipse-workspace\\CucumberJunit\\src\\test\\resources\\features\\SearchProduct.feature",
		glue={"stepDefinations"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:C:\\Users\\priya\\eclipse-workspace\\CucumberJunit\\target\\report.html"})

public class TestRunner {
	
	

}
