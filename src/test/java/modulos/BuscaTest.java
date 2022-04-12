package modulos;

import net.jodah.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.HomePage;
import paginas.SacolaPage;


@DisplayName("Desafio de teste em um e-commerce")
public class BuscaTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        this.navegador.manage().window().maximize();

        this.navegador.get("https://www.marisa.com.br/");
    }
    @Test
    @DisplayName("Adicionar um produto à sacola")
    public void testAdicionarUmProdutoASacola() {

        new HomePage(navegador)
                .acessaUmaCategoria()
                .selecionaUmProduto()
                .escolheUmTamanho()
                .adicionaASacola()
                .validaQueEstaNaSacola();

        //Assertions.assertEquals("Finalizar Compra", textoElement);
    }

    @AfterEach
    public void afterEach(){
        navegador.quit();

    }
}