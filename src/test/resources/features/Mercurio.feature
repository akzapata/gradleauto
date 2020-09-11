#Author: your.email@your.domain.com

Feature: MERCURIO -> Desacoplamiento 
Como analista DINFO
Quiero verificar que todas las funcionalidades de Mercurio esten disponibles despues del desacoplamiento
para garantizar que funcionan con el modelo canonico

Background: Login a la aplicacion Mercurio
Given que un administrador quiere ingresar a Mercurio
When el ingresa usuario "lcuarta7" y clave "123"
Then ve la pagina principal de Mercurio

@Mercurio
Scenario: Menu carnetizacion / Opcion Gestion Carnes
Given que un administrador quiere consultar los datos de carnetizacion de un estudiante
Then el ingresa "Tipo_doc" y "Num_doc"
And el realiza la busqueda
And ve en pantalla la informacion del estudiante 

@p
Scenario Outline:  Menu carnetizacion / Opcion Solicitud masiva de carnes
Then el muestra en pantalla el menu Carnetizacion
And selecciona la opcion Solicitud masiva de carnes
And selecciona "<lote_impresion>" 
And selecciona fecha desde: <fecha_desde> y hasta
And da clic en el boton Buscar
And ve en pantalla los datos en la tabla de carnetizacion  

Examples:
	|lote_impresion	| fecha_desde|
	|CEC						|01-01-2020  |
	|IDIOMAS				|05-01-2018  |
	|ARTISTICO			|01-01-2016  | 
	
Scenario: Menu Administracion / Opcion mantenimiento /  Opcion item Presupuesto 
Then el muestra en pantalla el menu Administracion
And ve la opcion Item Presupuesto
And busca la palabra "costos"
And ve la palabra en la tabla de items 


Scenario:  Menu Administracion / Opcion Cambio documento
Given que un administrador quiere cambiar el numero de documento de un estudiante
When el ingresa a la opcion Cambiar documento
Then el ingresa tipo_doc_antes "CC" Num_doc_antes "12345" tipo_doc_despues "CC" y Num_doc_despues "88166456780"
And da clic en el boton buscar y en el boton actualizar
And el ve en pantalla el mensaje de cambio de documento exitoso 

@Mercurio
Scenario: Menu Clientes / Opcion Datos basicos clientes
Given que un administrador quiere buscar la informacion de un cliente
When el ingresa a la opcion datos basicos clientes
Then el ingresa "PP" y "5007958943" del cliente
And ve en pantalla la informacion del cliente

Scenario: Menu Clientes / Opcion Registro de clientes
Given que un administrador quiere hacer el registro de un cliente
When el ingresa a la opcion Registro clientes
Then el ingresa los datos "PP" y "1521159404"
And ve en pantalla los datos del cliente