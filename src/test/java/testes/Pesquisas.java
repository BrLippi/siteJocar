package testes;

import pageobjects.HomePage;
import pageobjects.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import setup.Driver;

public class Pesquisas {

        private WebDriver driver;  // variavel global

        @Before
        public void criarDriver() {
            Driver wdriver = new Driver(); // cria novo objeto a partir da classe driver
            driver = wdriver.Webdriver();

        }


        @org.junit.Test

        public void fazerPesquisaValida() {

            String buscar= "óleo";
            HomePage homePage = new HomePage(driver);
            homePage.fazerPesquisa(buscar);
            SearchPage searchPage = new SearchPage(driver);
            boolean result = searchPage.verificarResultadoValido(buscar);

            Assert.assertTrue(result);

        }

        @After


        public void end() {

            driver.quit();
        }

    }

