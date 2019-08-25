# Proyecto-Automatización-Serenity-Screenplay
Proyecto de automatización en serenity screenplay y cucumber para la compra de un producto en Metro.pe

En este proyecto se podrá observar cómo se automatizo la prueba de buscar un producto en la página Metro.pe, agregarlo al carrito de compras y validar que se halla agregado exitosamente el producto.

En este proyecto se implementó Cucumber ya que es una manera eficaz de definir el escenario utilizando la notación gherkin.

Se utilizó el patrón de diseño Serenity Screenplay (http://serenity-bdd.info/docs/articles/screenplay-tutorial.html) para darle eficiencia a la automatización.

-src.main.java.com.RetoAutomatizacion

------model

------questions

------tasks

------user_interfac

-src.test.java.com-RetoAutomatizacion

------Runners

------step_definitions

-src.test.resources

----features.web

Se utilizó Gradle (https://gradle.org/) para la compilación y ejecución de la automatización.
se puede ejecutar el excript con el siguiente comando:
gradle clean test aggregate --info
