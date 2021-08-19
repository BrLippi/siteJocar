import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    public WebDriver Webdriver() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Bruno\\IdeaProjects\\siteJocar\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jocar.com.br");
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        return driver;

    }

}
