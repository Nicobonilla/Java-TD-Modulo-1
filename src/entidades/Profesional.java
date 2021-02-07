package entidades;

public class Profesional extends Usuario{

	String titulo; // obligatorio, min 10 car, max 50
	String feIngreso; // independiente declaracion( fecha || string ) fromato = DD//MM/AAAAA
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", feIngreso=" + feIngreso + "]";
	}

	public Profesional() {
		super();
	}
	
	public Profesional(String nombre, String feNac, Integer run) {
		super(nombre, feNac, run);
	}
	
	public Profesional(String nombre, String feNac, Integer run, String titulo, String feIngreso) {
		super(nombre, feNac, run);
		this.titulo = titulo;
		this.feIngreso = feIngreso;
	}
	
	// METODO - ANALIZAR USUARIO: Despliega datos de analizarUsiario() padre, junto con el Título y Fecha de Ingreso del profesional
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("TIPO DE USUARIO: PROFESIONAL");
		System.out.println("Nombre="+ getNombre()+ ", RUN="+ getRun()+ "\n" +
				", Titulo="+ getTitulo()+ ", Fecha de Ingreso="+ getFeIngreso()+ "]");
	}
	
	public void almacenarProfesional (String nombre, String feNac, Integer run, String titulo, String feIngreso) {	
		this.titulo = titulo;
		this.feIngreso = feIngreso;
	}

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
