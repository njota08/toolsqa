/* ****************************************************************************/
package com.github.njota08.toolsqa;
/* ****************************************************************************/

/* ****************************************************************************/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/* ****************************************************************************/

/**
 * @author Nery J. Marin Salas
 */

public class BaseTest {

    static WebDriver driver;

    @BeforeMethod
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nsalas\\Documents\\Java Projects\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterScenario() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}