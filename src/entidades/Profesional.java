package entidades;
/**
 * La clase Profesional es hija de la clase Usuario
 * @author nbnla
 *
 */
public class Profesional extends Usuario {
	//----------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------
	
	private String titulo; // obligatorio, min 10 car, max 50
	private String feIngreso; // independiente declaracion( fecha || string ) fromato = DD//MM/AAAAA
	
	//----------------------------------------------------------------------------
	// CONSTRUCTORES
	//----------------------------------------------------------------------------

	public Profesional() {
		super();
	}
	// MINIMO CON CLASE PADRE
	public Profesional(String nombre, String feNac, Integer run) {
		super(nombre, feNac, run);
	}
	// MINIMO CON CLASE PADRE Y OBLIGATORIOS
		public Profesional(String nombre, String feNac, Integer run, String titulo) {
			super(nombre, feNac, run);
		}
	// COMPLETO
	public Profesional(String nombre, String feNac, Integer run, String titulo, String feIngreso) {
		super(nombre, feNac, run);
		this.titulo = titulo;
		this.feIngreso = feIngreso;
	}
	// TO STRING
	@Override
	public String toString() {
		return "Profesional [ titulo=" + titulo + ", feIngreso=" + feIngreso + "]";
	}
	//----------------------------------------------------------------------------
	// IMPLEMENTACION INTERFACE ASESORIA
	//----------------------------------------------------------------------------
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("TIPO DE USUARIO: PROFESIONAL");
		System.out.println(" Titulo="+ getTitulo()+ ", Fecha de Ingreso="+ getFeIngreso()+ "]");
	}
	
	//----------------------------------------------------------------------------
	// METODOS
	//----------------------------------------------------------------------------
	
	// MOSTRAR
	public void mostrar() {
		super.mostrar();
		System.out.println(" PROFESIONAL [ Titulo: "+ getTitulo()+ ", Fecha de Ingreso: "+ getFeIngreso() + " ]");
	}
	// GETTERS AND SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFeIngreso() {
		return feIngreso;
	}

	public void setFeIngreso(String feIngreso) {
		this.feIngreso = feIngreso;
	}
	
}
