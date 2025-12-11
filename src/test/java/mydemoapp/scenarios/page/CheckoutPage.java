package mydemoapp.scenarios.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class CheckoutPage extends ComumPage {

    AndroidDriver driver;

    public String inputIdFullName = "Full Name* input field";

    public String inputIdAddress1 = "Address Line 1* input field";

    public String inputIdCity = "City* input field";

    public String inputIdZipCode = "Zip Code* input field";

    public String inputIdRegion = "State/Region input field";

    public String inputIdCountry = "Country* input field";

    public String btnIrParaPagamento = "To Payment button";

    public String inputIdNomeDoCartao = "Full Name* input field";

    public String inputIdNumeDoCartao = "Card Number* input field";

    public String inputIdValidaDoCartao = "Expiration Date* input field";

    public String inputIdNumeDeSegDoCartao = "Security Code* input field";

    public String btnRevisarPedidoDoCartao = "Review Order button";

    public String idTotalDoItem = "total number";

    public String idNomeProduto = "product label";

    public String btnConfirmarPedido = "Place Order button";


    public CheckoutPage(AndroidDriver driveScenario) {
        super(driveScenario);
        this.driver = driveScenario;
    }

    public void validarNoomeProduto(String elemento, String valorEsperado) {
        String valorAtual = driver.findElement(AppiumBy.accessibilityId(elemento)).getText();
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    public void validarQuantidadeProduto(String elemento, String valorEsperado) {
        String valorAtual = driver.findElement(AppiumBy.accessibilityId(elemento)).getText();
        Assert.assertEquals(valorEsperado,valorAtual);
    }
}
