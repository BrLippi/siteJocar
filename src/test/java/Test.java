import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Test {

    private WebDriver driver;  // variavel global

    @Before
    public void Driver() {
        Driver wdriver = new Driver(); // cria novo objeto a partir da classe driver
        driver = wdriver.Webdriver();

    }


    @org.junit.Test


    public void Search() {        // metodo de busca

        String buscar = "Óleo do motor";

        driver.findElement(By.id("ctl00_ctl00_mstContentMain_mstCabecalho_CabBusca1_txtDescricao")).sendKeys(buscar.toLowerCase());
        driver.findElement(By.id("btnBuscarCabBusca")).click();
        //String result = driver.findElement(By.className("productName")).getText();

        List<WebElement> results = driver.findElements(By.cssSelector(".link4")); // encontra varios elementos
        WebElement result = results.get(0);
        System.out.println("Quantidade de itens encontrados:" + results.size());
        System.out.println("Itens encontrados:");

        for (int i = 0; i < results.size(); i++) {
            System.out.println(i + ":" + results.get(i).getText());   //lista a quantidade encontrada

        }
    }


    public void Acess(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jocar.com.br");

    }

    @After


    public void end() {

        driver.quit();
    }
}

