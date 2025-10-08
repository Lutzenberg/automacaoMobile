import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExemploAutomacaoAppium {

    @Test
    public void primerioExemplo() throws MalformedURLException {


        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setAutomationName("UIAutomator2");
        options.setDeviceName("emulator-5554");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity(".ApiDemos");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();
        driver.findElement(AppiumBy.id("android:id/button1")).click();
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Activity")).click();
        driver.findElement(AppiumBy.accessibilityId("Hello World")).click();
        Assert.assertEquals("Hello, World!",driver.findElement(AppiumBy.accessibilityId("Hello, World!")).getText());

    }
}

