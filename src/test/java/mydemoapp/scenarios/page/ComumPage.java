package mydemoapp.scenarios.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ComumPage {

    AndroidDriver driver;

    public ComumPage(AndroidDriver driveScenario) {
        this.driver = driveScenario;
    }


    public void clicarPorXpath(String elemento) {
        driver.findElement(AppiumBy.xpath(elemento)).click();
    }
    public void clicarPorAccId(String elemento) {
        driver.findElement(AppiumBy.accessibilityId(elemento)).click();

    }
}
