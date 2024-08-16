package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("Navego a www.google.com") //debe ser igual al especificado en el archivo .feature

    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }

}
