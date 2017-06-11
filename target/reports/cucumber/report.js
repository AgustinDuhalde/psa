$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("categoria.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Categoria de tarea (GDO5)",
  "description": "",
  "id": "categoria-de-tarea-(gdo5)",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Asignar categoria a una tarea",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);asignar-categoria-a-una-tarea",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que la tarea \"Tarea 1\" no tiene categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "le asigno una nueva categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "la tarea queda asignada a una nueva categoria",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 1",
      "offset": 14
    }
  ],
  "location": "CategoriaSteps.que_la_tarea_no_tiene_categoria(String)"
});
formatter.result({
  "duration": 431954501,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.le_asigno_una_nueva_categoria()"
});
formatter.result({
  "duration": 99552,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.la_tarea_queda_asignada_a_una_nueva_categoria()"
});
formatter.result({
  "duration": 2085007,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Asignar mas de una categoria a una tarea",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);asignar-mas-de-una-categoria-a-una-tarea",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que la tarea \"Tarea 2\" ya tiene una categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "le asigno una nueva categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "la tarea queda asignada con ambas categorias",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 2",
      "offset": 14
    }
  ],
  "location": "CategoriaSteps.que_la_tarea_ya_tiene_una_categoria(String)"
});
formatter.result({
  "duration": 124664,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.le_asigno_una_nueva_categoria()"
});
formatter.result({
  "duration": 32970,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.la_tarea_queda_asignada_con_ambas_categorias()"
});
formatter.result({
  "duration": 82163,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Borro categoria de una tarea con categoria asignada",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);borro-categoria-de-una-tarea-con-categoria-asignada",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que la tarea \"Tarea 3\" tiene una categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "le borro la categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "la tarea queda sin categoria",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 3",
      "offset": 14
    }
  ],
  "location": "CategoriaSteps.que_la_tarea_tiene_una_categoria(String)"
});
formatter.result({
  "duration": 148583,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.le_borro_la_categoria()"
});
formatter.result({
  "duration": 75740,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.la_tarea_queda_sin_categoria()"
});
formatter.result({
  "duration": 48646,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Borro categoria de una tarea sin categoria asignada",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);borro-categoria-de-una-tarea-sin-categoria-asignada",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 20,
  "name": "que la tarea \"Tarea 4\" no tiene una categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "le borro la categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "no permito borrar categoria",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 4",
      "offset": 14
    }
  ],
  "location": "CategoriaSteps.que_la_tarea_no_tiene_una_categoria(String)"
});
formatter.result({
  "duration": 152540,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.le_borro_la_categoria()"
});
formatter.result({
  "duration": 129177,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.no_permito_borrar_categoria()"
});
formatter.result({
  "duration": 90410,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Filtro por categoria existente",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);filtro-por-categoria-existente",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 25,
  "name": "que exiten tareas asignadas a una categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "filtro por esa categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 27,
  "name": "tengo las tareas asignadas a esa categoria",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CategoriaSteps.que_exiten_tareas_asignadas_a_una_categoria()"
});
formatter.result({
  "duration": 94339,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.filtro_por_esa_categoria()"
});
formatter.result({
  "duration": 62263,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.tengo_las_tareas_asignadas_a_esa_categoria()"
});
formatter.result({
  "duration": 41595,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Filtro por categoria no existente",
  "description": "",
  "id": "categoria-de-tarea-(gdo5);filtro-por-categoria-no-existente",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 30,
  "name": "que no exiten tareas asignadas a una categoria",
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "filtro por esa categoria",
  "keyword": "Cuando "
});
formatter.step({
  "line": 32,
  "name": "no tengo tareas filtradas",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CategoriaSteps.que_no_exiten_tareas_asignadas_a_una_categoria()"
});
formatter.result({
  "duration": 62382,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.filtro_por_esa_categoria()"
});
formatter.result({
  "duration": 34102,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaSteps.no_tengo_tareas_filtradas()"
});
formatter.result({
  "duration": 44625,
  "status": "passed"
});
formatter.uri("persona.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Asignar persona a tarea (GDO4)",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4)",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Asignar persona a una tarea",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);asignar-persona-a-una-tarea",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que la tarea \"Tarea 1\" no tiene persona asignada",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "le asigno una nueva persona",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "la tarea queda asignada a una nueva persona",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 1",
      "offset": 14
    }
  ],
  "location": "PersonaSteps.que_la_tarea_no_tiene_persona_asignada(String)"
});
formatter.result({
  "duration": 161452,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.le_asigno_una_nueva_persona()"
});
formatter.result({
  "duration": 79423,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.la_tarea_queda_asignada_a_una_nueva_persona()"
});
formatter.result({
  "duration": 72707,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Asignar mas de una persona a una tarea",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);asignar-mas-de-una-persona-a-una-tarea",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que la tarea \"Tarea 2\" ya tiene una persona asignada",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "le asigno una nueva persona",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "la tarea queda asignada con ambas personas",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 2",
      "offset": 14
    }
  ],
  "location": "PersonaSteps.que_la_tarea_ya_tiene_una_persona_asignada(String)"
});
formatter.result({
  "duration": 102158,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.le_asigno_una_nueva_persona()"
});
formatter.result({
  "duration": 34522,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.la_tarea_queda_asignada_con_ambas_personas()"
});
formatter.result({
  "duration": 74860,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Borro persona asignada de una tarea con persona asignada",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);borro-persona-asignada-de-una-tarea-con-persona-asignada",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que la tarea \"Tarea 3\" ya tiene una persona asignada",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "le borro la persona asignada",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "la tarea queda sin persona asignada",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 3",
      "offset": 14
    }
  ],
  "location": "PersonaSteps.que_la_tarea_ya_tiene_una_persona_asignada(String)"
});
formatter.result({
  "duration": 119979,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.le_borro_la_persona_asignada()"
});
formatter.result({
  "duration": 81319,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.la_tarea_queda_sin_persona_asignada()"
});
formatter.result({
  "duration": 77837,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Borro persona asignada de una tarea sin persona asignada",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);borro-persona-asignada-de-una-tarea-sin-persona-asignada",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 20,
  "name": "que la tarea \"Tarea 4\" no tiene una persona asignada",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "le borro la persona asignada",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "no permito borrar persona asignada",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "Tarea 4",
      "offset": 14
    }
  ],
  "location": "PersonaSteps.que_la_tarea_no_tiene_una_persona_asignada(String)"
});
formatter.result({
  "duration": 141876,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.le_borro_la_persona_asignada()"
});
formatter.result({
  "duration": 193294,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.no_permito_borrar_persona_asignada()"
});
formatter.result({
  "duration": 58083,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Persona con tareas asignadas ve sus tareas",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);persona-con-tareas-asignadas-ve-sus-tareas",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 25,
  "name": "que una persona tiene tareas asignadas",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "quiere ver sus tareas asignadas",
  "keyword": "Cuando "
});
formatter.step({
  "line": 27,
  "name": "muestro las tareas asignadas de esa persona",
  "keyword": "Entonces "
});
formatter.match({
  "location": "PersonaSteps.que_una_persona_tiene_tareas_asignadas()"
});
formatter.result({
  "duration": 99625,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.quiere_ver_sus_tareas_asignadas()"
});
formatter.result({
  "duration": 40109,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.muestro_las_tareas_asignadas_de_esa_persona()"
});
formatter.result({
  "duration": 39256,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Persona sin tareas asignadas no ve ninguna tarea",
  "description": "",
  "id": "asignar-persona-a-tarea-(gdo4);persona-sin-tareas-asignadas-no-ve-ninguna-tarea",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 30,
  "name": "que una persona no tiene tareas asignadas",
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "quiere ver sus tareas asignadas",
  "keyword": "Cuando "
});
formatter.step({
  "line": 32,
  "name": "no muestro ninguna tarea",
  "keyword": "Entonces "
});
formatter.match({
  "location": "PersonaSteps.que_una_persona_no_tiene_tareas_asignadas()"
});
formatter.result({
  "duration": 77973,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.quiere_ver_sus_tareas_asignadas()"
});
formatter.result({
  "duration": 37131,
  "status": "passed"
});
formatter.match({
  "location": "PersonaSteps.no_muestro_ninguna_tarea()"
});
formatter.result({
  "duration": 68774,
  "status": "passed"
});
});