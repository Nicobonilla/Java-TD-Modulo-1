package principal;
import java.util.*;
import principal.Vista;
/**
 * La clase Principal es justamente la clase central, donde se estructura
 * el software, contiene el men� principal de operaciones. 
 * 
 * @author Nicol�s Andr�s Bonilla Mar�n
 * @version v1
 * @
 */

public class Principal {

	public static void main(String[] args) {
		// ENTRADA SYSTEM.IN
		Scanner entrada = new Scanner(System.in);
		// INSTANCIA DE LA CLASE CONTENEDOR
		Contenedor contenedor = new Contenedor();
		// MENU PRINCIPAL
		Integer opMenu = 0;
		boolean repetir = true;
		Vista vista = new Vista();
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" --------------------SISTEMA DE INFORMACI�N -------------------- ");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("");
			System.out.println(" Ingrese la acci�n que desea realizar:");
			System.out.println(" 1.- Almacenar Cliente");
			System.out.println(" 2.- Almacenar Profesional");
			System.out.println(" 3.- Almacenar Administrativo");
			System.out.println(" 4.- Almacenar Capacitaci�n");
			System.out.println(" 5.- Eliminar usuario");
			System.out.println(" 6.- Listar usuarios");
			System.out.println(" 7.- Listar usuarios por tipo");
			System.out.println(" 8.- Listar capacitaciones");
			System.out.println(" 9.- Salir");
			System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.print("OPCI�N: ");
			opMenu = entrada.nextInt();
		switch (opMenu) {
			case 1 : //ALMACENAR CLIENTE
				contenedor.almacenarCliente(vista.ingresarCliente(vista.ingresarUsuario()));
				break;
			case 2 : // ALMACENAR PROFESIONAL
				contenedor.almacenarProfesional(vista.ingresarProfesional(vista.ingresarUsuario()));
				break;
			case 3 : // ALMACENAR ADMINISTRATIVO
				contenedor.almacenarAdministrativo(vista.ingresarAdministrativo(vista.ingresarUsuario()));
				break;
			case 4 : // ALMACENAR CAPACITACION
				contenedor.almacenarCapacitacion(vista.ingresarCapacitacion());
				break;
			case 5 : // ELIMINAR USUARIO
				System.out.print("INGRESE RUN DE USUARIO A ELIMINAR: ");
				Integer runn = entrada.nextInt();
				contenedor.eliminarUsuario(runn);
				break;
			case 6 : // LISTAR USUARIOS
				contenedor.listarUsuarios();
				break;
			case 7 : // LISTAR USUARIO POR TIPO
				contenedor.listarUsuariosPorTipo();
				break;
			case 8 : // LISTAR CAPACITACIONES
				contenedor.listarCapacitaciones();
				break;
			case 9 : // SALIR
				System.out.println(" USTED SALI� DEL SISTEMA");
				repetir = false;
				break;
			default:
				System.out.println("Debe ingresar una opci�n v�lida!");
				break;
			}
		}while ( repetir );
		System.exit(0);
	}
}

	
		
		
	
	
	

