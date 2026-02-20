#language:es
Característica: Generación de reportes desde la web de Chronos

  @test
  Esquema del escenario: [Happy Path] Generacion exitosa de reporte
    Dado el usuario Petzega ingresa a la web de Chronos
    Cuando ingrese los datos del reporte "<report>" para la compañia "<company>" segun la fecha "<report_date>"
    Entonces se genera el reporte "<report>" de manera exitosa
    Ejemplos:
      | report | company    | report_date |
      | 417    | compañia 1 | 2026-02-01  |