package mydemoapp.scenarios.page;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends ComumPage {

    AndroidDriver driver;

    public String produto = "//android.widget.TextView[@content-desc='store item text' and @text='Sauce Labs Backpack']";

    public String btnAddCarrinho = "Add To Cart button";

    public String Carinho = "//android.view.ViewGroup[@content-desc='cart badge']/android.widget.ImageView";

    public HomePage(AndroidDriver driveScenario) {
        super(driveScenario);
        this.driver = driveScenario;
    }


}
