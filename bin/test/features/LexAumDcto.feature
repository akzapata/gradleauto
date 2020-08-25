Feature: LEX: Ampliacion campo Numero documento de identidad
Como analista DINFO
Quiero verificar que se aumente la longitud del campo Numero documento
para que el campo numero de doumento de identidad acepte hasta 20 caracteres

Background: Login a la aplicacion Lex
Given que un administrador quiere ingresar a Lex
When el ingresa datos usuario "apossor" y clave "12345"
Then ve la pagina principal de Lex

@Aumento_cambio_dcto
Scenario Outline: Menu Agendas / Opcion Agenda por usuario
Given que un administrador ingresa a la opcion Agenda por usuario
When el selecciona tipo documento: "<Tipo_Dcto>" e ingresa el numero de documento: "<Num_dcto>"
Then ve la informacion del usuario  "<Num_dcto>" 

Examples:
	|Tipo_Dcto	  | Num_dcto           |
	|CC						|12345678900         |
	|TI						|67777777779         |
  |CE   				|22222222223333333333|
	|PP						|22222222223333333333|
	|RE						|22262|
	|RE						|22227777777777777777|
	|TI						|77777777779| 


Scenario Outline: Menu Consultas / Opcion Ingresar consulta
Given que un administrador ingresa a la opcion ingresar consulta
When el selecciona tipo documento: "<Tipo_Dcto>" e ingresa el numero de documento: "<Num_dcto>"
Then ve la informacion del usuario  "<Num_dcto>"  

Examples:
	|Tipo_Dcto	  | Num_dcto           |
	|CC						|12345678900         |
	|TI						|67777777779         |
  |CE   				|22222222223333333333|
	|PP						|22222222223333333333|
	|RE						|22262|
	|RE						|22227777777777777777|
	|TI						|77777777779| 

