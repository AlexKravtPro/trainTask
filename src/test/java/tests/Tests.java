package tests;

import constants.FirstTestData;
import constants.SecondTestData;
import constants.ThirdTestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageDemos;
import pages.test2.PageSpinner;
import pages.test3.PageAutocomplete;
import utils.LoggerUtil;

public class Tests extends BaseTest {
    PageDemos pageDemos = new PageDemos();

    @Test
    public void test1() {
        LoggerUtil.addInfoLog("running test1");
        LoggerUtil.addInfoLog("Step 1 - Open website.");
        Assert.assertTrue(pageDemos.checkUniqueElementOfPage(), "we navigated to incorrect website.");
        LoggerUtil.addInfoLog("Step 2 - Checking that section " + FirstTestData.FIRST_SECTION + " is present.");
        Assert.assertTrue(pageDemos.getFormLeftMenuBar().isSectionPresent(FirstTestData.FIRST_SECTION), String.format("Section %s is not present.", FirstTestData.FIRST_SECTION));
        LoggerUtil.addInfoLog("Step 3 - Checking that section " + FirstTestData.SECOND_SECTION + " is present.");
        Assert.assertTrue(pageDemos.getFormLeftMenuBar().isSectionPresent(FirstTestData.SECOND_SECTION), String.format("Section %s is not present.", FirstTestData.SECOND_SECTION));
        LoggerUtil.addInfoLog("Step 4 - Checking that section " + FirstTestData.THIRD_SECTION + " is present.");
        Assert.assertTrue(pageDemos.getFormLeftMenuBar().isSectionPresent(FirstTestData.THIRD_SECTION), String.format("Section %s is not present.", FirstTestData.THIRD_SECTION));
        LoggerUtil.addInfoLog("Step 5 - Checking that section " + FirstTestData.FOURTH_SECTION + " is present.");
        Assert.assertTrue(pageDemos.getFormLeftMenuBar().isSectionPresent(FirstTestData.FOURTH_SECTION), String.format("Section %s is not present.", FirstTestData.FOURTH_SECTION));
        LoggerUtil.addInfoLog("ending test1");
    }

    @Test
    public void test2() {
        PageSpinner pageSpinner = new PageSpinner();
        LoggerUtil.addInfoLog("running test2");
        LoggerUtil.addInfoLog("Step 1 - Open website.");
        Assert.assertTrue(pageDemos.checkUniqueElementOfPage(), "we navigated to incorrect website.");
        LoggerUtil.addInfoLog("Step 2 - Clicking section" + SecondTestData.SELECTED_SECTION + ".");
        pageDemos.getFormLeftMenuBar().clickButtonSpinner();
        LoggerUtil.addInfoLog("Step 3 - Entering value " + SecondTestData.DIGITAL_VALUE + " and clicking getValue and checking value.");
        Assert.assertEquals(pageSpinner.getFormIFrame().enterValueAndClickGetValue(String.valueOf(SecondTestData.DIGITAL_VALUE)), SecondTestData.DIGITAL_VALUE, "Our received value not equal " + SecondTestData.DIGITAL_VALUE + " .");
        LoggerUtil.addInfoLog("ending test2");
    }

    @Test
    public void test3() {
        PageAutocomplete pageAutocomplete = new PageAutocomplete();
        LoggerUtil.addInfoLog("running test3");
        LoggerUtil.addInfoLog("Step 1 - Open website.");
        Assert.assertTrue(pageDemos.checkUniqueElementOfPage(), "we navigated to incorrect website.");
        LoggerUtil.addInfoLog("Step 2 - Clicking section" + ThirdTestData.SELECTED_SECTION + ".");
        pageDemos.getFormLeftMenuBar().clickButtonAutocomplete();
        LoggerUtil.addInfoLog("Step 3 - Entering value " + ThirdTestData.TEXT_VALUE + " and selecting option " + ThirdTestData.OPTION + " and checking value.");
        String actualResult = pageAutocomplete.getFormAutocompleteIFrame().typeTagsAndSelectOption(ThirdTestData.TEXT_VALUE, ThirdTestData.OPTION);
        Assert.assertEquals(actualResult, ThirdTestData.OPTION, actualResult + "is a incorrect value.");
        LoggerUtil.addInfoLog("ending test3");
    }
}
