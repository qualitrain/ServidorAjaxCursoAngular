package mx.com.qualitrain.personas.web;

import java.util.List;

public interface IServicioCatalogos {
	public List<String> getNombresSugeridos(String inicioNombre);
	public List<String> getApellidosSugeridos(String inicioNombre);
}
