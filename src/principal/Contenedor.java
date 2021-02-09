package principal;
import java.util.*;

import entidades.Usuario;
import entidades.Cliente;
import entidades.Profesional;
import entidades.Administrativo;
import entidades.Capacitacion;
import java.util.*;

public class Contenedor {
	// LISTA DE INSTANCIAS DE LA INTERFAZ ASESORIA , PUEDE ALMACENAR DISTINTOS TIPOS DE USUARIOS
	Asesoria cliente, profesional, administrativo;
	List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();

	// 1.- ALMACENAR CLIENTE EN LISTA DE INSTANCIAS INTERFACE ASESORIA
	public void almacenarCliente(Asesoria cliente){
		listaAsesoria.add(cliente);
	}
	// 2.- ALMACENAR PROFESIONAL EN LISTA DE INSTANCIAS INTERFACE ASESORIA
	public void almacenarProfesional(Asesoria profesional){
		listaAsesoria.add(profesional);
	}
	// 3.- // 1.- ALMACENAR ADMINISTRATIVO EN LISTA DE INSTANCIAS INTERFACE ASESORIA
	public void almacenarAdministrativo(Asesoria administrativo){
		listaAsesoria.add(administrativo);
	}
	// 4.- ALMACENAR CAPACITACION EN LISTACAPCITACION
	ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	public void almacenarCapacitacion(Capacitacion capacitacion){
		listaCapacitacion.add(capacitacion);
	}
	// 5.- ELIMINAR USUARIO
	public void eliminarUsuario(Integer runn){
		 for (Asesoria registros : listaAsesoria) {
			 Usuario user = (Usuario) registros;
			 if ( runn.equals(user.getRun())) {
				 listaAsesoria.remove(listaAsesoria.indexOf(user));//int idEliminar = listaAsesoria.indexOf(registros);
			 }
		 }
	}
	// 6.- LISTAR USUARIOS : Despliegue de los datos de usuario
	public void listarUsuarios(){
		System.out.println("------- LISTA DE USUARIO  -------");
		for ( Asesoria registros : listaAsesoria) {
			Usuario user = (Usuario) registros;
			System.out.println("Usuario [nombre=" + user.getNombre() + ", feNac=" + user.getFeNac() + ", run=" + user.getRun() + "]");;
		}
	}
	// 7.- LISTAR USUARIOS POR TIPO 
	Scanner entrada = new Scanner(System.in);
	public void listarUsuariosPorTipo(){
		// Recibe un tipo de usuario ( cliente, administrador o profesional)
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
			case 2:
				for ( Asesoria profesional : listaAsesoria) {
					// Identificar que tipo de perfil ha sido 
					tipoPerfil = cliente.getClass().toString();
					if ( tipoPerfil.contains("Profesional")) {
						System.out.println(profesional.toString());
					}
				}
				break;
			case 3:
				for ( Asesoria administrativo : listaAsesoria) {
					// Identificar que tipo de perfil ha sido 
					tipoPerfil = cliente.getClass().toString();
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
	// 8.- LISTAR CAPACITACIONES
	public void listarCapacitaciones(){
		// Este metidi despliega las capacitaciones registradas en la lista respectiva,
		// junto con los datos del cliente al que está asociada dicha capacitacion 
		for ( Capacitacion capAux : listaCapacitacion  ) {
			System.out.println(capAux.toString());
			Cliente cli = new Cliente();
			if( capAux.getRutCliente() == cli.getRut()) {
				System.out.println(cli.toString());
			}
		}
	}
	// RESTRICCIONES
	


}