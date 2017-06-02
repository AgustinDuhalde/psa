package fiuba;

import java.util.*;

public class Persona {

	private ArrayList<Tarea> tareasAsignadas = new ArrayList<Tarea>();

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
