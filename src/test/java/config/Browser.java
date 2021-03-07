package config;

import constants.ConstantsConfigData;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static WebDriver driver;

    private Browser() {
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver(PropertyReaderConfigData.getProperty(ConstantsConfigData.BROWSER));
            return driver;
        }
        return driver;
    }

    public static void setMaxSize() {
        driver.manage().window().maximize();
    }

    public static void setImplicitWait(long time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void setUrl(String url) {
        driver.get(url);
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }
}
