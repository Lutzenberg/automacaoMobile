package mydemoapp.scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import mydemoapp.scenarios.page.*;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TesteCompraProduto {

    AndroidDriver driver;
    HomePage homePage;
    CarrinhoPage carrinhoPage;
    LoginPage loginPage;
    CheckoutPage checkoutPage;


    @Before
    public void before() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setAutomationName("UIAutomator2");
        options.setDeviceName("emulator-5554");
        options.setApp("C:\\Users\\Lut\\IdeaProjects\\automacaoMobile\\src\\test\\resources\\Android-MyDemoAppRN.1.3.0.build-244 (1).apk");
        options.setNoReset(false);
        options.setAppPackage("com.saucelabs.mydemoapp.rn");
        options.setAppActivity(".MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homePage = new HomePage(driver);
        carrinhoPage = new CarrinhoPage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);

    }

    @Test
    public void testeComprarProdutoApp() {
        homePage.clicarPorXpath(homePage.produto);
        homePage.clicarPorAccId(homePage.btnAddCarrinho);
        homePage.clicarPorXpath(homePage.Carinho);
        carrinhoPage.alterarAquantidadeParaTres();
        loginPage.clicarPorAccId(loginPage.btnCheckout);
        loginPage.preencherCampoTextoPorAccId(loginPage.inputIdUserName, "bob@example.com");
        loginPage.preencherCampoTextoPorAccId(loginPage.inputIdPassWord, "10203040");
        loginPage.clicarPorAccId(loginPage.btnIdLogin);
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdFullName, "Jose");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdAddress1, "Av Roberto, 300");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdCity, "Niteroi");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdZipCode, "89750");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdRegion, "Rio de Janeiro");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdCountry, "Brasil");
        checkoutPage.clicarPorAccId(checkoutPage.btnIrParaPagamento);
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdNomeDoCartao, "Jose");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdNumeDoCartao, "5495 4858 6516 4283");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdValidaDoCartao, "10/26");
        checkoutPage.preencherCampoTextoPorAccId(checkoutPage.inputIdNumeDeSegDoCartao, "556");
        checkoutPage.clicarPorAccId(checkoutPage.btnRevisarPedidoDoCartao);
        checkoutPage.validarQuantidadeProduto(checkoutPage.idTotalDoItem,"3 items");
        checkoutPage.validarNoomeProduto(checkoutPage.idNomeProduto,"Sauce Labs Backpack");
        checkoutPage.clicarPorAccId(checkoutPage.btnConfirmarPedido);


    }

}
