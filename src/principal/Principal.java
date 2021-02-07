package principal;
import java.text.SimpleDateFormat;
import java.util.*;
import entidades.Administrativo;
import entidades.Cliente;
import entidades.Profesional;
import entidades.Usuario;
import principal.Contenedor;

public class Principal {

	public static void main(String[] args) {
		// ENTRADA SYSTEM.IN
		Scanner entrada = new Scanner(System.in);
		// INSTANCIA DE LA CLASE CONTENEDOR
		Contenedor contenedor = new Contenedor();
		// MENU PRINCIPAL
		Integer opMenu = 0;
		boolean repetir = true;
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" --------------------SISTEMA DE INFORMACIÓN -------------------- ");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("");
			System.out.println(" Ingrese la acción que desea realizar:");
			System.out.println(" 1.- Almacenar Cliente");
			System.out.println(" 2.- Almacenar Profesional");
			System.out.println(" 3.- Almacenar Administrativo");
			System.out.println(" 4.- Almacenar Capacitación");
			System.out.println(" 5.- Eliminar usuario");
			System.out.println(" 6.- Listar usuarios");
			System.out.println(" 7.- Listar usuarios por tipo");
			System.out.println(" 8.- Listar capacitaciones");
			System.out.println(" 9.- Salir");
			System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.print("OPCIÓN: ")	;
			opMenu = entrada.nextInt();
		
		switch (opMenu) {
			case 1 : //ALMACENAR CLIENTE
				contenedor.almacenarCliente();
					break;
			case 2 : // ALMACENAR PROFESIONAL
				contenedor.almacenarProfesional();
				break;
			case 3 : // ALMACENAR ADMINISTRATIVO
				contenedor.almacenarAdministrativo();
				break;
			case 4 : // ALMACENAR CAPACITACION
				contenedor.almacenarCapacitacion();
				break;
			//case 5 : // ELIMINAR USUARIO
				//contenedor.eliminarUsuario(Integer run);
				//break;
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
				repetir = false;
				break;
			default:
				System.out.println("Debe ingresar una opción válida!");
				break;
			}
		}while ( repetir );
	}
}

	
		
		
	
	
	

