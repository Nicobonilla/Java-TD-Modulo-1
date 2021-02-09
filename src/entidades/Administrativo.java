package entidades;
/**
 * La clase Administrativo es clase hija de Usuarios.
 * @author nbnla
 *
 */
public class Administrativo extends Usuario {
	//----------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------
	private String area; // min 5 car, max 20
	private String experienciaPrevia; // max 100 car
	
	//----------------------------------------------------------------------------
	// CONSTRUCTORES
	//----------------------------------------------------------------------------
	public Administrativo () {
		super();
	}
	// MINIMO CON CLASE PADRE
	public Administrativo(String nombre, String feNac, Integer run) {
		super(nombre, feNac, run);
	}
	// MINIMO CON CLASE PADRE Y ATRIBUTOS OBLIGATORIOS
	public Administrativo(String nombre, String feNac, Integer run, String area) {
		super(nombre, feNac, run);
	}
	public Administrativo(String nombre, String feNac, Integer run, String area, String experienciaPrevia) {
		super(nombre, feNac, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	@Override
	public String toString() {
		return "Administrativo [ area=" + area + ", experienciaPrevia=" + experienciaPrevia +"]";
	}
	//----------------------------------------------------------------------------
	// IMPLEMENTACION INTERFACE ASESORIA
	//----------------------------------------------------------------------------
	@Override
	public void analizarUsuario() {
		System.out.println("TIPO DE USUARIO: ADMINISTRATIVO");
		System.out.println("Área="+ getArea()+ ", Experiencia Previa="+ getExperienciaPrevia());
	}
	//----------------------------------------------------------------------------
	// METODOS
	//----------------------------------------------------------------------------
	// MOSTRAR
	public void mostrar() {
		super.mostrar();
		System.out.println(" ADM [ Área: "+ getArea()+ ", Exp. Previa: "+ getExperienciaPrevia()+ " ]");
	}
	// GETTERS & SETTERS
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
