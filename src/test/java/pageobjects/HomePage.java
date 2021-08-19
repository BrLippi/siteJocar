package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class HomePage {

    private WebDriver driver;

    @FindBy(how = How.CSS, using ="#ctl00_ctl00_mstContentMain_mstCabecalho_CabBusca1_carrinhoCab>a")
    private WebElement Carrinho;

    @FindBy(how = How.CSS, using ="#ctl00_ctl00_mstContentMain_mstCabecalho_CabBusca1_txtDescricao")
    private WebElement BarradePesquisa;

    @FindBy(how = How.CSS, using ="#btnBuscarCabBusca")
    private WebElement BotaoPesquisar;


    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this); //inicializa no construtor

        this.driver = driver;  // this para distiguir o driver de fora com o de dentro, classe q estou

    }

    public void AcessaCarrinho(){
        Carrinho.click();

    }

    public void fazerPesquisa(String buscar){
        buscar = buscar.toLowerCase(Locale.ROOT);
        BarradePesquisa.sendKeys(buscar);
        BotaoPesquisar.click();

    }



}
