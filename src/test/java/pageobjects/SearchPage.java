package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

@FindBy(how = How.CSS, using = ".link4")
private List<WebElement> resultados;

public SearchPage(WebDriver driver){
    PageFactory.initElements(driver, this);
    this.driver = driver;

}

public boolean verificarResultadoValido(String buscar) {

    for (int i = 0; i < resultados.size(); i++) {
        String result = resultados.get(i).getText().toLowerCase();
        if (result.contains(buscar)) {
            return true;
        }
    }

    return false; //se nao encontrar tudo o que procurou retorna falso

}

}
