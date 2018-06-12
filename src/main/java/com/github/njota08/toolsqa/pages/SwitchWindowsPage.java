package com.github.njota08.toolsqa.pages;

import com.github.njota08.toolsqa.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

/**
 * @author Nery J. Marin Salas
 */

public class SwitchWindowsPage {

    private final WebDriver driver;

    public static final String AUTOMATION_SWITCH_WINDOWS_URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";

    private static final By TIMING_ALERT_BUTTON = By.id("timingAlert");

    private static final By NEW_MESSAGE_WINDOW_BUTTON = By.xpath("//button[contains(.,'New Message Window')]");

    private static final By NEW_BROWSER_WINDOW_BUTTON = By.xpath("//button[contains(.,'New Browser Window')]");

    private static final By ALERT_BOX_BUTTON = By.xpath("//button[contains(.,'Alert Box')]");

    public SwitchWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForTimingAlert() {
        Utils.waitFor(driver, ExpectedConditions.visibilityOfElementLocated(TIMING_ALERT_BUTTON)).click();
        Alert timingAlert = Utils.waitFor(driver, ExpectedConditions.alertIsPresent());
        System.out.println(timingAlert.getText());
        timingAlert.accept();
        System.out.println("Timing Alert accepted.");
    }

    public void handleWindows() {
        String windowsId = driver.getWindowHandle();
        System.out.println("My main window is: " + windowsId);
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(NEW_BROWSER_WINDOW_BUTTON)).click();
        Utils.threadSleep();
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(NEW_BROWSER_WINDOW_BUTTON)).click();
        Utils.threadSleep();
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(NEW_MESSAGE_WINDOW_BUTTON)).click();
        Utils.threadSleep();
//        Set handles = driver.getWindowHandles();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (!driver.getWindowHandle().equals(windowsId)) {
                driver.close();
                Utils.threadSleep();
            }
        }
    }

    public void handleAlerts() {
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(ALERT_BOX_BUTTON)).click();
        Utils.threadSleep();
        /** You can use this implementation **/
//        Utils.waitFor(driver, ExpectedConditions.alertIsPresent()).accept();
        /** Or this implementation **/
        driver.switchTo().alert().accept();
        Utils.threadSleep();
    }
}