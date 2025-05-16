package com.e2etests.automation;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/cucumber-report.html"},
		tags = ("@inscription"),
		//glue = {"com.e2etests.automation.step_definitions"},
		monochrome = true,
		snippets = CAMELCASE
		)
public class RunWebSuiteTest {

}
