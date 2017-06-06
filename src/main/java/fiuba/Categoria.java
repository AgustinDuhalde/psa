package fiuba;

import java.util.*;

public class Categoria {

	private String nombre;
	private ArrayList<Tarea> tareas = new ArrayList<Tarea>();

	Categoria(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public ArrayList<Tarea> getTareas(){
		return tareas;
	}

	public void agregarTarea(Tarea tarea){
		tareas.add(tarea);
	}

	public void eliminarTarea(Tarea tarea){
		tareas.remove(tarea);
	}

}
