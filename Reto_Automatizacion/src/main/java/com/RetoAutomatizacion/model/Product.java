package com.RetoAutomatizacion.model;

public class Product {

	/**
	 * Esta clase define el modelo de datos que debe tener un producto
	 * @author: Heriberto Genes G.
	 * @version: 24/08/2019
	 */
	
	//Variables privadas que definin cada campo de un producto
	private String NameProduct;
	private String ProductSKU;
	
	//Contructor que llena las variables con informacion
	public Product(String NameProduct, String ProductSKU) {
		this.NameProduct = NameProduct;
		this.ProductSKU = ProductSKU;
	}
	
	//Metodo que devuleve los valores de las variable
	public String NameProduct(){
		return NameProduct;
	}
	
	//Metodo que devuleve los valores de las variable
	public String ProductSKU() {
		return ProductSKU;
	}

}
