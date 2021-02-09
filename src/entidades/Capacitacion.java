package entidades;
import java.util.*;

import principal.Asesoria;
/**
 * Esta clase 
 * @author nbnla
 *
 */
public class Capacitacion extends Usuario implements Asesoria {
	//----------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------
	private Integer idCapacitacion; // obligatorio, numero interno
	private Integer rutCliente; // obligatorio
	private String dia; // dia de la semana. Valor entre "Lunes" y "Domingo" (en ese formator)
	private String hora; // formato HH:MM ( hor entre 0 a 23, minutos 0 a 59 )
	private String lugar; // obligatorio, min 10 car max 50
	private String duracion; // max 70 car
	private Integer cantidadAsistentes; // obligatorio, numero entero menor que 1000
	
	//----------------------------------------------------------------------------
	// CONSTRUCTORES
	//----------------------------------------------------------------------------

	public Capacitacion() {
	}
	// MINIMO CON LOS ATRIBUTOS OBLIGATORIOS
	public Capacitacion(Integer idCapacitacion, Integer rutCliente, String lugar) {
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.lugar = lugar;
	}
	// COMPLETO
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
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}
	//----------------------------------------------------------------------------
	// METODOS
	//----------------------------------------------------------------------------
	// MOSTRAR DETALLE
	public String mostrarDetalle(){ 
		return "La capacitación será en "+ getLugar() + " a las "+ getHora() + " del día "+ getDia() + ", y durará "+ getDuracion() +" minutos";
	}
	// GETTERS & SETTERS
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
