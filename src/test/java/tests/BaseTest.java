package tests;

import config.Browser;
import config.PropertyReaderConfigData;
import constants.ConstantsConfigData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.LoggerUtil;

public class BaseTest {
    @BeforeMethod
    void setup(){
        LoggerUtil.addInfoLog("installing driver");
        Browser.getWebDriver();
        Browser.setMaxSize();
        Browser.setImplicitWait(Integer.parseInt(PropertyReaderConfigData.getProperty(ConstantsConfigData.IMPLICIT_WAIT)));
        Browser.setUrl(PropertyReaderConfigData.getProperty(ConstantsConfigData.URL));
    }

    @AfterMethod
    void exit(){
        LoggerUtil.addInfoLog("closing driver");
        Browser.closeDriver();
    }
}
