package org.qa.test.pages;

import org.qa.test.Utils.BaseClass;
import org.qa.test.enums.IdType;

public class HomePage extends BaseClass {

    private static final String SIDE_MENU_XPATH = "//*[@id='react-burger-menu-btn']";
    private static final String LOGOUT_BUTTON = "//*[@id='logout_sidebar_link']";

    public HomePage(){}

    public void openSideMenu() {
        clickOnElement(IdType.XPATH, SIDE_MENU_XPATH);
    }

    public void clickOnLogout() {
        clickOnElement(IdType.XPATH, LOGOUT_BUTTON);
    }
}
