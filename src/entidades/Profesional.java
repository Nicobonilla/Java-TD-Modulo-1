package entidades;

import java.util.Scanner;

public class Profesional extends Usuario {
	// ATRIBUTOS
	private String titulo; // obligatorio, min 10 car, max 50
	private String feIngreso; // independiente declaracion( fecha || string ) fromato = DD//MM/AAAAA
	// CONSTRUCTORES
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
	@Override
	public String toString() {
		return "Profesional [ titulo=" + titulo + ", feIngreso=" + feIngreso + "]";
	}
	// IMPLEMENTACION DE INTERFACE ASESORIA
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("TIPO DE USUARIO: PROFESIONAL");
		System.out.println(" Titulo="+ getTitulo()+ ", Fecha de Ingreso="+ getFeIngreso()+ "]");
	}
	// METODOS - INGRESAR
	@Override
	public void ingresar() {
		Scanner entrada = new Scanner(System.in);
		super.ingresar();
		entrada.nextLine();
		System.out.println("----- INGRESANDO DATOS PERFIL PROFESIONAL ----- ");
		System.out.print("TITULO: ");
		setTitulo(entrada.nextLine());
		System.out.print("FECHA DE INGRESO: ");
		setFeIngreso(entrada.next());
	}
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
