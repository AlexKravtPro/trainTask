package pages;

import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class FormLeftMenuBar extends PageBase {
    private Button buttonSpinner = new Button(By.xpath("//*[@class = 'widget']//*[text() = 'Spinner']"), "buttonSpinner");
    private Button uniqueElement = new Button(By.xpath("//*[@id = 'sidebar']"), "uniqueElementFormLeftMenuBar");
    private Button buttonAutocomplete = new Button(By.xpath("//*[@class = 'widget']//*[text() = 'Autocomplete']"), "buttonAutocomplete");

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }

    public boolean isSectionPresent(String text) {
        return new Label(By.xpath("//*[@class = 'widget']/h3"), "section " + text + " Label").getListWebElements().stream().anyMatch(element -> element.getText().toLowerCase().equals(text.toLowerCase()));
    }

    public void clickButtonSpinner() {
        buttonSpinner.click();
    }

    public void clickButtonAutocomplete() {
        buttonAutocomplete.click();
    }
}
