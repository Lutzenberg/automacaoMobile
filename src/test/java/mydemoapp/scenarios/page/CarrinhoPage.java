package mydemoapp.scenarios.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class CarrinhoPage extends ComumPage {

    AndroidDriver driver;

    public String btnAddIrParaCheckout = "Proceed To Checkout button";
    String btnAddIntemNoCarrinho = "//android.view.ViewGroup[@content-desc='counter plus button']/android.widget.ImageView";

    public CarrinhoPage(AndroidDriver driverTeste) {
        super(driverTeste);
        this.driver = driverTeste;

    }

    public void alterarAquantidadeParaTres() {
        driver.findElement(AppiumBy.xpath(btnAddIntemNoCarrinho)).click();
        driver.findElement(AppiumBy.xpath(btnAddIntemNoCarrinho)).click();

    }


}
