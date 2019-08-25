package com.RetoAutomatizacion.tasks;

import com.RetoAutomatizacion.user_interface.Home;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Esta clase define abrir el buscador y cargar la pagina definida en el Home
 * @author: Heriberto Genes G.
 * @version: 24/08/2019
 */

public class OpenWeb implements Task {
	
	//Se define el Home el cual tiene la url por defecto
	private Home home;

	//metodo que define un actor para realizar la actividad de abrir el buscador y cargar la url dfinida
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(home));
	}

	//metodo que define un performace para devolver las acciones realizadas por el actor
	public static OpenWeb HomePage() {
		return instrumented(OpenWeb.class);
	}
	
}
