package definitions;

import static constans.Constant.URL;
import static org.junit.Assert.assertEquals;
import baseConfig.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GooglePO;
import util.MetodosGenericos;

public class BackgroundGoogle {
	


	@Given("ingreso a google")
	public void ingresoAGoogle() {
		MetodosGenericos.esperar(2);
		String url = DriverContext.getDriver().getCurrentUrl();
		assertEquals(URL, url);
	}


}
