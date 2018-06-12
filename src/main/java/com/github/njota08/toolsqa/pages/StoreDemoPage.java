package com.github.njota08.toolsqa.pages;


import org.openqa.selenium.WebDriver;

/**
 * @author Nery J. Marin Salas
 */

public class StoreDemoPage {

    private final WebDriver driver;

    public static final String STORE_DEMO_QA_URL = "http://store.demoqa.com";

    public StoreDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getBasicPageInformation() {
        String pageTitle = driver.getTitle();
        int titleLength = driver.getTitle().length();
        System.out.println("Page's title: " + pageTitle);
        System.out.println("Title's length: " + titleLength);
        System.out.println("Page Source length: " + driver.getPageSource().length());
    }

}