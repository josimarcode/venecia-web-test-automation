
# ![https://mouredev.com](https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_emote.png) Hola, mi nombre es Josimar Leon👋
### Lead Quality Engineer



Especialista en automatizacion de pruebas de software desde hace más de 7 años.

> 👥 [venecia-web-test-automation](https://mvp.microsoft.com/es-es/PublicProfile/5004970) (Serenity BDD) in Developer using Gradle, Junit, Cucumber, Java, screenplay pattern and appium

## Frameworks:
Este proyecto utiliza los siguientes lenguajes y frameworks:
> [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) como framework de pruebas
automatizadas.

> [Cucumber](https://cucumber.io/) como software de testing BDD que permite escribir en gherkin

> [Java 8](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html) como lenguaje de
programación.

> [Screen Play](https://serenity-js.org/handbook/thinking-in-serenity-js/screenplay-pattern.html) como el patrón de
diseño.

> [Gradle](https://gradle.org/) como herramienta de compilación.

Y alguna más...

##  Pre-requisitos:

1. Descargar la última versión estable de Java
   JDK [aquí](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
2. Instalar git desde [aquí](https://git-scm.com)
3. Instalar Gradle Build Tool desde [aquí](https://gradle.org/install/)


👀 Adicional en su **IDE** de preferencia deberá tener instalados los siguientes plugins:

1. [x] *JUnit*
2. [x] *Cucumber for Java*
3. [x] *Gherkin*
4. [x] *Lombok*

***

### 🧪 Casos de prueba

Test diseñados para validar los escenarios **Happy Paths** 😃

***
```Gherkin
@JiraXray-[TestSet]
Feature: Login Orange HRM
  As a registered user
  I want to be able to login to the web app
  To access my account and use its features

  Background:
    Given I am on the login page

  @JiraXray-[Test] @HappyPath @Login @CP001
  Scenario: Login successful
    When I enter valid credentials
      | username | password |
      | Admin    | admin123 |
    Then I should be logged in and redirected to dashboard the Orange HRM
```

***

## 🏗️ Estructura del proyecto

El proyecto tiene scripts de compilación para Gradle y sigue la estructura la siguiente estructura basada en el patrón
de diseño de Screenplay:

```Gherkin
src
+ test                                    |
  + java                                  | 
    + questions                           | Dev questions
    + runner                              | Test runners and supporting code
    + steps                               | Steps definition
    + tasks                               | Group interaction
    + ui                                  | Locators
 + resources                              
    + features                            | Features set and file
build.gradle                              | build
```

***

## ▶️ Ejecución del proyecto:

**Precondiciones**:

1. Descarga el proyecto desde GitHub
    * **Opción 1** (HTTPS): `https://github.com/josimarcode/venecia-web-test-automation.git`
    * **Opción 2** (SSH): `git@github.com:josimarcode/venecia-web-test-automation.git`
    * **Opción 3:** Descárgalo como archivo Zip y extráelo

***

2. **Terminal** cd en la carpeta `venecia-web-test-automation`.
3. Configurar Gradle
    * Ejecute el siguiente comando en el terminal:`gradle build`.

***

4. Ejecutar las pruebas en el proyecto
* **Opción 1**: ejecutar en la ruta del proyecto alguno de los siguientes comandos:
 
In WINDOWS:          
```bash                   
./gradlew clean test
```
```bash 
./gradlew clean test -Dwebdriver.driver=chrome 
``` 
```bash 
./gradlew clean test -Dwebdriver.driver=chrome -Denvironment=staging 
```  
In MAC:
```bash
  gradle clean test -Dwebdriver.driver=chrome
```
```bash
  gradle clean test -Dwebdriver.driver=chrome  -Dcucumber.filter.tags="@CP001"
```
```bash
  gradle clean test -Dwebdriver.driver=chrome -Denvironment=staging 
```
* **Opción 2**: Ir a las clases de la carpeta **runners** `src/test/java/runner/` y ejecutar
  cada TestRunner.

***

## 📄 Generación de informes

El informe al detalle con los pasos y resultados de las pruebas que se registrará en la ruta:
`target/site/serenity/index.html`.







































