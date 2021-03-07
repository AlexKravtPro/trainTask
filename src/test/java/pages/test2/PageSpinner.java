package pages.test2;

import elements.Label;
import org.openqa.selenium.By;
import pages.PageBase;

public class PageSpinner extends PageBase {
    private Label uniqueElement = new Label(By.xpath("//*[@class = 'demo-frame']"), "uniqueElementPageSpinner");
    private FormSpinnerIFrame formSpinnerIFrame = new FormSpinnerIFrame();

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }

    public FormSpinnerIFrame getFormIFrame() {
        return formSpinnerIFrame;
    }
}
