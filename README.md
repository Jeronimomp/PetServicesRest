# Automatización de Servicios Rest con RestAssured

##  Descripción 

Este es un proyecto Maven donde se usan los principales verbos GET,POST,PUT DELETE en la API de ejemplo: https://petstore.swagger.io/v2.

##  Stack Técnico 

* Java 8 o mayor.
* Maven para gestión de librerías.
* Serenity BDD Screenplay.
* Cucumber 4 o mayor con Serenity BDD.
* Serenity Rest , Serenity BDD Screenplay
* Hamcrest



## 📋 Para generar el Reporte 

Ejecute de forma manual el escenario a validar a través del Runner principal, luego de que el escenario o los escenario se ejecutaron, ingrese a la terminal de comandos puede ser de su IDE y ejecute el siguiente comando:

      mvn pre-clean post-integration-test

Se generará el reporte en la carpeta **/target/site/serenity/**, archivo **_index.htlm_**
