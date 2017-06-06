package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.*;

/*

User storie a testear:

"Como gerente de operaciones
Quiero poder asignar tareas al personal
Para poder notificarles sus tareas"

*/

public class PersonaSteps {

    private Tarea tarea;
    private Persona persona;
    private Persona persona2;
    private String nombreDePersona = "Persona Test";
    private int tamanioAux;
    private ArrayList<Tarea> tareasAux;

    private void nuevaTarea() {
        tarea = new Tarea("Test");
    }

    private void nuevaPersona(){
        persona = new Persona(nombreDePersona);
    }

    private void asignoNuevaPersona(Persona persona, Tarea tarea) {
        tarea.asignarPersona(persona);
        persona.asignarTarea(tarea);
    }

    @Dado("^que la tarea no tiene persona asignada$")
    public void que_la_tarea_no_tiene_persona_asignada() throws Throwable {
        nuevaTarea();
    }

    @Cuando("^le asigno una nueva persona$")
    public void le_asigno_una_nueva_persona() throws Throwable {
        nuevaPersona();
        asignoNuevaPersona(persona, tarea);
    }

    @Entonces("^la tarea queda asignada a una nueva persona$")
    public void la_tarea_queda_asignada_a_una_nueva_persona() throws Throwable {
        assertEquals(persona.getTareas().get(0), tarea);
    }

    @Dado("^que la tarea ya tiene una persona asignada$")
    public void que_la_tarea_ya_tiene_una_persona_asignada() throws Throwable {
        nuevaTarea();
        persona2 = new Persona("Persona Test 2");
        asignoNuevaPersona(persona2, tarea);
    }

    @Entonces("^la tarea queda asignada con ambas personas$")
    public void la_tarea_queda_asignada_con_ambas_personas() throws Throwable {
        assertTrue(tarea.getPersonasAsignadas().contains(persona));
        assertTrue(tarea.getPersonasAsignadas().contains(persona2));
    }

    @Cuando("^le borro la persona asignada$")
    public void le_borro_la_persona_asignada() throws Throwable {
        tarea.eliminarPersonaAsignada(persona2);
        persona2.eliminarTareaAsignada(tarea);
    }

    @Entonces("^la tarea queda sin persona asignada$")
    public void la_tarea_queda_sin_persona_asignada() throws Throwable {
        assertTrue(tarea.getPersonasAsignadas().size() == 0);
    }

    @Dado("^que la tarea no tiene una persona asignada$")
    public void que_la_tarea_no_tiene_una_persona_asignada() throws Throwable {
        nuevaTarea();
        persona2 = new Persona("Persona Test 2");
        tamanioAux = tarea.getPersonasAsignadas().size();
    }

    @Entonces("^no permito borrar persona asignada$")
    public void no_permito_borrar_persona_asignada() throws Throwable {
         assertEquals(tamanioAux, tarea.getPersonasAsignadas().size());
    }

    @Dado("^que una persona tiene tareas asignadas$")
    public void que_una_persona_tiene_tareas_asignadas() throws Throwable {
        nuevaTarea();
        nuevaPersona();
        asignoNuevaPersona(persona, tarea);
    }

    @Cuando("^quiere ver sus tareas asignadas$")
    public void quiere_ver_sus_tareas_asignadas() throws Throwable {
        tareasAux = persona.getTareas();
    }

    @Entonces("^muestro las tareas asignadas de esa persona$")
    public void muestro_las_tareas_asignadas_de_esa_persona() throws Throwable {
        assertTrue(tareasAux.size() == 1);
        assertTrue(tareasAux.contains(tarea));
    }

    @Dado("^que una persona no tiene tareas asignadas$")
    public void que_una_persona_no_tiene_tareas_asignadas() throws Throwable {
        nuevaTarea();
        nuevaPersona();
    }

    @Entonces("^no muestro ninguna tarea$")
    public void no_muestro_ninguna_tarea() throws Throwable {
        assertTrue(tareasAux.size() == 0);
        assertFalse(tareasAux.contains(tarea));
    }

}
