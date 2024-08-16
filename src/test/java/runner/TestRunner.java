package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", // Directorio de nuestros archivos .feature
glue="steps",// Con glue junta los 2 elementos con los steps escritos en feature file 
// agregamos una funcion para generar un reporte de lo que va a suceder al momento de ejecutar
plugin = {"pretty","html:target/cucumber-reports"}) 


public class TestRunner {
    
}
