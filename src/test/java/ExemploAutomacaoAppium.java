import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExemploAutomacaoAppium {

    AndroidDriver driver;

    @Before
    public void before() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setAutomationName("UIAutomator2");
        options.setDeviceName("emulator-5554");
        options.setApp("C:\\Users\\Lut\\IdeaProjects\\automacaoMobile\\src\\test\\resources\\ApiDemos-debug.apk");
        options.setNoReset(true);
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity(".ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void primerioExemplo() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Activity")).click();
        driver.findElement(AppiumBy.accessibilityId("Hello World")).click();

        // Valida o texto exibido
        Assert.assertEquals("Hello, World!", driver.findElement(AppiumBy.id("io.appium.android.apis:id/text")).getText());

        // Valida a activity atual
        String activity = driver.currentActivity();
        Assert.assertEquals(".app.HelloWorld", activity);
    }

    @Test
    public void scrollDown() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        // Documnetacao UiScrollable  https://github.com/appium/appium/issues/16690
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                + "new UiSelector().text(\"WebView\"));"));


    }
}

