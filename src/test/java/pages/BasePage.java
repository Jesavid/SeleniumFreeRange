package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class BasePage {
    /*
     * Declaración de una variable estática dirver de tipo WebDriver
     * Esta Variable va a ser comártida por todas las instancias de BasePage y sus
     * sublcases
     */
    protected static WebDriver driver;

    /*
     * Ddclaración de una variable de isntancia wait de tipo WebDriverWait.
     * Se inicializa inmediantemente con una instancia de WebDriverWait utilizando
     * el driver estático
     * WebDriverWat se usa para poner esperas explicitas en los elementos web
     */

    WebDriverWait wati = new WebDriverWait(driver, Duration.ofSeconds(5));

    /*
     * Configura el WebDriver para Chorme usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el
     * driver del navegador
     */

    static {
        WebDriverManager.chromedriver().setup();

        // Inicialia la variable drive
        driver = new ChromeDriver();
    }

    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento
     */

    public BasePage(WebDriver driver) {
        BasePage.driver = driver; // driver recibe el navegador chrome

    }

    // Método estático para navegar a una URL
    public static void navigateTo(String url) {
        driver.get(url);
    }

}
