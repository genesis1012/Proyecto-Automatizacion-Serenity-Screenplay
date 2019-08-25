# Proyecto-Automatizacion-Serenity-Screenplay
Proyecto de automatizacion en serenity screenplay y cucumber para la compra de un producto en Metro.pe

En este proyecto se podra observar como se automatizo la prueba de buscar un producto en la pagina Metro.pe, agregarlo al carrito y decompras y validar que se alla agregado exitosamnete el producto.

En este proyecto se implemento Cucumber ya que es una manera eficiente de definir el escenario utilizando la notacion gherkin.

Se utilizo el patron de diseño Serenity Screenplay (http://serenity-bdd.info/docs/articles/screenplay-tutorial.html) para darle eficiencia a la automatizacion.
-src
--main
---java
----com
-----RetoAutomatizacion
------model
------questions
------tasks
------user_interfac
--test
---java
----com
-----RetoAutomatizacion
------Runners
------step_definitions
---resources
----features
-----web

Se utilizo Gradle (https://gradle.org/) para la compilacion y ejecucion de la automatizacion.
se puede ejecutar el excript con el siguiente comando:
gradle clean test aggregate --info
