package mydemoapp.scenarios.page;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends ComumPage {

    AndroidDriver driver;

    public String inputIdUserName = "Username input field";

    public String inputIdPassWord = "Password input field";

    public String btnCheckout = "Proceed To Checkout button";

    public String btnIdLogin = "Login button";

    public LoginPage(AndroidDriver driveScenario) {
        super(driveScenario);
        this.driver = driveScenario;
    }
}
