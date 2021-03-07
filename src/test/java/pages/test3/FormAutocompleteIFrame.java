package pages.test3;

import elements.Label;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.PageBase;
import utils.KeyboardActionsUtil;
import utils.UtilIFrame;
import java.util.List;

public class FormAutocompleteIFrame extends PageBase {
    private Label uniqueElement = new Label(By.xpath("//*[@class = 'ui-widget']"), "uniqueElementFormAutocompleteIFrame");
    private TextField textField = new TextField(By.xpath("//*[@id= 'tags']"), "textFieldTags");

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }

    public String typeTagsAndSelectOption(String text, String option) {
        UtilIFrame.switchToFrame(new Label(By.xpath("//*[@class = 'demo-frame']"), "IFrame").getWebElement());
        enterText(text);
        useArrowDownToOptionAndClick(option);
        String result = textField.getAttribute("value");
        return result;
    }

    private void enterText(String text) {
        textField.enterText(text);
    }

    private void useArrowDownToOptionAndClick(String option) {
        List<WebElement> list = new Label(By.xpath("//*[@class = 'ui-menu-item-wrapper']"), "ListOfOptions").getListWebElements();
        KeyboardActionsUtil.useArrowDownToOptionAndClick(option, list);
    }
}
