package com.github.njota08.toolsqa.pages;

import com.github.njota08.toolsqa.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author
 */

public class DemoQaPage {

    private final WebDriver driver;

    public static final String DEMO_QA_URL = "http://www.DemoQA.com";

    private static final By REGISTRATION_LINK = By.id("menu-item-374");

    public DemoQaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigationPractices() {
        Utils.waitFor(driver,ExpectedConditions.presenceOfElementLocated(REGISTRATION_LINK)).click();
        driver.navigate().back();
        Utils.threadSleep();
        driver.navigate().forward();
        Utils.threadSleep();
        driver.navigate().to(DEMO_QA_URL);
        Utils.threadSleep();
        driver.navigate().refresh();
        Utils.threadSleep();
    }



}