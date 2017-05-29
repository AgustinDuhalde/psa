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
Quiero poder catalogar tareas 
Para poder filtrarlas por categoria"

*/

public class CategoriaSteps {

    @Dado("^que la tarea no tiene categoria$")
    public void que_la_tarea_no_tiene_categoria() throws Throwable {
        
    }

    @Cuando("^le asigno una nueva categoria$")
    public void le_asigno_una_nueva_categoria() throws Throwable {
        
    }

    @Entonces("^la tarea queda asignada a una nueva categoria$")
    public void la_tarea_queda_asignada_a_una_nueva_categoria() throws Throwable {
       
    }

    @Dado("^que la tarea ya tiene una categoria$")
    public void que_la_tarea_ya_tiene_una_categoria() throws Throwable {

    }

    @Entonces("^la tarea queda asignada con ambas categorias$")
    public void la_tarea_queda_asignada_con_ambas_categorias() throws Throwable {

    }

    @Dado("^que la tarea tiene una categoria$")
    public void que_la_tarea_tiene_una_categoria() throws Throwable {

    }

    @Cuando("^le borro la categoria$")
    public void le_borro_la_categoria() throws Throwable {

    }

    @Entonces("^la tarea queda sin categoria$")
    public void la_tarea_queda_sin_categoria() throws Throwable {
    }

    @Dado("^que la tarea no tiene una categoria$")
    public void que_la_tarea_no_tiene_una_categoria() throws Throwable {
    }

    @Entonces("^no permito borrar categoria$")
    public void no_permito_borrar_categoria() throws Throwable {
    }

    @Dado("^que exiten tareas asignadas a una categoria$")
    public void que_exiten_tareas_asignadas_a_una_categoria() throws Throwable {
    }

    @Cuando("^filtro por esa categoria$")
    public void filtro_por_esa_categoria() throws Throwable {
    }

    @Entonces("^tengo las tareas asignadas a esa categoria$")
    public void tengo_las_tareas_asignadas_a_esa_categoria() throws Throwable {
    }

    @Dado("^que no exiten tareas asignadas a una categoria$")
    public void que_no_exiten_tareas_asignadas_a_una_categoria() throws Throwable {
    }

    @Entonces("^no tengo tareas filtradas$")
    public void no_tengo_tareas_filtradas() throws Throwable {
    }

}
