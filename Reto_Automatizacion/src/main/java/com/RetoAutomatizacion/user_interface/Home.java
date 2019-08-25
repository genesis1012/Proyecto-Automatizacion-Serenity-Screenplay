package com.RetoAutomatizacion.user_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

/**
 * Esta clase define la pagina principal que se va a cargar y los elementos que se utilizan en dicha pagina
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */

//Url por defecto que siempre se carga al ejecutar el excript
@DefaultUrl("https://www.metro.pe/especiales/cybermetro")
public class Home extends PageObject{
	
	//se define la acion a realizar con el controldar antes de cargar la pagina
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		//se obtiene el controlar y se maximiza al total de la pantalla
		getDriver().manage().window().maximize();
	}

	//se define devolver el controlador para ser administrador
	public WebDriver MyDriver() {
		return getDriver();
	}
	
	//elementos buscador por medio de xpacth y id
	public static final Target Offers = Target.the("special offers")
			.locatedBy("//*[@href='/busca/?fq=H:3514']");
	
	public static final Target Search = Target.the("search product")
			.located(By.id("search-autocomplete-input"));
	
	public static final Target Productfound = Target.the("Product found")
			.locatedBy("//*[@data-sku='{0}']//*[text()='Agregar']");
	
	public static final Target ShoppingCart = Target.the("shopping cart")
			.locatedBy("//*[@class='shelf-content']//*[text()='Ver carrito']");
}
