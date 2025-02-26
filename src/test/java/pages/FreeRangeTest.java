package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class FreeRangeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Este metodo inicializa el webDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosAFreeRangeTesters() {
        // Navegamos a la pagina web
        driver.get("https://www.google.com");
        
    }
    
    @AfterMethod
    public void tearDown() throws InterruptedException {
        // Cierra el navegador despues de la prueba
        
        if (driver != null) {
            driver.quit();
        }
    }
}
