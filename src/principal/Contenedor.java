package principal;
import java.util.*;

import entidades.Usuario;
import entidades.Cliente;
import entidades.Profesional;
import entidades.Administrativo;
import entidades.Capacitacion;
import java.util.*;
/**
 * En la clase Contenedor se encuentran los métodos principales
 * @author nbnla
 *
 */
public class Contenedor {
	//----------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------
	Asesoria cliente, profesional, administrativo;
	//----------------------------------------------------------------------------
	// INSTANCIAS
	//----------------------------------------------------------------------------
	List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	Scanner entrada = new Scanner(System.in);

	/**
	 * Almacena usuarios de tipo Cliente en la lista de instancias de la interface Asesoria
	 * @param cliente
	 */
	public void almacenarCliente(Asesoria cliente){
		listaAsesoria.add(cliente);
	}
	/**
	 * Almacena usuarios de tipo Profesional en la lista de instancias de la interface Asesoria
	 * @param profesional
	 */
	public void almacenarProfesional(Asesoria profesional){
		listaAsesoria.add(profesional);
	}
	 /**
	 * Almacena usuarios de tipo Administrativo en la lista de instancias de la interface Asesoria
	 * @param administrativo
	 */
	public void almacenarAdministrativo(Asesoria administrativo){
		listaAsesoria.add(administrativo);
	}
	/**
	 * Permite agregar una nueva capacitacion a la lista de instancias de la interface Asesoria
	 * @param capacitacion
	 */
	public void almacenarCapacitacion(Capacitacion capacitacion){
		listaCapacitacion.add(capacitacion);
	}
	/**
	 * Permite eliminar un usuario utilizando su RUN
	 * No eliminar el último usuario o se caerá el programa
	 * @param runn
	 */
	public void eliminarUsuario(Integer runn){
		 for (Asesoria registros : listaAsesoria) {
			 Usuario user = (Usuario) registros;
			 if ( runn.equals(user.getRun())) {
				 listaAsesoria.remove(listaAsesoria.indexOf(user));
			 }
		 }
	}
	/**
	 * Despliega la lista completa de usuarios, independiente del tipo.
	 */
	public void listarUsuarios(){
		System.out.println("------- LISTA DE USUARIO  -------");
		for ( Asesoria registros : listaAsesoria) {
			Usuario user = (Usuario) registros;
			System.out.println("Usuario [nombre=" + user.getNombre() + ", feNac=" +
			user.getFeNac() + ", run=" + user.getRun() + "]");;
		}
	}
	/**
	 * Se despliegan los datos de usuarios según tipo de usuario (Cliemte, Profesional y Administrativo)
	 * 
	 */
	public void listarUsuariosPorTipo(){
	
		System.out.println("------- LISTA DE USUARIO POR TIPO  DE PERFIL -------");
		System.out.println(" 1.- CLIENTE");
		System.out.println(" 2.- PROFESIONAL");
		System.out.println(" 3.- ADMINISTRATIVO");
		System.out.println("Ingrese el perfil deseado: ");
		Integer opcion = entrada.nextInt();
		entrada.nextLine();
		String tipoPerfil="";
		// y retorla los datos respectivos según el tipo de usuario.
		switch (opcion) {
			case 1: // PERFIL CLIENTE
				for ( Asesoria cliente : listaAsesoria) {
					// Identificar que tipo de perfil ha sido 
					tipoPerfil = cliente.getClass().toString();
					if ( tipoPerfil.contains("Cliente")) {
						System.out.println(cliente.toString());
					}
				}
				break;
			case 2: // PERFIL PROFESIONAL
				for ( Asesoria profesional : listaAsesoria) {
					// Identificar que tipo de perfil ha sido 
					tipoPerfil = profesional.getClass().toString();
					if ( tipoPerfil.contains("Profesional")) {
						System.out.println(profesional.toString());
					}
				}
				break;
			case 3: // PERFIL ADMINISTRATIVO
				for ( Asesoria administrativo : listaAsesoria) {
					// Identificar que tipo de perfil ha sido 
					tipoPerfil = administrativo.getClass().toString();
					if ( tipoPerfil.contains("Administrativo")) {
						System.out.println(administrativo.toString());
					}
				}
				break;
			default:
				System.out.println(" Debe ingresar una opción valida! ");
				break;
			}
	}
	/**
	 * Este metodo despliega las capacitaciones registradas en la lista respectiva
	 * junto con los datos del cliente al que está asociada dicha capacitacion
	 */
	public void listarCapacitaciones(){
		Cliente cli = new Cliente();
		for ( Capacitacion capAux : listaCapacitacion  ) {
			System.out.println(capAux.toString());
			for (Asesoria usuarios : listaCapacitacion) {
				if( capAux.getRutCliente() == cli.getRut()) {
					System.out.println(cli.toString());
				}
			}
		}
	}
}
	