package com.tests.int_task.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/* this class will help us run our tests without running them in feature files

*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/HeroKaupp/MainPageScenario.feature",
        glue = "com/tests/int_task/step_definition",
        dryRun = false,
        tags = "@test1",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {


}
