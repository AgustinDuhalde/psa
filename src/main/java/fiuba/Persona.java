package fiuba;

import java.util.*;

public class Persona {

	private String nombre;
	private ArrayList<Tarea> tareasAsignadas = new ArrayList<Tarea>();

	Persona(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public ArrayList<Tarea> getTareas(){
		return tareasAsignadas;
	}

	public void asignarTarea(Tarea tarea){
		tareasAsignadas.add(tarea);
	}

	public void eliminarTareaAsignada(Tarea tarea){
		tareasAsignadas.remove(tarea);
	}

}
