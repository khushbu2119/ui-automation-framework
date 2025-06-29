package org.qa.test.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
     if(driver == null) {
         WebDriverManager.chromedriver().setup();
         ChromeOptions options = setupBrowserConfiguration();
         driver = new ChromeDriver(options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     return driver;
    }

    private static ChromeOptions setupBrowserConfiguration() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-save-password-bubble");
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false
        ));
        return options;
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
