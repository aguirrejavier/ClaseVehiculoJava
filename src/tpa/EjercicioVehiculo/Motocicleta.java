package tpa.EjercicioVehiculo;

public class Motocicleta extends Vehiculo {

	 Persona acompaņante;
	 
	 public Motocicleta() {
		 super();
		 this.acompaņante=new Persona();
	 }
	 
	 public Motocicleta(Persona chofer, Persona acompaņante, int cantKMRecorridos) {
		super(chofer,cantKMRecorridos);
		this.acompaņante = acompaņante;
	}
	 
	 public void agregarAcompaņante(Persona persona) {
		 this.acompaņante = persona;
	 }

	@Override
	public void cambiarChofer(Persona persona) {
		
		if(chofer.getDni() != 0) {
			setChofer(persona);
		}
		
	}
	
}
