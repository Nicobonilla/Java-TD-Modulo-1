package principal;

import entidades.Asesoria;
import entidades.Usuario;
import entidades.Cliente;
import entidades.Profesional;
import entidades.Administrativo;
import entidades.Capacitacion;
import java.util.*;

public class Contenedor {
	
	Usuario cliente1, profesional1, administrativo1;
	
	// LISTA DE INSTANCIAS DE LA INTERFAZ ASESORIA , PUEDE ALMACENAR DISTINTOS TIPOS DE USUARIOS
	List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	
	// LISTA DE OBJETOS DE LA CLASE CAPACITACION
	ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
	Scanner entrada = new Scanner(System.in);
	
	
	// METODOS
	
	public void almacenarUsuario() {
		System.out.println("----- NUEVO USUARIO ----- ");
		Usuario usuario = new Usuario();
		System.out.print("NOMBRE: ");
		usuario.setNombre(entrada.nextLine());
		System.out.print("FECHA DE NACIMIENTO: ");
		usuario.setFeNac(entrada.nextLine());
		System.out.print("RUN: ");
		usuario.setRun(entrada.nextInt());
		}
	// 1.- ALMACENAR CLIENTE
	public void almacenarCliente(){
		Cliente cliente = new Cliente();
			almacenarUsuario();
			System.out.println("----- INGRESANDO DATOS PERFIL CLIENTE ----- ");
			System.out.print("RUT: "); 
			cliente.setRut(entrada.nextInt());
			entrada.nextLine();
			System.out.print("Nombres: ");
			cliente.setNombres(entrada.nextLine());
			System.out.print("Apellidos: ");
			cliente.setApellidos(entrada.nextLine());
			System.out.print("Telefono: ");
			cliente.setTelefono(entrada.nextLine());
			System.out.print("AFP: ");
			cliente.setAfp(entrada.nextLine());
			System.out.print("Sistema de Salud (1: Fonasa - 2 : Isapre ) : ");
			cliente.setSisSalud(entrada.nextInt());
			entrada.nextLine();
			System.out.print("Dirección: ");
			cliente.setDireccion(entrada.nextLine());
			System.out.print("Comuna: ");
			cliente.setComuna(entrada.nextLine());
			System.out.print("Edad: ");
			cliente.setEdad(entrada.nextInt()); 
			listaAsesoria.add(cliente);
	}
	// 2.- ALMACENAR PROFESIONAL
	public void almacenarProfesional() {
		almacenarUsuario();
		Profesional profesional = new Profesional();
		System.out.println("----- INGRESANDO DATOS PERFIL PROFESIONAL ----- ");
		System.out.print("TITULO: ");
		profesional.setTitulo(entrada.nextLine());
		System.out.print("FECHA DE INGRESO: ");
		profesional.setFeIngreso(entrada.next());
		listaAsesoria.add(profesional);
		}
	// 3.- ALMACENAR ADMINISTRATIVO
	public void almacenarAdministrativo(){
		almacenarUsuario();
		Administrativo administrativo = new Administrativo();
		System.out.println("----- INGRESANDO DATOS PERFIL ADMINISTRATIO ----- ");
		System.out.print("ÁREA: ");
		administrativo.setArea(entrada.nextLine());
		System.out.print("EXPERIENCIA PREVIA: ");
		administrativo.setExperienciaPrevia(entrada.next());
		listaAsesoria.add(administrativo);
		}
	// 4.- ALMACENAR CAPACITACION
	public void almacenarCapacitacion(){
		System.out.println("----- INGRESANDO NUEVA CAPACITACIÓN ----- ");
		Capacitacion capacitacion = new Capacitacion();
		System.out.print("RUT CLIENTE: ");
		capacitacion.setRutCliente(entrada.nextInt());
		System.out.print("DIA: ");
		capacitacion.setDia(entrada.next());
		System.out.print("HORA: ");
		capacitacion.setHora(entrada.next());
		System.out.print("LUGAR: ");
		capacitacion.setLugar(entrada.nextLine());
		System.out.print("DURACION: ");
		capacitacion.setDuracion(entrada.next());
		System.out.print("CANTIDAD ASISTENTES:: ");
		capacitacion.setRutCliente(entrada.nextInt());
		listaCapacitaciones.add(capacitacion);
	}
	// 5.- ELIMINAR USUARIO
	//public String eliminarUsuario(){
		// Permite eliminar un usuario desde la lista de interfaces de Asesoria, de acuerdo con el RUN del usuario

	//}
	// 6.- LISTAR USUARIOS
	public void listarUsuarios(){
		
		for (Asesoria asesoria : listaAsesoria) {
			System.out.println(asesoria);
			
				
			}
			
		}
		// permite desplegar la lista completa de usuarios, independiente del tipo. 
		//En este metodo solo se deben desplegar los datos de la clase usuario
		
	}
	// 7.- LISTAR USUARIOS POR TIPO
	//public String listarUsuariosPorTipo(){
		// Recibe un tipo de usuario ( cliente, administrador o profesional), 
		// y retorla los datos respectivos según el tipo de usuario.
		
	//}
	// 8.- LISTAR CAPACITACIONES
	//public String listarCapacitaciones(){
		// Este metidi despliega las capacitaciones registradas en la lista respectiva,
		// junto con los datos del cliente al que está asociada dicha capacitacion */
	//}
}
