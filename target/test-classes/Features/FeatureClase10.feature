Feature: Clase numero 10
#  I want to use this template for my feature file
#
#Background: Nombre de la precondicion
#	Given El usuario envia la oración "Buen dia"
#	
#  Scenario: Primer escenario
#    Then La longitud de la palabra debe ser de 0
#
#@Clase10
#    Scenario: Segundo escenario
#    When El usuario concatena la oracion "compañeros"
#    Then El usuario valida, la oracion esperada es "Buen dia compañeros"
    
@Entrega
	Scenario: Consultar ofertas
	Given El usuario requiere saber las ofertas en la pagina de sophos
	When el usuario consulta las ofertas en la pagina
	Then se listan las ofertas publicadas en la pagina
    