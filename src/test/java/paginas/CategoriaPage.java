package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriaPage {
    private WebDriver navegador;

    public CategoriaPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public ProdutoPage selecionaUmProduto(){
        navegador.findElement(By.cssSelector("div.container.product-grid-page > div > div:nth-child(1) > div > section > div.m-t-32.m-t-0-sm > div > div:nth-child(1)")).click();

        return new ProdutoPage(navegador);
    }
}
