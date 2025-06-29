package org.qa.test.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qa.test.enums.IdType;

import java.time.Duration;

public class BaseClass {

    protected WebDriverWait wait;

    public BaseClass(){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
    }

    public static WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    public WebElement locateElement(IdType idType, String locator) {
        switch (idType) {
            case ID:
                return getDriver().findElement(By.id(locator));
            case NAME:
                return getDriver().findElement(By.name(locator));
            case XPATH:
                return getDriver().findElement(By.xpath(locator));
            case CSS:
                return getDriver().findElement(By.cssSelector(locator));
            case CLASSNAME:
                return getDriver().findElement(By.className(locator));
            case TAGNAME:
                return getDriver().findElement(By.tagName(locator));
            case LINKTEXT:
                return getDriver().findElement(By.linkText(locator));
            case PARTIALLINKTEXT:
                return getDriver().findElement(By.partialLinkText(locator));
            default:
                throw new IllegalArgumentException("Invalid locator type: " + idType);
        }
    }

    public void clickOnElement(WebElement element) {
        try {
            wait.until(driver -> element.isDisplayed() && element.isEnabled());
            element.click();
            System.out.println("Clicked on element: " + element);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + element + ". Reason: " + e.getMessage());
        }
    }

    public void clickOnElement(IdType idType, String locator) {
        WebElement element = locateElement(idType, locator);
        wait.until(driver -> element.isDisplayed() && element.isEnabled());
        element.click();
    }

}
