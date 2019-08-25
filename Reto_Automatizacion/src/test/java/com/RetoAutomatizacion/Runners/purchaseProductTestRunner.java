package com.RetoAutomatizacion.Runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Esta clase define el Runner o ejecucion de la automatizacion, especificamente el escenario purchaseProduct
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/web/purchaseProduct.feature",
                 glue = "com.RetoAutomatizacion.step_definitions" )
public class purchaseProductTestRunner {

}
