package com.github.njota08.toolsqa.pages;

import com.github.njota08.toolsqa.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author Nery J. Marin Salas
 */

public class AutomationPracticeFormPage {


    private final WebDriver driver;

    public static final String AUTOMATION_PRACTICE_FORM_URL = "http://toolsqa.com/automation-practice-form/";

    private static final By FIRST_NAME_INPUT = By.name("firstname");

    private static final By LAST_NAME_INPUT = By.name("lastname");

    private static final By SUBMIT_BUTTON_ID = By.id("submit");

    private static final By PARTIAL_LINK_TEXT_LINK = By.partialLinkText("Partial");

    private static final By SUBMIT_BUTTON_TAG_NAME = By.tagName("button");

    private static final By LINK_TEXT_LINK = By.linkText("Link Test");

    private static final By SEX_RADIO_BUTTONS = By.name("sex");

    private static final By YEARS_EXP_THREE = By.id("exp-2");

    private static final By PROFESSION_CHECK_BOXES = By.name("profession");

    private static final By SELENIUM_IDE_CHECK_BOX = By.cssSelector("#tool-1");

    public AutomationPracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPracticeForm() {
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(FIRST_NAME_INPUT))
                .sendKeys("Nery");
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(LAST_NAME_INPUT))
                .sendKeys("Marin");
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(SUBMIT_BUTTON_ID))
                .click();
    }

    public void identifyElements() {
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(PARTIAL_LINK_TEXT_LINK)).click();
        System.out.println(Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(SUBMIT_BUTTON_TAG_NAME)).getText());
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(LINK_TEXT_LINK)).click();
    }

    public void selectFemaleRadioButton() {
        List<WebElement> radioButtons = driver.findElements(SEX_RADIO_BUTTONS);
        Utils.threadSleep();
        boolean bValue = radioButtons.get(1).isSelected();
        if (!bValue) {
            radioButtons.get(1).click();
        } else {
            System.out.println("The \"female\" radio button is already selected.");
        }
    }

    public void selectYearsOfExpRadioButton() {
        boolean bValue = Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(YEARS_EXP_THREE)).isSelected();
        Utils.threadSleep();
        if (!bValue) {
            driver.findElement(YEARS_EXP_THREE).click();
        } else {
            System.out.println("The \"3\" years of experience radio button is already selected.");
        }
    }

    public void checkAutomationTesterCheckBox() {
        List<WebElement> professionCheckBoxes = driver.findElements(PROFESSION_CHECK_BOXES);
        Utils.threadSleep();
        for (WebElement webElement : professionCheckBoxes) {
            String sValue = webElement.getAttribute("value");
            System.out.println(sValue);
            if (sValue.equalsIgnoreCase("Automation Tester")) {
                webElement.click();
                break;
            }
        }
    }

    public void checkSeleniumIdeCheckBox() {
        if (!Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(SELENIUM_IDE_CHECK_BOX)).isSelected()) {
            driver.findElement(SELENIUM_IDE_CHECK_BOX).click();
            Utils.threadSleep();
        }
    }

    public void selectContinents() {
        WebElement continentsDropdown = driver.findElement(By.id("continents"));
        Select select = new Select(continentsDropdown);
        select.selectByIndex(0);
        Utils.threadSleep();
        select.selectByVisibleText("Africa");
        Utils.threadSleep();
        List<WebElement> continentsOptions = select.getOptions();
        for (WebElement webElement : continentsOptions) {
            System.out.println(webElement.getText());
        }
        select.selectByVisibleText("South America");
        Utils.threadSleep();
    }

    public void selectSeleniumCommands() {
        WebElement seleniumCommandsList = driver.findElement(By.name("selenium_commands"));
        Select select = new Select(seleniumCommandsList);
        select.selectByIndex(0);
        Utils.threadSleep();
        select.deselectByIndex(0);
        Utils.threadSleep();
        select.selectByVisibleText("Navigation Commands");
        Utils.threadSleep();
        select.deselectByVisibleText("Navigation Commands");
        Utils.threadSleep();
        List<WebElement> seleniumCommandsOptions = select.getOptions();
        for (WebElement webElement : seleniumCommandsOptions) {
            System.out.println(webElement.getText());
        }
        select.deselectAll();
        Utils.threadSleep();
    }

}