package entidades;

public class VisitaTerreno {

	Integer idVistaTerreno; // obligatorio, numero interno
	Integer rutCliente; // obligatorio
	String dia; // DD/MM/AAAA
	Integer hora;
	String lugar; // obligatorio,, min 10 car, max 50
	String comentarios; // max 100 car
	
	@Override
	public String toString() {
		return "VisitaTerreno [idVistaTerreno=" + idVistaTerreno + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

	public VisitaTerreno(Integer idVistaTerreno, Integer rutCliente, String dia, Integer hora, String lugar,
			String comentarios) {
		super();
		this.idVistaTerreno = idVistaTerreno;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public VisitaTerreno() {
		super();
	}

	public Integer getIdVistaTerreno() {
		return idVistaTerreno;
	}

	public void setIdVistaTerreno(Integer idVistaTerreno) {
		this.idVistaTerreno = idVistaTerreno;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
}
