package mydemoapp.scenarios.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {

    AndroidDriver driver;

    public String produto = "//android.widget.TextView[@content-desc='store item text' and @text='Sauce Labs Backpack']";

    public String btnAddCarrinho = "Add To Cart button";

    public HomePage(AndroidDriver driveScenario) {
        this.driver = driveScenario;
    }

    public void clicarPorXpath(String elemento) {
        driver.findElement(AppiumBy.xpath(elemento)).click();
    }
    public void clicarPorAccId(String elemento) {
        driver.findElement(AppiumBy.accessibilityId(elemento)).click();

    }

}
