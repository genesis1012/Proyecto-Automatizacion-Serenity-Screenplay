package com.RetoAutomatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.RetoAutomatizacion.model.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.Keys;

import static com.RetoAutomatizacion.user_interface.Home.Search;
import static com.RetoAutomatizacion.user_interface.Home.Productfound;

/**
 * Esta clase define el bsucar un producto y agregarlo al carrito de compras
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */

public class Search implements Task{
	
	//Modelo que define la informacion de un producto
	private Product product;
	
	//contructor que define el llenado de un modelo 
	public Search (Product Product) {
		this.product = Product;
	}

	//Metodo que define el buscar un producto por su nombre en el campo de bascar y darle enter para que la bsuqeuda se realise
	//y al encontrarse se le de click a agregar al carrito de compra
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(product.NameProduct()).into(Search).thenHit(Keys.ENTER),
				Click.on(Productfound.of(product.ProductSKU())));
	}

	//metodo que define un performace para devolver las acciones realizadas por el actor
	public static Search Product(Product Product) {
		return instrumented(Search.class, Product);
	}

}
