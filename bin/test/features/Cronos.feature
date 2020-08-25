@Cronos
Feature: CRONOS -> Desacoplamiento
Como analista DINFO
Quiero verificar que todas las funcionalidades de Lex esten disponibles despues del desacoplamiento
para garantizar que funcionan con el modelo canonico

Background: Login a la aplicacion Cronos
Given que un administrador quiere ingresar a Cronos
When el ingresa los datos usuario "sagudel7" y clave "12345"
Then ve la pagina principal de Cronos


Scenario: Menu Proveedores/ Opcion Editar proveedores
Given que un administrador ingresa a la opcion proveedores
When el edita un proveedor
Then el ve en pantalla la informacion actualizada

Scenario: Menu Servicios/ Opcion Solicitar requerimiento
Given que un administrador ingresa a la opcion Solicitar requerimiento
When el ingresa a la opcion Crear requerimiento de servicio
And el ingresa los datos del requerimiento
Then el ve en pantalla la confirmacion de creacion de requerimiento

Scenario: Menu Bienes/ Opcion Lista de requerimientos
Given que un administrador ingresa al menu bienes
When el ingresa a la opcion Lista de requerimientos
And el ingresa a la opcion fecha de requerimiento desde 2020-01-01 hasta 2020-08-18
Then el ve en pantalla los requerimientos

Scenario: Menu Bienes/ Opcion Solicitar requerimiento
Given que un administrador ingresa a la opcion Solicitar requerimiento de Bienes
When el ingresa a la opcion Crear requerimiento de Bienes
And el ingresa los datos del requerimiento de bienes
Then el ve en pantalla la confirmacion de creacion de requerimiento de Bienes


Scenario: Menu Bienes/ Opcion Confirmar Bienes recurrentes
Given que un administrador ingresa a la opcion Requerimientos
When el ingresa a la opcion Confirmar bienes recurrentes
And el ingresa los datos del bienes recurrente
Then el ve en pantalla las ordenes creadas



