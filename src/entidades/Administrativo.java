package entidades;

public class Administrativo extends Usuario {

	String area; // min 5 car, max 20
	String experienciaPrevia; // max 100 car
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}

	public Administrativo () {
		super();
	}
	
	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	// METODO - ANALIZAR USUARIO: Muestra datos de analizarUsuario() de clase padre, junto con el a�rea y su experiencia previa
	public void analizarUsuario() {
		System.out.println("TIPO DE USUARIO: ADMINISTRATIVO");
		System.out.println("Nombre="+ getNombre()+ ", RUN="+ getRun()+
				", �rea="+ getArea()+ ", Experiencia Previa="+ getExperienciaPrevia()+ "]");
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
	
	
}
