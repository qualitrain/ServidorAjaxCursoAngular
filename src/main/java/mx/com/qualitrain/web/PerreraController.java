package mx.com.qualitrain.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.qualitrain.negocio.Domicilio;
import mx.com.qualitrain.negocio.Perrera;
import mx.com.qualitrain.negocio.Perro;
import mx.com.qualitrain.negocio.PerroPlano;
import mx.com.qualitrain.negocio.Persona;
import mx.com.qualitrain.negocio.PersonaPlana;

@RestController
@CrossOrigin
public class PerreraController {
	@Autowired
	private Perrera perros;
	private static Logger log = LoggerFactory.getLogger(PerreraController.class);
	
	public PerreraController() {
		super();
		log.info("PerreraController()");
	}

//	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(path = "/Perrera/Perro", produces = MediaType.APPLICATION_JSON_VALUE)
	public PerroPlano getPerroXId(@RequestParam(defaultValue = "0")
	                         int id) {
		log.info("PerreraController.getPerroXId(" + id + ")");
		Perro perro = perros.getXid(id);
		if(perro != null)
			return perro.toPerroPlano();
		return null;
	}
	
//	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(path = "/Perrera/Persona", produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonaPlana getPersonaXId(@RequestParam(value="id", defaultValue = "0") 
	                             int idPersona) {
		log.info("PerreraController.getPersonaXId(" + idPersona + ")");
		Persona persona = this.perros.getPropietarioXid(idPersona);
		if(persona != null)
			return new PersonaPlana(persona);
		return null;
	}
	
//	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(path = "/Perrera/Domicilio", produces = MediaType.APPLICATION_JSON_VALUE)
	public Domicilio getDomicilioXId(@RequestParam(defaultValue = "0") 
	                                 int id) {
		log.info("PerreraController.getDomicilioXId(" + id + ")");
		Domicilio domicilio = this.perros.getDomicilioXid(id);
		return domicilio;
	}
	
}