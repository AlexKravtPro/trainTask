package utils;

import config.Browser;

public class AlertUtil {
    public static String getTextAlert() {
        return Browser.getWebDriver().switchTo().alert().getText();
    }
}
