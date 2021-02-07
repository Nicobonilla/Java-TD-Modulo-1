package entidades;
import java.util.*;

// CLASE DEBE IMPLEMENTAR LA INTERFAZ Asesoria
public class Usuario implements Asesoria{
	
	String nombre;  // obligatorio, min 10 car max 50
	String feNac; //obligaatorio, data o string no matter, DD/MM/AAAA
	Integer run; // run < 99.999.999	
	Scanner entrada = new Scanner(System.in);

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", feNac=" + feNac + ", run=" + run + "]";
	}

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String feNac, Integer run) {
		super();
		this.nombre = nombre;
		this.feNac = feNac;
		this.run = run;
	}
	
	
	// METODO - MOSTRAR EDAD
	public void mostrarEdad() {
		String[] fechas = new String[3];
		fechas = getFeNac().split("/");
		Integer añoNacimiento = Integer.parseInt(fechas[0]);
		Calendar now = Calendar.getInstance();
		Integer añoActual = now.get(Calendar.YEAR);
		System.out.println("El usuario tiene "+( añoActual - añoNacimiento) +" años"); 
	}
	
	// METODO - ANALIZAR USUARIO: Despliega el nombre y RUN
	public void analizarUsuario() {
		System.out.println("___________________________________________________");
		System.out.print( "Nombre: "+ getNombre() + "RUN: "+ getRun());
		System.out.println("..                                               ..");

	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) { // obligatorio, min 10 car max 50
		this.nombre = nombre;

	}

	public String getFeNac() {
		return feNac;
	}

	public void setFeNac(String feNac) {  //obligatorio, data o string no matter, DD/MM/AAAA
		this.feNac = feNac;
	}
	
	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}
}
