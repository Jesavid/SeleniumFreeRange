package pages;

public class PaginaPrincipal extends BasePage{
    //definimos nuestro constructor

    public PaginaPrincipal() {
        super(driver);
    }

    //Metodo para navegar a www.google.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.google.com");
    }
}
