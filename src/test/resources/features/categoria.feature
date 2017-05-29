# language: es
Característica: Categoria de tarea

  Escenario: Asignar categoria a una tarea
  	Dado que la tarea no tiene categoria
  	Cuando le asigno una nueva categoria
  	Entonces la tarea queda asignada a una nueva categoria

  Escenario: Asignar mas de una categoria a una tarea
  	Dado que la tarea ya tiene una categoria
  	Cuando le asigno una nueva categoria
  	Entonces la tarea queda asignada con ambas categorias

  Escenario: Borro categoria de una tarea con categoria asignada
  	Dado que la tarea tiene una categoria
  	Cuando le borro la categoria
  	Entonces la tarea queda sin categoria

  Escenario: Borro categoria de una tarea sin categoria asignada
  	Dado que la tarea no tiene una categoria
  	Cuando le borro la categoria
  	Entonces no permito borrar categoria

  Escenario: Filtro por categoria existente
  	Dado que exiten tareas asignadas a una categoria
  	Cuando filtro por esa categoria
  	Entonces tengo las tareas asignadas a esa categoria

  Escenario: Filtro por categoria no existente
  	Dado que no exiten tareas asignadas a una categoria
  	Cuando filtro por esa categoria
  	Entonces no tengo tareas filtradas