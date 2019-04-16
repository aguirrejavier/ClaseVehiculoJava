package tpa.EjercicioVehiculo;

public class Motocicleta extends Vehiculo {

	 Persona acompa�ante;
	 
	 public Motocicleta() {
		 super();
		 this.acompa�ante=new Persona();
	 }
	 
	 public Motocicleta(Persona chofer, Persona acompa�ante, int cantKMRecorridos) {
		super(chofer,cantKMRecorridos);
		this.acompa�ante = acompa�ante;
	}
	 
	 public void agregarAcompa�ante(Persona persona) {
		 this.acompa�ante = persona;
	 }

	@Override
	public void cambiarChofer(Persona persona) {
		
		if(chofer.getDni() != 0) {
			setChofer(persona);
		}
		
	}
	
}
