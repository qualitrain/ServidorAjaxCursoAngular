package mx.com.qualitrain.personas.servicios;


import java.util.Set;

import mx.com.qualitrain.personas.entidades.CatValorSimple;
import mx.com.qualitrain.personas.entidades.Persona;

public interface IGestorDatos {
	Set<CatValorSimple> leerValoresCatSimple(String tipoValor);
	Set<CatValorSimple> leerValoresCatSimpleConInicio(String tipoValor, String inicioValAlfanumerico);
	Set<Persona> leerPersonas();
	Persona leerPersonaXID(long id);
}
