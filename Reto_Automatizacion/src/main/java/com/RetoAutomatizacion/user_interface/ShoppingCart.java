package com.RetoAutomatizacion.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Esta clase define los elementos a utilizar en la pagina de carrito de compra
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */

public class ShoppingCart extends PageObject{
	
	//elementos buscador por medio de xpacth y id 
	public static final Target ProductBuy = Target.the("product to buy")
			.locatedBy("//*[@data-id='{0}']");

}
