package elements;

import config.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.LoggerUtil;
import java.util.List;

public class BaseElement {
    protected By by;
    protected String elementName;

    public BaseElement(By by, String elementName) {
        this.by = by;
        this.elementName = elementName;
    }

    public void click() {
        LoggerUtil.addInfoLog(String.format("clicking on %s.", elementName));
        getWebElement().click();
    }

    public WebElement getWebElement() {
        LoggerUtil.addInfoLog(String.format("getting webElement for %s.", elementName));
        return Browser.getWebDriver().findElement(by);
    }

    public String getAttribute(String nameAtr) {
        LoggerUtil.addInfoLog(String.format("getting attribute %s for %s.", nameAtr, elementName));
        return getWebElement().getAttribute(nameAtr);
    }

    public boolean isDisplayedElement() {
        LoggerUtil.addInfoLog(String.format("checking that %s is displayed.", elementName));
        return getWebElement().isDisplayed();
    }

    public List<WebElement> getListWebElements() {
        LoggerUtil.addInfoLog(String.format("getting list of webElements for %s.", elementName));
        return Browser.getWebDriver().findElements(by);
    }
}
