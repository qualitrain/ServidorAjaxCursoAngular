package mx.com.qualitrain.personas.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.qualitrain.personas.entidades.Persona;
import mx.com.qualitrain.personas.web.IServicioPersonas;

@Service
public class ServicioPersonas implements IServicioPersonas {
	@Autowired
	IGestorDatos gestorDatos;
	
	public List<Persona> getPersonasTodas(){
		return new ArrayList<Persona> (this.gestorDatos.leerPersonas());
	}

	@Override
	public Persona getPersona(long id) {
		Persona persona = this.gestorDatos.leerPersonaXID(id);
		return persona;
	}

}
