package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SacolaPage {
    private WebDriver navegador;

    public SacolaPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public SacolaPage vejaQueEstaNaSacola (){
        navegador.findElement(By.xpath("//a[@href='/']"));

        return this;
    }
}
