Feature: MERCURIO: Ampliacion campo Numero documento de identidad
Como analista DINFO
Quiero verificar que se aumente la longitud del campo Numero documento
para que el campo numero de doumento de identidad acepte hasta 20 caracteres

Background: Login a la aplicacion Mercurio
Given que un administrador quiere ingresar a Mercurio
When el ingresa usuario "lcuarta7" y clave "123"
Then ve la pagina principal de Mercurio

@Aumento
Scenario Outline: Menu Clientes / Opcion Registro de clientes
Given que un administrador quiere verificar la longitud del campo numero de documento
When el ingresa a la opcion Registro clientes
And el selecciona tipo documento: "<Tipo_Dcto>" y numero de documento: "<Num_dcto>" 
And el ingresa los datos del cliente Nombre: "<Nombre>" Apellido: "<Apellido>" Genero: "<Genero>"
Then ve mensaje de registro exitoso "Se ha realizado la acci\u00f3n con ?xito"

Examples:
	|Tipo_Dcto	  | Num_dcto           |Nombre|Apellido|Genero|
	|CC						|12345678900         |Ana   |Restrepo|F|
	|TI						|67777777779         | Julian   |Hoyos|M|
  |CE   				|22222222223333333333|Leonor   |Gallego|F|
	|PP						|22222222223333333333| Marina   |Perez|F|
	|RE						|22262               | Luisa   |Arias|F|
	|RE						|22227777777777777777| Fabian   |Rios|M|
	|TI						|77777777779         | Julian   |Hoyos|M|
