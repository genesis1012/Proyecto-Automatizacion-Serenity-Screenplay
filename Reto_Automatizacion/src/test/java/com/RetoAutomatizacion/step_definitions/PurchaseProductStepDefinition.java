package com.RetoAutomatizacion.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.RetoAutomatizacion.model.Product;
import com.RetoAutomatizacion.questions.isProduct;
import com.RetoAutomatizacion.tasks.GoTo;
import com.RetoAutomatizacion.tasks.OpenWeb;
import com.RetoAutomatizacion.tasks.Search;
import com.RetoAutomatizacion.user_interface.Home;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PurchaseProductStepDefinition {
	
	/**
	 * Esta clase define los pasos de la automatizacion
	 * @author: Heriberto Genes G.
	 * @version: 24/08/2019
	 */
	
	//Administrador del driver, este paso define el buscador que se va a usar.
	@Managed(driver = "chrome")
	private Home home;
	
	//Actor: define la persona la cual va a ejecutar la automatizacion.
	private Actor Heri = Actor.named("Heri");
	
	//se definen los privilegios que puede tener el actor en la ejecucion.
	//Se observa que se le dan los privilegios de controlar el controldar que llega desde administrador del pageObjet
	@Before
    public void HeriCanBrowseTheWeb() {
		Heri.can(BrowseTheWeb.with(home.MyDriver()));
    }
	
	//se definen las precondiciones las cuales son carga la pagina de metro y posicionarse en la pagina de Ofertas especiales
	@Given("^I'm on the Metro special offers page$")
	public void imOnTheMetroSpecialOffersPage() throws Exception {
		//en esta parate se abre el buscador y se carga la pagina de metro
		Heri.wasAbleTo(OpenWeb.HomePage());
		//en esta parte se direcciona a la pagina de ofertas especiales
		Heri.wasAbleTo(GoTo.Offers());
	}
	
	//se define la prueba a realizar la cual es buscar un producto y agregarlo al carrito
	@When("^I look for the product with name (.*) and sku (.*) and add it to the shopping cart$")
	public void i_look_for_the_product_with_name_Queso_and_sku_and_add_it_to_the_shopping_cart(String Product, String SKU) throws Exception {
		//se define que el actor busca un producto identificado con numbre y sku
		Heri.wasAbleTo(Search.Product(new Product(Product, SKU)));
	}
	
	//en esta parte se define las acciones a realizar para buscar el resultado espero 
	//y se pregunta por el producto en el carrito de compra
	@Then("^the product (.*) must be added$")
	public void the_product_must_be_added(String Product) throws Exception {
		//en esta parte se define que el actor valla a la pagina de carrito de compra
		Heri.wasAbleTo(GoTo.ShoppingCart());
		//en esta parte se pregunta si el producto se encuentra agregado en el carrito de compra
		Heri.should(seeThat(isProduct.ShoppingCart(Product)));
	}

}
