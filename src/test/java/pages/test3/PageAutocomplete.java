package pages.test3;

import elements.Label;
import org.openqa.selenium.By;
import pages.PageBase;

public class PageAutocomplete extends PageBase {
    private Label uniqueElement = new Label(By.xpath("//*[@class = 'desc']"), "uniqueElementPageAutocomplete");
    private FormAutocompleteIFrame formAutocompleteIFrame = new FormAutocompleteIFrame();

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }

    public FormAutocompleteIFrame getFormAutocompleteIFrame() {
        return formAutocompleteIFrame;
    }
}
