package elements;

import org.openqa.selenium.By;
import utils.LoggerUtil;

public class TextField extends BaseElement{
    public TextField(By by, String elementName) {
        super(by, elementName);
    }
    public void enterText(String text){
        LoggerUtil.addInfoLog(String.format("entering text '%s' in %s.", text, elementName));
        getWebElement().sendKeys(text);
    }
}
