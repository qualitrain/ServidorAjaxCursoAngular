package mx.com.qualitrain.personas.web;

import java.util.List;

import mx.com.qualitrain.personas.entidades.Persona;

public interface IServicioPersonas {
	public List<Persona> getPersonasTodas();
	public Persona getPersona(long id);
}
