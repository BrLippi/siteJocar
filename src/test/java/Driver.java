import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Driver {

    String url;
    WebDriver driver;


    @Before

    public void start() {

        url = "https://jocar.com.br";
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Bruno\\IdeaProjects\\siteJocar\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS); //tempo para encontra elementos
        driver.manage().window().maximize();

    }

    @Test


    public void test() {
        driver.get(url);
        WebElement searchbox = driver.findElement(By.id("ctl00_ctl00_mstContentMain_mstCabecalho_CabBusca1_txtDescricao"));
        searchbox.sendKeys("Óleo do motor");
        WebElement searchbutton = driver.findElement(By.id("btnBuscarCabBusca"));
        searchbutton.click();
        WebElement searchResult = driver.findElement(By.className("productName"));
        String result = searchResult.getText();
        result = result.toLowerCase(Locale.ROOT);


        if (result.contains("óleo") || result.contains("Oleo")) {
            System.out.println("Sucesso");
        } else {
            System.out.println("ERRO");
        }

    }


    @After


    public void end() {

        driver.quit();
    }
}
