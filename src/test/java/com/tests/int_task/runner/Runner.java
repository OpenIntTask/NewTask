package com.tests.int_task.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/* this class will help us run our tests without running them in feature files
    Cucumber options will allow us to locate where our files are located and indicate which tag will it run
*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/HeroKaupp/MainPageScenario.feature", // location to feature files that written in Gherkin Language
        glue = "com/tests/int_task/step_definition", // location of stepDef class where actually our validations take place
        dryRun = false, // make it true to get empty snippets
        tags = "@test1", // tag to indicate with scenario to run
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"} // these are for test result purposes. It will generate html report
)
public class Runner {


}
