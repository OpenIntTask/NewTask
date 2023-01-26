package com.tests.int_task.step_definition;

import com.tests.int_task.pages.IntHeroKauppMainPage;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDef {


    /*
    DriverHelper is used as a reusable method from Singleton Patter Design to encapsulate
    my driver so that no one can create object from that class
     */
    WebDriver driver = DriverHelper.getDriver();

    IntHeroKauppMainPage mainPage = new IntHeroKauppMainPage(driver);



        @When("User navigates to web app and validates the {string}")
        public void user_navigates_to_web_app_and_validates_the(String title) {
            driver.get(ConfigReader.readProperty("heroKauppUrl"));
            Assert.assertEquals(title, driver.getTitle());
        }
        @When("User validates all the links on the page are displayed")
        public void user_validates_all_the_links_on_the_page_are_displayed() {
            mainPage.validateElements();
    }
}
