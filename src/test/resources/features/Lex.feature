Feature: LEX -> Desacoplamiento
  Como analista DINFO
  Quiero verificar que todas las funcionalidades de Lex esten disponibles despues del desacoplamiento
  para garantizar que funcionan con el modelo canonico

  Background: Login a la aplicacion Lex
    Given que un administrador quiere ingresar a Lex
    When el ingresa datos usuario "apossor" y clave "12345"
    Then ve la pagina principal de Lex

  Scenario: Menu Estudiantes/Opcion Clasificacion estudiantes / Consultar Estudiante
    Given que un administrador ingresa a la opcion estudiantes
    When el realiza la busqueda por semestre y tipo de asesoria
    Then el ve en pantalla la informacion del estudiante

  Scenario: Menu Estudiantes/Opcion Clasificacion estudiantes / Agregar Estudiante
    Given que un administrador ingresa a la opcion estudiantes
    When el realiza la busqueda por semestre y tipo de asesoria
    And el ingresa el codigo del estudiante "201717519001"
    And el selecciona los datos para crer el registro
    Then el ve en pantalla mensaje de exito

  Scenario: Menu Estudiantes/Opcion Evaluacion estudiantes
    Given que un administrador quiere consultar la evaluacion de estudiantes
    When el realiza la busqueda por semestre "20201"
    Then el ve en pantalla los datos del estudiante

  Scenario: Menu Estudiantes/Administracion notas aprobadas
    Given que un administrador ingresa a la opcion notas aprobadas
    When el selecciona el semestre "20201"
    Then el ve en pantalla las notas asignadas a un estudiante

  Scenario Outline: Menu Proceso/Opcion Ingreso Proceso
    Given que un administrador ingresa a la opcion ingreso proceso
    When el selecciona el area de competencia
    And ingresa los datos del Demandado "<tipo_doc_do>" y "<num_doc_do>"
    And ingresa los datos del Demandante "<tipo_doc_te>" y "<num_doc_te>"
    And ingresa los datos del Apoderado Contraparte "<tipo_doc_apo>" y "<num_doc_apo>"
    And ingresa los datos del Consultorio Juridico
    Then el ve en pantalla el mensaje de exito del proceso ingresado

    Examples: 
      | tipo_doc_do | num_doc_do           | tipo_doc_te | num_doc_te           | tipo_doc_apo | num_doc_apo          |
      | CC          |                  123 | CC          |                  456 | CC           |                  789 |
      | CE          | 22222222223333333333 | PP          | 22222222223333333333 | RE           | 22227777777777777777 |

  Scenario: Menu Proceso/Repartir Proceso
    Given que un administrador ingresa a la opcion repartir proceso
    When el selecciona el boton repartir
    Then el ve en pantalla la reasignacion de los procesos

  Scenario: Menu Consultas/Examinar consultas estudiantes
    Given que un administrador ingresa a la opcion examinar consultas asignadas
    When el selecciona el semestre "20201"
    Then el ve en pantalla las consultas asignadas por estudiante