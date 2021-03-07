package utils;

import config.Browser;
import org.openqa.selenium.WebElement;

public class UtilIFrame {
    public static void switchToFrame(WebElement element) {
        Browser.getWebDriver().switchTo().frame(element);
    }
}
