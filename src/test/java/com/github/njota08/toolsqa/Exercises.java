package com.github.njota08.toolsqa;/* ****************************************************************************/
/* ****************************************************************************/

/* ****************************************************************************/

/* ****************************************************************************/

import com.github.njota08.toolsqa.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author Nery J. Marin Salas
 */

public class Exercises extends BaseTest {

    /**
     * http://toolsqa.com/selenium-webdriver/browser-commands/
     * Practice Exercise - 1
     * Gather Basic Page Information
     */
//    @Test
    public void BasicPageInformation() {
        driver.get(StoreDemoPage.STORE_DEMO_QA_URL);
        StoreDemoPage storeDemoPage = new StoreDemoPage(driver);
        storeDemoPage.getBasicPageInformation();
        Assert.assertEquals(driver.getCurrentUrl(), StoreDemoPage.STORE_DEMO_QA_URL + "/", "No URL match.");
    }

    /**
     * http://toolsqa.com/selenium-webdriver/browser-commands/
     * Practice Exercise - 2
     * Difference between driver.close() and driver.quit()
     */
//    @Test
    public void OpenNewWindow() {
        driver.get(FramesAndWindowsPage.FRAMES_AND_WINDOWS_URL);
        FramesAndWindowsPage framesAndWindowsPage = new FramesAndWindowsPage(driver);
        framesAndWindowsPage.openNewWindow();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/browser-navigation-commands/
     * Practice Exercise - 1
     * Uses of WebDriver navigation commands
     */
//    @Test
    public void NavigationPractices() {
        driver.get(DemoQaPage.DEMO_QA_URL);
        DemoQaPage demoQaPage = new DemoQaPage(driver);
        demoQaPage.navigationPractices();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/findelement-and-findelements-command/
     * Practice Exercise - 1 // Locators practice (name, id)
     * Practice Exercise - 2 // Locators practice (partial link text, tag name, link text)
     */
//    @Test
    public void LocatorPracticeOne() {
        driver.get(AutomationPracticeFormPage.AUTOMATION_PRACTICE_FORM_URL);
        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage(driver);
        automationPracticeFormPage.fillPracticeForm();
    }

    //    @Test
    public void LocatorPracticeTwo() {
        driver.get(AutomationPracticeFormPage.AUTOMATION_PRACTICE_FORM_URL);
        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage(driver);
        automationPracticeFormPage.identifyElements();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/checkbox-radio-button-operations/
     * Practice Exercise - 1 // Operations with checkboxes and radio buttons
     */
//    @Test
    public void CheckboxesAndRadioButtons() {
        driver.get(AutomationPracticeFormPage.AUTOMATION_PRACTICE_FORM_URL);
        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage(driver);
        automationPracticeFormPage.selectFemaleRadioButton();
        automationPracticeFormPage.selectYearsOfExpRadioButton();
        automationPracticeFormPage.checkAutomationTesterCheckBox();
        automationPracticeFormPage.checkSeleniumIdeCheckBox();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/
     * Practice Exercise - 1 // Dropdown Box/List
     * Practice Exercise - 2 // Multiple Selection Box/List
     */
//    @Test
    public void DropdownBoxesAndLists() {
        driver.get(AutomationPracticeFormPage.AUTOMATION_PRACTICE_FORM_URL);
        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage(driver);
        automationPracticeFormPage.selectContinents();
    }

    //    @Test
    public void MultipleSelectionBoxesAndLists() {
        driver.get(AutomationPracticeFormPage.AUTOMATION_PRACTICE_FORM_URL);
        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage(driver);
        automationPracticeFormPage.selectSeleniumCommands();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/
     * Practice Exercise - 1 // Get the value from cell "Dubai", print it and click on "Detail" link
     * Practice Exercise - 2 // Get the value from cell "Dubai" and print all the column values of row "Clock Tower Hotel"
     */
//    @Test
    public void TablesPracticeOne() {
        driver.get(AutomationPracticeTablePage.AUTOMATION_PRACTICE_TABLE_URL);
        AutomationPracticeTablePage automationPracticeTablePage = new AutomationPracticeTablePage(driver);
        automationPracticeTablePage.getValueFromDubaiCell();
        automationPracticeTablePage.clickDetailLinkFirstRowAndLastColumn();
    }

    //    @Test
    public void TablesPracticeTwo() {
        driver.get(AutomationPracticeTablePage.AUTOMATION_PRACTICE_TABLE_URL);
        AutomationPracticeTablePage automationPracticeTablePage = new AutomationPracticeTablePage(driver);
        automationPracticeTablePage.getValueFromDubaiCell();
        automationPracticeTablePage.printColumnValuesFromClockTowerHotel();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/wait-commands/
     * Practice Exercise
     * There's an odd behavior in the page causing issues with the test depending on the window resolution.
     */

//    @Test
    public void WaitCommands() {
        driver.get(SwitchWindowsPage.AUTOMATION_SWITCH_WINDOWS_URL);
        SwitchWindowsPage switchWindowsPage = new SwitchWindowsPage(driver);
        switchWindowsPage.waitForTimingAlert();
    }

    /**
     * http://toolsqa.com/selenium-webdriver/switch-commands/
     * Practice Exercise - 1 //
     * Practice Exercise - 1 //
     */

//    @Test
    public void HandleWindowsOne(){
        driver.get(SwitchWindowsPage.AUTOMATION_SWITCH_WINDOWS_URL);
        SwitchWindowsPage switchWindowsPage = new SwitchWindowsPage(driver);
        switchWindowsPage.handleWindows();
    }

    @Test
    public void HandleWindowsTwo(){
        driver.get(SwitchWindowsPage.AUTOMATION_SWITCH_WINDOWS_URL);
        SwitchWindowsPage switchWindowsPage = new SwitchWindowsPage(driver);
        switchWindowsPage.handleAlerts();
    }
}