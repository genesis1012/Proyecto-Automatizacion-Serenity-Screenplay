package com.RetoAutomatizacion.questions;

import static com.RetoAutomatizacion.user_interface.ShoppingCart.ProductBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class isProduct implements Question<Boolean>{

	/**
	 * Esta clase define preguntar si un elemento es visible en la pagina
	 * @author: Heriberto Genes G.
	 * @version: 24/08/2019
	 */
	
	//Variable que contendra el sku del producto
	private String ProductSku;
	
	//contructor que define la asignacion del sql en la variable definida
	public isProduct(String Product) {
		this.ProductSku = Product;
	}
	
	//metodo que busca que el actor pregunte por la visibilidad del elemento.
	@Override
    public Boolean answeredBy(Actor actor) {
        return the(ProductBuy.of(ProductSku)).answeredBy(actor).isCurrentlyVisible();
    }

	//metodo que define un performace para devolver las acciones realizadas por el actor
	public static isProduct ShoppingCart(String Product) {
		return new isProduct(Product);
	}
	
}
