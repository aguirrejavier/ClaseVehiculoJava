package tpa.EjercicioVehiculo;

import java.util.ArrayList;

public class Autobus extends Vehiculo{

	ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public void agregarPasajero(Persona persona) {
		personas.add(persona);
	}

	@Override
	public void cambiarChofer(Persona persona) {
		
		if(personas.isEmpty()) {
			setChofer(persona);
		}
	}
	
	
}
