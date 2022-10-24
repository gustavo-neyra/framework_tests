package pages;

import baseConfig.DriverContext;
import io.cucumber.java.an.E;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MetodosGenericos;

import java.util.TreeMap;

public class GooglePO {
    private WebDriver driver;



    private static final Logger log = LoggerFactory.getLogger(GooglePO.class);

    public GooglePO(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@name=\"q\"]")
    WebElement searchBar;

    @FindBy(xpath = "(//input[@name=\"btnK\"])[1]")
    WebElement btnBuscar;



    public void ingresarTexto(String text){
        try {
            MetodosGenericos.waitExplicit(searchBar, 5);
            searchBar.sendKeys(text);
        }
        catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e){
            log.error("Se produce error al encontrar el elemento: " + "seacrhBar");
        }
        catch (Exception e){
            log.error("exepción no programada: " + e);
        }

    }

    public void Buscar(){
        try {
            MetodosGenericos.waitExplicit(btnBuscar, 5);
            btnBuscar.click();
        }
        catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e){
            log.error("Se produce error al encontrar el elemento: " + "btnBuscar");
        }
        catch (Exception e){
            log.error("exepción no programada: " + e);
        }
    }

    public void ingresarResultado(String busqueda){
        try {
            MetodosGenericos.buscarElemento("//h3[contains(text()," +busqueda +")]").click();
        }
        catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e){
            log.error("Se produce error al encontrar el elemento: " + "//h3[contains(text()," +busqueda +")]");
        }
        catch (Exception e){
            log.error("exepción no programada: " + e);
        }
    }
    public void PaginaEncontrada(String res){
        try {

        }
        catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e){
            log.error("Se produce error al encontrar el elemento: " + "(//a[@href=\"https://www.tsoftglobal.com/adn-tsoft/\"])[1]");
        }
        catch (Exception e){
            log.error("exepción no programada: " + e);
        }
    }


}
