package entidades;

public class Accidente {
	
	Integer idAccidente; // obligaorio, numero interno manejador por la compaia
	Integer rutCliente; // obligatorio
	String dia; // fecha de accidente, fecha o string, formato = DD/MM/AAAA
	Integer hora; // formato = HH:MM ( 0 a 23 : 0 a 59 ) 
	String lugar; // obligatorio min 10 car , max 50
	String origen; // max 100 car
	String consecuencias; // max 100 car
	
	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}

	public Accidente() {
		super();
	}
	
	public Accidente(Integer idAccidente, Integer rutCliente, String dia, Integer hora, String lugar, String origen,
			String consecuencias) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public Integer getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(Integer idAccidente) {
		this.idAccidente = idAccidente;
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

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}


	
	
	
}
