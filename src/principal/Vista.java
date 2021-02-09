package principal;
import entidades.Usuario;
import entidades.Cliente;
import entidades.Profesional;
import entidades.Administrativo;
import entidades.Capacitacion;
import principal.ServicioValidacion; 
import java.util.*;
public class Vista {
	ServicioValidacion sv = new ServicioValidacion();
	Scanner entrada = new Scanner(System.in);
	public Usuario ingresarUsuario(){
		System.out.println("----- NUEVO USUARIO ----- ");
		System.out.print("NOMBRE: ");
		String nombre = entrada.nextLine();
		sv.resTmaxmin(nombre, "Nombre", 10, 50); // RESTRICCION MAX MIN
		System.out.print("FECHA DE NACIMIENTO: ");
		String feNac = entrada.next();
		sv.validacionFecha(feNac, "Fecha de Nacimiento"); // VALIDACION DE FECHA
		System.out.print("RUN: ");
		Integer run = entrada.nextInt();
		sv.validacionNumero(run, "Run", 0, 99999999); // RESTRICCION 99.999.999
		Usuario usuario = new Usuario(nombre, feNac, run);
		return usuario;
	}
	
	public Cliente ingresarCliente(Usuario usuario) {
		String nombre = usuario.getNombre();
		String feNac = usuario.getFeNac();
		Integer run = usuario.getRun();
		System.out.println("----- INGRESANDO DATOS PERFIL CLIENTE ----- ");
		System.out.print("RUT: "); 
		Integer rut = entrada.nextInt(); 
		sv.validacionNumero(rut, "Rut", 0, 99999999); // RESTRICCION 99.999.999
		entrada.nextLine();
		System.out.print("Nombres: ");
		String nombres = entrada.nextLine();
		sv.resTmaxmin(nombres, "Nombres", 5, 30); // RESTRICCION MAX MIN
		System.out.print("Apellidos: ");
		String apellidos =  entrada.nextLine();
		sv.resTmaxmin(nombres, "Nombres", 5, 30); //RESTRICCION MAX MIN
		System.out.print("Telefono: ");
		String telefono = entrada.nextLine();
		sv.restriccionObligatorio(telefono, "Teléfono"); // RESTRICCION OBLIGATORIA
		System.out.print("AFP: ");
		String afp = entrada.nextLine();
		sv.resTmaxmin(afp, "AFP", 4, 30); //RESTRICCION MAX MIN
		System.out.print("Sistema de Salud (1: Fonasa - 2 : Isapre ) : ");
		Integer sisSalud = entrada.nextInt();
		sv.resUnodos(sisSalud, "Sistema de Salid"); // RESTRICCION 1 O 2
		entrada.nextLine();
		System.out.print("Dirección: ");
		String direccion = entrada.nextLine();
		sv.resTmaxmin(direccion, "Direccion", 0 , 70); //  RESTRICCION MAXIMO
		System.out.print("Comuna: ");
		String comuna = entrada.nextLine();
		sv.resTmaxmin(comuna, "Comuna", 0 , 50); //  RESTRICCION MAXIMO
		System.out.print("Edad: ");
		Integer edad = entrada.nextInt(); 
		sv.validacionNumero(run, "Run", 0, 150); //  RESTRICCION MAXIMO
		entrada.nextLine();
		Cliente cliente = new Cliente(nombre, feNac, run, rut, nombres, apellidos, telefono, afp, sisSalud, direccion, comuna, edad);
		cliente.analizarUsuario();
		return cliente;
	}
	
	public Profesional ingresarProfesional(Usuario usuario) {
		String nombre = usuario.getNombre();
		String feNac = usuario.getFeNac();
		Integer run = usuario.getRun();
		entrada.nextLine();
		System.out.println("----- INGRESANDO DATOS PERFIL PROFESIONAL ----- ");
		System.out.print("TITULO: ");
		String titulo = entrada.nextLine();
		sv.resTmaxmin(titulo, "Titulo", 10 , 50); // RESTRICCION MIN MAX
		System.out.print("FECHA DE INGRESO: ");
		String feIngreso = entrada.next();
		sv.validacionFecha(feNac, "Fecha de Ingreso: ");
		Profesional profesional = new Profesional(nombre, feNac, run, titulo, feIngreso);
		return profesional;
	}

	public Administrativo ingresarAdministrativo(Usuario usuario) {
		String nombre = usuario.getNombre();
		String feNac = usuario.getFeNac();
		Integer run = usuario.getRun();
		entrada.nextLine();
		System.out.println("----- INGRESANDO DATOS PERFIL ADMINISTRATIO ----- ");
		System.out.print("AREA: ");
		String area = entrada.nextLine();
		sv.resTmaxmin(area, "Área", 10 , 20); //RESTRICCION MAX MIN
		System.out.print("EXPERIENCIA PREVIA: ");
		String experienciaPrevia = entrada.nextLine();
		sv.resTmaxmin(experienciaPrevia, "Experiencia Previa", 0, 100); //RESTRICCION MAX MIN
		Administrativo administrativo = new Administrativo(nombre, feNac, run, area, experienciaPrevia);
		return administrativo;
	}
	
	public Capacitacion ingresarCapacitacion() {
		System.out.println("----- INGRESANDO NUEVA CAPACITACIÓN ----- ");
		Integer setIdCapacitacion = 1;// ++= ultimo;
		setIdCapacitacion = entrada.nextInt();
		sv.numObligatorio(setIdCapacitacion, "ID Capacitacion");
		System.out.print("RUT CLIENTE: ");
		Integer rutCliente = entrada.nextInt();
		sv.numObligatorio(setIdCapacitacion, "RUT Cliente"); // VALIDACION MENOR A 99.999.999
		System.out.print("DIA: ");
		String dia = entrada.next();
		sv.vDia(dia,"Dia"); 			// VALIDACION DIA DE LA SEMANA
		System.out.print("HORA: ");
		String hora = entrada.next();	// VALIDACION HORA
		
		System.out.print("LUGAR: ");
		String lugar = entrada.nextLine();
		sv.resTmaxmin(lugar, "Lugar", 10, 50); //RESTRICCION MAX MIN
		System.out.print("DURACION: ");
		String duracion = entrada.next();
		sv.resTmaxmin(lugar, "Duracion", 0, 70); //RESTRICCION MAX MIN
		System.out.print("CANTIDAD ASISTENTES:: ");
		Integer cantidadAsistentes = entrada.nextInt();
		sv.validacionNumero(cantidadAsistentes, "Cantidad de Asistentes", 0, 1000); // RESTRICCION NUMERO
		
		Capacitacion capacitacion = new Capacitacion(setIdCapacitacion, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
		return capacitacion;
	}
	
}