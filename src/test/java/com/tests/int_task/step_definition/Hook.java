package com.tests.int_task.step_definition;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {


    //Normally this class is used to run before action takes place and after. But in this case driver.get is not functional probably due to dependency issues

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
