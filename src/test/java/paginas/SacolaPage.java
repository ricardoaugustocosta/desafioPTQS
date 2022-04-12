package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SacolaPage {
    private WebDriver navegador;

    public SacolaPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public SacolaPage validaQueEstaNaSacola (){
        navegador.findElement(By.xpath("//a[@href='/']")).isDisplayed();

//        JavascriptExecutor js = (JavascriptExecutor) navegador;
//        js.executeScript("window.scrollBy(0,1000)", "");
//
//        navegador.findElement(By.cssSelector(".btn-lg")).click();

        return this;

    }
}
