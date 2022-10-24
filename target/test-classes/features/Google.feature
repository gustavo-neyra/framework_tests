Feature: Google

  Background:
    Given ingreso a google

  Scenario: Busco Tsoft en google
    When Ingreso "Tsoft" en la barra de busqueda
    And selecciono e ingreso al resultado "TSOFT"
    Then ingreso a la pagina de "Tsoft"