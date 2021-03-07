package utils;

import config.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class KeyboardActionsUtil {

    public static void useArrowDownToOptionAndClick(String option, List<WebElement> list) {
        Actions actions = new Actions(Browser.getWebDriver());
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            WebElement element = list.get(i);
            if (element.getText().toLowerCase().equals(option.toLowerCase())) {
                result = i;
                break;
            }
        }

        for (int i = 0; i <= result; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
