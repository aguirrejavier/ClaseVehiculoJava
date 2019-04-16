package tpa.EjercicioVehiculo;

public class Motocicleta extends Vehiculo {

	 Persona acompañante;
	 
	 public Motocicleta() {
		 super();
		 this.acompañante=new Persona();
	 }
	 
	 public Motocicleta(Persona chofer, Persona acompañante, int cantKMRecorridos) {
		super(chofer,cantKMRecorridos);
		this.acompañante = acompañante;
	}
	 
	 public void agregarAcompañante(Persona persona) {
		 this.acompañante = persona;
	 }

	@Override
	public void cambiarChofer(Persona persona) {
		
		if(chofer.getDni() != 0) {
			setChofer(persona);
		}
		
	}
	
}
