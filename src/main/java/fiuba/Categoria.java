package fiuba;

import java.util.*;

public class Categoria {

	private ArrayList<Tarea> tareas = new ArrayList<Tarea>();

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
