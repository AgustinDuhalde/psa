package fiuba;

import java.util.*;

public class Tarea {

	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Persona> personasAsignadas = new ArrayList<Persona>();
 
	public ArrayList<Categoria> getCategoria() {
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
