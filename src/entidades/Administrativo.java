package entidades;
import java.util.*;

public class Administrativo extends Usuario {
	// ATRIBUTOS
	private String area; // min 5 car, max 20
	private String experienciaPrevia; // max 100 car
	// CONSTRUCTORES
	public Administrativo () {
		super();
	}
	public Administrativo(String nombre, String feNac, Integer run) {
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
	// IMPLEMENTACION DE INTERFACE ASESORIA
	@Override
	public void analizarUsuario() {
		System.out.println("TIPO DE USUARIO: ADMINISTRATIVO");
		System.out.println("Área="+ getArea()+ ", Experiencia Previa="+ getExperienciaPrevia());
	}
	// METODOS - INGRESAR
	@Override
	public void ingresar() {
		Scanner entrada = new Scanner(System.in);
		super.ingresar();
		entrada.nextLine();
		System.out.println("----- INGRESANDO DATOS PERFIL ADMINISTRATIO ----- ");
		System.out.print("ÁREA: ");
		setArea(entrada.nextLine());
		System.out.print("EXPERIENCIA PREVIA: ");
		setExperienciaPrevia(entrada.next());
	}
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
