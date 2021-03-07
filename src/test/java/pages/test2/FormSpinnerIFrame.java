package pages.test2;

import elements.Button;
import elements.Label;
import elements.TextField;
import org.openqa.selenium.By;
import pages.PageBase;
import utils.AlertUtil;
import utils.UtilIFrame;

public class FormSpinnerIFrame extends PageBase {
    private Button uniqueElement = new Button(By.xpath("//*[@id = 'getvalue']"), "uniqueElementFormIFrame");
    private TextField textField = new TextField(By.xpath("//*[@id = 'spinner']"), "textFieldDigitalValue");
    private Button buttonGetValue = new Button(By.xpath("//*[@id = 'getvalue']"), "buttonGetValue");

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }

    public int enterValueAndClickGetValue(String text) {
        UtilIFrame.switchToFrame(new Label(By.xpath("//*[@class = 'demo-frame']"), "IFrame").getWebElement());
        enterText(text);
        clickBtnGetValue();
        return Integer.parseInt(AlertUtil.getTextAlert());
    }

    private void clickBtnGetValue() {
        buttonGetValue.click();
    }

    private void enterText(String text) {
        textField.enterText(text);
    }
}
