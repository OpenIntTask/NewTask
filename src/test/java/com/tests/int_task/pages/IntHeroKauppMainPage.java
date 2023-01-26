package com.tests.int_task.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IntHeroKauppMainPage {

    public IntHeroKauppMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a")
    List<WebElement> allElements;

    /* This method traverses through all webElements and validates that all elements are displayed.

    Looping through because we're storing all webElements in a List and size of the loop is allElements.size

    Assert.assertTrue is used for validation as per requirement, and it is provided from JUnit
    */
    public void validateElements(){

        for (int i = 1; i < allElements.size()-1; i++) {
            System.out.println(allElements.get(i).getText());
            Assert.assertTrue(allElements.get(i).isDisplayed());

        }

    }






}
