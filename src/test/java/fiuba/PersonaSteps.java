package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/*

User storie a testear:

"Como gerente de operaciones
Quiero poder asignar tareas al personal
Para poder notificarles sus tareas"

*/

public class PersonaSteps {

    @Dado("^que la tarea no tiene persona asignada$")
    public void que_la_tarea_no_tiene_persona_asignada() throws Throwable {
    }

    @Cuando("^le asigno una nueva persona$")
    public void le_asigno_una_nueva_persona() throws Throwable {
    }

    @Entonces("^la tarea queda asignada a una nueva persona$")
    public void la_tarea_queda_asignada_a_una_nueva_persona() throws Throwable {
    }

    @Dado("^que la tarea ya tiene una persona asignada$")
    public void que_la_tarea_ya_tiene_una_persona_asignada() throws Throwable {
    }

    @Entonces("^la tarea queda asignada con ambas personas$")
    public void la_tarea_queda_asignada_con_ambas_personas() throws Throwable {
    }

    @Dado("^que la tarea tiene una persona asignada$")
    public void que_la_tarea_tiene_una_persona_asignada() throws Throwable {
    }

    @Cuando("^le borro la persona asignada$")
    public void le_borro_la_persona_asignada() throws Throwable {
    }

    @Entonces("^la tarea queda sin persona asignada$")
    public void la_tarea_queda_sin_persona_asignada() throws Throwable {
    }

    @Dado("^que la tarea no tiene una persona asignada$")
    public void que_la_tarea_no_tiene_una_persona_asignada() throws Throwable {
    }

    @Entonces("^no permito borrar persona asignada$")
    public void no_permito_borrar_persona_asignada() throws Throwable {
    }

    @Dado("^que una persona tiene tareas asignadas$")
    public void que_una_persona_tiene_tareas_asignadas() throws Throwable {
    }

    @Cuando("^quiere ver sus tareas asignadas$")
    public void quiere_ver_sus_tareas_asignadas() throws Throwable {
    }

    @Entonces("^muestro las tareas asignadas de esa persona$")
    public void muestro_las_tareas_asignadas_de_esa_persona() throws Throwable {
    }

    @Dado("^que una persona no tiene tareas asignadas$")
    public void que_una_persona_no_tiene_tareas_asignadas() throws Throwable {
    }

    @Entonces("^no muestro ninguna tarea$")
    public void no_muestro_ninguna_tarea() throws Throwable {
    }

}
