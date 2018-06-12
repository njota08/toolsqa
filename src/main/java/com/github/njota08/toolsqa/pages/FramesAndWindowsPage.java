package com.github.njota08.toolsqa.pages;

import com.github.njota08.toolsqa.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author
 */

public class FramesAndWindowsPage {

    private final WebDriver driver;

    public static final String FRAMES_AND_WINDOWS_URL = "http://demoqa.com/frames-and-windows/";

    private static final By NEW_WINDOW_BOX = By.id("ui-id-1");

    private static final By NEW_BROWSER_TAB_LINK = By.xpath("//a[contains(.,'New Browser Tab')]");

    public FramesAndWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openNewWindow() {
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(NEW_WINDOW_BOX)).click();
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(NEW_BROWSER_TAB_LINK)).click();
    }
}