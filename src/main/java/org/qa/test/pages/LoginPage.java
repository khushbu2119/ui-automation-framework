package org.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.test.Utils.BaseClass;

public class LoginPage extends BaseClass {

    @FindBy(id = "user-name")
    private WebElement usernameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void enterUsername(String username) {
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);
    }
}
