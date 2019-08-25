package com.RetoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.RetoAutomatizacion.user_interface.Home.Offers;
import static com.RetoAutomatizacion.user_interface.Home.ShoppingCart;

/**
 * Esta clase define las acciones que se realizan para ir a una pagina
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */

public class GoTo {
	
	//metodo que define la accion para ir a la pagina de orfertas especiales
	public static Task Offers() {
		return Task.where("Go to special offers page",
				Click.on(Offers));
	}
	
	// metodo que define la accion para ir a la pagina de carrito de compra
	public static Task ShoppingCart() {
		return Task.where("Go to shopping cart page",
				Click.on(ShoppingCart));
	}

}
