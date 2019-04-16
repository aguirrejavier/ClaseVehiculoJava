package tpa.EjercicioVehiculo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
	
	private String apyn;
	private int dni;
	private Date fechaNac;
	
	public Persona() {
		this.apyn = "";
		this.dni = 0;
		this.fechaNac = new Date();
	}
	
	public Persona(String apyn, int dni,int dia,int mes, int anio) {
		this.apyn = apyn;
		this.dni = dni;
		Calendar cal = new GregorianCalendar(anio,mes-1,dia);
		this.fechaNac = cal.getTime();
	}
	
	public Integer getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Persona [apyn=" + apyn + ", dni=" + dni + ", fechaNac=" + fechaNac + "]";
	}
	
	
	
}
