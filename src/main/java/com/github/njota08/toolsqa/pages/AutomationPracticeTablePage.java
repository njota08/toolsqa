package com.github.njota08.toolsqa.pages;

import com.github.njota08.toolsqa.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * @author Nery J. Marin Salas
 */

public class AutomationPracticeTablePage {

    private final WebDriver driver;

    public static final String AUTOMATION_PRACTICE_TABLE_URL = "http://toolsqa.com/automation-practice-table/";

    private static final By DUBAI_CITY = By.xpath("//tbody/tr[1]/td[contains(.,'Dubai')]");

    private static final By FIRST_ROW_DETAILS = By.xpath("//tbody/tr[1]/td/a");

    public AutomationPracticeTablePage(WebDriver driver) {
        this.driver = driver;
    }


    public void getValueFromDubaiCell() {
        System.out.println(Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(DUBAI_CITY)).getText());
    }

    public void clickDetailLinkFirstRowAndLastColumn() {
        Utils.waitFor(driver, ExpectedConditions.presenceOfElementLocated(FIRST_ROW_DETAILS)).click();
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.equalsIgnoreCase(AUTOMATION_PRACTICE_TABLE_URL)) {
            System.out.println("The \"Details\" link was clicked successfully.");
        }
    }

    public void printColumnValuesFromClockTowerHotel() {
        for (int i = 1; i < 6; i++) {
            String clockHotelTowerRow = "//table/tbody/tr[2]/td[" + i + "]";
            if (!(driver.findElement(By.xpath(clockHotelTowerRow)).getText()).equalsIgnoreCase("details")) {
                System.out.println(driver.findElement(By.xpath(clockHotelTowerRow)).getText());
            }
        }
    }
}