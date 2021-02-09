package principal;
import java.util.Scanner;
/**
 * En esta clase se encuentran todos los metodos relacionados con la validacion de los datos
 * @author nbnla
 *
 */
public class ServicioValidacion {
	Scanner entrada = new Scanner(System.in);
	/**
	 * Metodo para validar numeros, permite definir un minimo y un máximo, junto con un mensaje de error
	 * según sea la variable y entrada reiterada del dato 
	 * @param numero Numero que se quiere validar
	 * @param nombreVar Nombre de la variable que se quiere validar
	 * @param min Valor mínimo que puede obtener el dato
	 * @param max Valor mázimo que puede obtener el dato
	 * @return Número validado según las restricciones de máximo y mínimo
	 */
	public Integer validacionNumero(Integer numero, String nombreVar , Integer min, Integer max) {
		while ( numero >= 99999999) {		
			System.out.println("El campo "+ nombreVar +" no puede ser mayor a 99.999.999,"
					+ " ingreselo sin puntos ni guion!");
			numero = entrada.nextInt();
			}
		return numero;
		}
	
	/** Método que asegura el ingreso de datos String obligatorios, permite hacer consultas
	 * reiteradas hasta obtener el dato requerido
	 * @param string Es el dato obligatorio que se debe ingresar
	 * @param nombreVar Nombre del campo: Permite realizar consultar reiterativas según sea el atributo
	 * @return Arroja el dato obligatorio solicitado
	 */
	public String restriccionObligatorio(String string, String nombreVar) {
			Integer largo = string.length();
			while( largo.equals(0)) {
					System.out.println("El campo "+ nombreVar +"es obligatorio, favor ingreselo!");
					string = entrada.nextLine();
					largo = string.length();
			}
		return string;
	}
	/**
	 * Metodo que asegura el ingreso de datos Integer obligatorios, permite hacer 
	 * consultas reiteradas hastaobtener el numero solicitado
	 * @param in Es el valor que se quiere obtener
	 * @param nombreVar Es el nombre del dato que se desea obtener, permite hacer 
	 * consulta segpun sea el dato
	 * @return Retorna un Integer
	 */
	public Integer numObligatorio(Integer in, String nombreVar) {
			while( in == null) {
					System.out.println("El campo "+ nombreVar +"es obligatorio, favor ingreselo!");
					in = entrada.nextInt();
			}
		return in;
	}
	/**
	 * Permite validar el largo de variables de tipo String, considerando largo mínimo
	 * y máximo, permite hacer consulta reiteradas 
	 * @param string Es el dato que se desea validar
	 * @param nombreVar Es el nombre de la variable, permite hacer consulta reiterativa
	 * según sea el atributo
	 * @param t_min Largo mínimo que se desea aootar el largo de la variable
	 * @param t_max Largo máximo que se desea aootar el largo de la variable
	 * @return Entrega un String con el largo dentro de los parametros deseados
	 */
	public String resTmaxmin (String string, String nombreVar,int t_min, int t_max) {
		Integer largo = string.length();
		while( largo < t_min || largo > t_max ) {
				System.out.println("El campo "+ nombreVar +" debe tener mínimo "+ t_min +" y máximo "+  
						t_max  + " ingreselo denuevo");
				string = entrada.nextLine();
				largo = string.length();
		}	
		return string;
	}
	/**
	 * Permite validar el ingreso del valor 1 o 2
	 * @param n Valor a ingresar
	 * @param nombreVar Permite hacer consulta reiterada según sea el nombre de la variable
	 * @return Retorna un Integer ( 1 o 2)
	 */
	public Integer resUnodos(Integer n, String nombreVar) {
		boolean malo = true;
		do{
			if (n == 1 || n == 2 ) {
				malo = false;
			}else{
				System.out.println("En el campo "+ nombreVar +" debe seleccional 1 o 2, ingreselo denuevo");
				n = entrada.nextInt();
			}
		}while (malo);
		return n;
	}
	/**
	 * Permite validar una fecha segpun el formato DD/MM/AAAA
	 * @param fecha Fecha ingresada que se desea validar
	 * @param nombre Nombre del campo para hacer consulta reiterada según sea la variable
	 * @return Retorna un String de  format DD/MM/AAAA 
	 */
	public String validacionFecha(String fecha, String nombre) {
		boolean malo = true;
		do{
			if (fecha.length() == 10 && fecha.contains("/")) {
				String[] fechaa = fecha.split("/"); // DESCONPONGO LA FECHA 
				String dia = fechaa[0];
				String mes = fechaa[1];
				String año = fechaa[2];
				if ( dia.length() == 2 && mes.length() == 2 && año.length() == 4 ) {
					Integer ndia = Integer.parseInt(dia);  // PASO DATOS A INTEGER
					Integer nmes = Integer.parseInt(mes); 
					Integer naño = Integer.parseInt(año);  
					if ( ndia > 31 ) {
						System.out.println("No existen dias de la semana mayor a 31");
						fecha = entrada.next();
					}else{
						if ( nmes < 1 || nmes > 12 ) {
							System.out.println("No existen el mes" + nmes + " ingrese un mes entre 1 y 12");
							fecha = entrada.next();
						}else {
							if ( naño < 1910 || naño > 2200 ) {
								System.out.println("Ingrese un año válido");
								fecha = entrada.next();
								}else {
									malo = false;
								}
						}
					}
				}
			}else {
				System.out.println("El campo "+ nombre + " no es válido, debe ingresar la fecha "
						+ "con el siguiente formato: DD/MM/AAAA \nIngreselo nuevamente: ");
				fecha = entrada.next();
			}
		}while (malo);
		return fecha;
	}
	/**
	 * Permite validar el ingreso de un dia de la semana "Lunes", "Martes", "Miercoles",
	 * "Jueves","Viernes","Sabado","Domingo. Reitera la consulta hasta obtener uno de esos valores
	 * @param dia 
	 * @param nombreVar
	 * @return Regresa un día de la semana "Lunes", "Martes", "Miercoles",
	 * "Jueves","Viernes","Sabado","Domingo"
	 */
	public String vDia (String dia, String nombreVar) {
		boolean malo = true;
		do {
			if ( dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || 
					dia.equals("Jueves") || dia.equals("Viernes") || dia.equals("Sabado") ||
					dia.equals("Domingo")) {
					malo = false;
				}else{
					System.out.println("Debe ingresar un dia válido: Lunes, Martes,"
							+ " Miercoles, Jueves, Viernes, Sabado, Domingo");
					dia = entrada.next();
				}
		}while (malo);
		return dia;
	}
	/**
	 * Permite validar el ingreso de una hora con formato HH:MM
	 * @param hora
	 * @return retorna una hora con formato HH:MM
	 */
	public String vHora(String hora) {
		boolean malo = true;
		do{
			if (hora.length() == 5 && hora.contains(":")) {
				String[] horaa = hora.split(":"); // DESCONPONGO LA FECHA 
				String shoras = horaa[0];
				String sminutos = horaa[1];
				if ( shoras.length() == 2 && sminutos.length() == 2 ) {
					Integer ihoras = Integer.parseInt(shoras);  // PASO DATOS A INTEGER
					Integer iminutos = Integer.parseInt(sminutos); 
					if (  ihoras < 0 || ihoras > 23 ) {
						System.out.println("Debe ingresar una hora válida entre 0 y 23");
						hora = entrada.next();
					}else{
						if ( iminutos < 0 || iminutos > 59 ) {
							System.out.println("Debe ingresar minutos de la hora validos entre 0 y 59");
							hora = entrada.next();
						}else {
									malo = false;
								}
						}
					}
				}else {
				System.out.println("La hora señalada no es válida, debe ingresarla con el "
						+ "siguiente formato: HH:MM \nIngreselo nuevamente: ");
				hora = entrada.next();
			}
		}while (malo);
		return hora;
	}
}
		
	

	

