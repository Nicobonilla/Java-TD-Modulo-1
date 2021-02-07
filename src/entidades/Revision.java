package entidades;

public class Revision {
	
	Integer idRevision; // obligatoro, numero interno
	Integer idVisitaTerreno; //obligatoriom numero de la vista a la que s asoci la revision
	String numeroAlusivoRevision; // obligatorio, min 10 car, max 50
	String detalleParaRevisar; // max 100 car
	Integer estado; // 1 : Sin Problemas, 2 : Con Observaciones, 3 : No Aprueba, solo se puede ingresar estos valores
	
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerreno=" + idVisitaTerreno
				+ ", numeroAlusivoRevision=" + numeroAlusivoRevision + ", detalleParaRevisar=" + detalleParaRevisar
				+ ", estado=" + estado + "]";
	}

	
	public Revision() {
		super();
	}

	public Revision(Integer idRevision, Integer idVisitaTerreno, String numeroAlusivoRevision,
			String detalleParaRevisar, Integer estado) {
		super();
		this.idRevision = idRevision;
		this.idVisitaTerreno = idVisitaTerreno;
		this.numeroAlusivoRevision = numeroAlusivoRevision;
		this.detalleParaRevisar = detalleParaRevisar;
		this.estado = estado;
	}


	public Integer getIdRevision() {
		return idRevision;
	}


	public void setIdRevision(Integer idRevision) {
		this.idRevision = idRevision;
	}


	public Integer getIdVisitaTerreno() {
		return idVisitaTerreno;
	}


	public void setIdVisitaTerreno(Integer idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}


	public String getNumeroAlusivoRevision() {
		return numeroAlusivoRevision;
	}


	public void setNumeroAlusivoRevision(String numeroAlusivoRevision) {
		this.numeroAlusivoRevision = numeroAlusivoRevision;
	}


	public String getDetalleParaRevisar() {
		return detalleParaRevisar;
	}


	public void setDetalleParaRevisar(String detalleParaRevisar) {
		this.detalleParaRevisar = detalleParaRevisar;
	}


	public Integer getEstado() {
		return estado;
	}


	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	
	
	
}
