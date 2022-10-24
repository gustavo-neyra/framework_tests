package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePO;

public class GoogleBuscar {

    GooglePO googlePO = new GooglePO();

    @When("Ingreso {string} en la barra de busqueda")
    public void ingresoEnLaBarraDeBusqueda(String buscar) {
        googlePO.ingresarTexto(buscar);
        googlePO.Buscar();

    }

    @And("selecciono e ingreso al resultado {string}")
    public void seleccionoEIngresoAlResultado(String busqueda) {
        googlePO.ingresarResultado(busqueda);
    }


    @Then("ingreso a la pagina de {string}")
    public void ingresoALaPaginaDe(String res) {
    }
}
