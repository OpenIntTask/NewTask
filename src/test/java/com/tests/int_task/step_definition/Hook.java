package com.tests.int_task.step_definition;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {

     WebDriver driver = DriverHelper.getDriver();

    @Before
    public void navigation() {
       // driver.get(ConfigReader.readProperty("heroKauppUrl"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
