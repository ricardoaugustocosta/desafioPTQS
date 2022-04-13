package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver navegador;

    public HomePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public CategoriaPage acessaUmaCategoria(){
        navegador.findElement(By.cssSelector("div > ul.container-main-categories > li:nth-child(2)")).click();

        return new CategoriaPage(navegador);
    }
}
