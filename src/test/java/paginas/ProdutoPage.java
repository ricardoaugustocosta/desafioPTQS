package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {
    private WebDriver navegador;

    public ProdutoPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public ProdutoPage escolheUmTamanho(){
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,750)", "");
        navegador.findElement(By.cssSelector("div.product--sizes.f-f-pluto-sans.m-t-16 > ul > li:nth-child(1)")).click();

        return this;
    }

    public SacolaPage adicionaASacola (){
        navegador.findElement(By.cssSelector("#product--add-to-cart-form > div.row-i.row-pdp-inline-mobile > div:nth-child(2) > button")).click();
        return new SacolaPage(navegador);
    }
}
