package tpa.EjercicioVehiculo;

public abstract class Vehiculo {

	Persona chofer;
	int cantKilometrosRecorridos;
	
	public Vehiculo() {
	}
	
	public Vehiculo(Persona chofer,int cantKMRecorridos) {
		this.chofer = chofer;
		this.cantKilometrosRecorridos = cantKMRecorridos;
	}
	
	public Integer getKMRecorridos() {
		return cantKilometrosRecorridos;
	}
	
	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public abstract void cambiarChofer(Persona persona);
	
}
