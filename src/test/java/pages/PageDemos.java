package pages;

import elements.Button;
import org.openqa.selenium.By;

public class PageDemos extends PageBase {
    private FormLeftMenuBar formLeftMenuBar = new FormLeftMenuBar();
    private Button uniqueElement = new Button(By.xpath("//*[@id= 'content']"), "uniqueElementPageMain");

    public FormLeftMenuBar getFormLeftMenuBar() {
        return formLeftMenuBar;
    }

    @Override
    public boolean checkUniqueElementOfPage() {
        return uniqueElement.isDisplayedElement();
    }
}
