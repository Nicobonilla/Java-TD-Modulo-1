package entidades;
import java.util.*;

import principal.Asesoria;

public class Capacitacion extends Usuario implements Asesoria {

	Integer idCapacitacion; // obligatorio, numero interno
	Integer rutCliente; // obligatorio
	String dia; // dia de la semana. Valor entre "Lunes" y "Domingo" (en ese formator)
	String hora; // formato HH:MM ( hor entre 0 a 23, minutos 0 a 59 )
	String lugar; // obligatorio, min 10 car max 50
	String duracion; // max 70 car
	Integer cantidadAsistentes; // obligatorio, numero entero menor que 1000
	
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

	public Capacitacion() {
		super();
	}

	public Capacitacion(Integer idCapacitacion, Integer rutCliente, String dia, String hora, String lugar,
			String duracion, Integer cantidadAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	// IMPLEMENTACION INTERFACE ASESORIA
	
	
	// METODO - MOSTRAR DETALLE
	public String mostrarDetalle(){ 
		return "La capacitación será en "+ getLugar() + " a las "+ getHora() + " del día "+ getDia() + ", y durará "+ getDuracion() +" minutos";
	}
	
	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Integer getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(Integer cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	
	
	
}
