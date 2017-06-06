# language: es
Característica: Asignar persona a tarea

  Escenario: Asignar persona a una tarea
  	Dado que la tarea no tiene persona asignada
  	Cuando le asigno una nueva persona
  	Entonces la tarea queda asignada a una nueva persona

  Escenario: Asignar mas de una persona a una tarea
  	Dado que la tarea ya tiene una persona asignada
  	Cuando le asigno una nueva persona
  	Entonces la tarea queda asignada con ambas personas

  Escenario: Borro persona asignada de una tarea con persona asignada
  	Dado que la tarea ya tiene una persona asignada
  	Cuando le borro la persona asignada
  	Entonces la tarea queda sin persona asignada

  Escenario: Borro persona asignada de una tarea sin persona asignada
  	Dado que la tarea no tiene una persona asignada
  	Cuando le borro la persona asignada
  	Entonces no permito borrar persona asignada

  Escenario: Persona con tareas asignadas ve sus tareas
  	Dado que una persona tiene tareas asignadas
  	Cuando quiere ver sus tareas asignadas
  	Entonces muestro las tareas asignadas de esa persona

  Escenario: Persona sin tareas asignadas no ve ninguna tarea
    Dado que una persona no tiene tareas asignadas
    Cuando quiere ver sus tareas asignadas
    Entonces no muestro ninguna tarea
