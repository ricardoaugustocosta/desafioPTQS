package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CategoriaPage {
    private WebDriver navegador;

    public CategoriaPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public ProdutoPage selecionaUmProduto(){
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,750)", "");
        navegador.findElement(By.cssSelector("div.m-t-32.m-t-0-sm > div > div:nth-child(1)")).click();

        return new ProdutoPage(navegador);
    }
}
