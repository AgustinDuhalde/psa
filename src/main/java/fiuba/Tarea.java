package fiuba;

import java.util.*;

public class Tarea {

	private String nombre;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Persona> personasAsignadas = new ArrayList<Persona>();

	Tarea(String nombre) {
		this.nombre = nombre;
	}
 
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	} 

	public ArrayList<Persona> getPersonasAsignadas() {
		return personasAsignadas;
	} 

	public void agregarCategoria(Categoria categoria){
		categorias.add(categoria);
	}

	public void asignarPersona(Persona persona){
		personasAsignadas.add(persona);
	}

	public void eliminarCategoria(Categoria categoria){
		categorias.remove(categoria);
	}

	public void eliminarPersonaAsignada(Persona persona){
		personasAsignadas.remove(persona);
	}
}
