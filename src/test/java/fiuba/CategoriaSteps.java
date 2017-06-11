package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.*;

/*

User story a testear GDO5:

"Como gerente de operaciones 
Quiero poder catalogar tareas 
Para poder filtrarlas por categoria"

*/

public class CategoriaSteps {

    private Tarea tarea;
    private Categoria categoria;
    private Categoria categoria2;
    private String nombreDeCategoria = "Categoria Test";
    private String nombreDeCategoria2 = "Categoria Test 2";

    private int tamanioAux;
    private ArrayList<Categoria> categoriasAux;

    private void nuevaTarea(String nombre) {
        tarea = new Tarea(nombre);
    }

    private void nuevaCategoria(){
        categoria = new Categoria(nombreDeCategoria);
    }

    private void asignoNuevaCategoria(Categoria categoria, Tarea tarea) {
        tarea.agregarCategoria(categoria);
        categoria.agregarTarea(tarea);
    }

    private void nuevaListaDeCategorias() {
        categoriasAux = new ArrayList();
    }

    @Dado("^que la tarea \"(.*?)\" no tiene categoria$")
    public void que_la_tarea_no_tiene_categoria(String nombreTarea) throws Throwable {
        nuevaTarea(nombreTarea);
    }

    @Dado("^que la tarea \"(.*?)\" ya tiene una categoria$")
    public void que_la_tarea_ya_tiene_una_categoria(String nombreTarea) throws Throwable {
        nuevaTarea(nombreTarea);
        categoria2 = new Categoria(nombreDeCategoria2);
        asignoNuevaCategoria(categoria2, tarea);  
    }

    @Cuando("^le asigno una nueva categoria$")
    public void le_asigno_una_nueva_categoria() throws Throwable {
        nuevaCategoria();
        asignoNuevaCategoria(categoria, tarea);
    }

    @Entonces("^la tarea queda asignada a una nueva categoria$")
    public void la_tarea_queda_asignada_a_una_nueva_categoria() throws Throwable {
       assertEquals(categoria.getTareas().get(0), tarea);
    }

    @Entonces("^la tarea queda asignada con ambas categorias$")
    public void la_tarea_queda_asignada_con_ambas_categorias() throws Throwable {
        assertTrue(tarea.getCategorias().contains(categoria));
        assertTrue(tarea.getCategorias().contains(categoria2));
    }

    @Dado("^que la tarea \"(.*?)\" tiene una categoria$")
    public void que_la_tarea_tiene_una_categoria(String nombreTarea) throws Throwable {
        nuevaTarea(nombreTarea);
        nuevaCategoria();
        asignoNuevaCategoria(categoria, tarea);
    }

    @Cuando("^le borro la categoria$")
    public void le_borro_la_categoria() throws Throwable {
        tarea.eliminarCategoria(categoria);
        categoria.eliminarTarea(tarea);
    }

    @Entonces("^la tarea queda sin categoria$")
    public void la_tarea_queda_sin_categoria() throws Throwable {
        assertTrue(tarea.getCategorias().size() == 0);
    }

    @Dado("^que la tarea \"(.*?)\" no tiene una categoria$")
    public void que_la_tarea_no_tiene_una_categoria(String nombreTarea) throws Throwable {
        nuevaTarea(nombreTarea);
        nuevaCategoria();
        tamanioAux = tarea.getCategorias().size();
    }

    @Entonces("^no permito borrar categoria$")
    public void no_permito_borrar_categoria() throws Throwable {
        assertEquals(tamanioAux, tarea.getCategorias().size());
    }

    @Dado("^que exiten tareas asignadas a una categoria$")
    public void que_exiten_tareas_asignadas_a_una_categoria() throws Throwable {
        nuevaTarea("");
        nuevaCategoria();
        asignoNuevaCategoria(categoria, tarea);
        nuevaListaDeCategorias();
        categoriasAux.add(categoria);
    }

    @Cuando("^filtro por esa categoria$")
    public void filtro_por_esa_categoria() throws Throwable {
        for (int i = 0; i < categoriasAux.size(); i++) {
            if (categoriasAux.get(i).getNombre().equals(categoria.getNombre())) {
                categoria2 = categoriasAux.get(i);
            }
        }
    }

    @Entonces("^tengo las tareas asignadas a esa categoria$")
    public void tengo_las_tareas_asignadas_a_esa_categoria() throws Throwable {
        assertTrue(categoria2.getTareas().contains(tarea));
    }

    @Dado("^que no exiten tareas asignadas a una categoria$")
    public void que_no_exiten_tareas_asignadas_a_una_categoria() throws Throwable {
        nuevaCategoria();
        nuevaListaDeCategorias();
        categoriasAux.add(categoria);
    }

    @Entonces("^no tengo tareas filtradas$")
    public void no_tengo_tareas_filtradas() throws Throwable {
        assertTrue(categoria2.getTareas().size() == 0);
    }

}
