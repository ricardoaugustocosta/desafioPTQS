package modulos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.HomePage;

@DisplayName("Desafio de teste em um e-commerce")
public class BuscaTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
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
                .vejaQueEstaNaSacola();
    }

    @AfterEach
    public void afterEach(){
        navegador.quit();
    }
}