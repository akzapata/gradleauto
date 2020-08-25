Feature: SIPRES -> Desacoplamiento
Como analista DINFO
Quiero verificar que todas las funcionalidades de Sipres esten disponibles despues del desacoplamiento
para garantizar que funcionan con el modelo canonico


Scenario: Login a la aplicacion Sipres
Given que un administrador quiere ingresa a Sipres
When el ingresa los datos de usuario "lespino2" y clave "12345"
Then ve la pagina principal de Sipres