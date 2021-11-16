package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLAFORM_AND_BROWSER;
import static constants.Constats.TimeoutVariable.IMP_WAIT;

public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLAFORM_AND_BROWSER) {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name: -> " + PLAFORM_AND_BROWSER);
                // другие драйвера для ОС и браузеры
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMP_WAIT, TimeUnit.SECONDS);
        return driver;
    }

}
