package principal;

import java.util.Scanner;

public class ServicioValidacion {
	Scanner entrada = new Scanner(System.in);
	// SV = ( obligatorio , (t_max, t_min)
	
	
	// MAXIMO RUT
	public Integer validacionNumero(Integer r, String nombreVar , Integer min, Integer max) {
		while ( r >= 99999999) {		
			System.out.println("El campo "+ nombreVar +" no puede ser mayor a 99.999.999, ingreselo sin puntos ni guion!");
			r = entrada.nextInt();
			}
		return r;
		}
	// R OBLIGATORIO
	public String restriccionObligatorio(String string, String nombreVar) {
			Integer largo = string.length();
			while( largo.equals(0)) {
					System.out.println("El campo "+ nombreVar +"es obligatorio, favor ingreselo!");
					string = entrada.nextLine();
					largo = string.length();
			}
		return string;
	}
	// R OBLIGATORIO NUMERO
	public Integer numObligatorio(Integer in, String nombreVar) {
			while( in == null) {
					System.out.println("El campo "+ nombreVar +"es obligatorio, favor ingreselo!");
					in = entrada.nextInt();
			}
		return in;
	}
	// R NUMERO DE CARACTERES MAXIMO Y MINIMO
	public String resTmaxmin (String string, String nombreVar,int t_min, int t_max) {
		Integer largo = string.length();
		while( largo <= t_min || largo >= t_max ) {
				System.out.println("El campo "+ nombreVar +" debe tener mínimo "+ t_min +" y máximo "+  t_max  + " ingreselo denuevo");
				string = entrada.nextLine();
				largo = string.length();
		}	
		return string;
	}
	// RESTRICCION 1 O 2
	public Integer resUnodos(Integer n, String nombreVar) {
		while ( n == 1 || n == 2) {
			System.out.println("En el campo "+ nombreVar +" debe seleccional 1 o 2, ingreselo denuevo");
				n = entrada.nextInt();
		}	
		return n;
	}
	// VALIDACION FECHA
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
				System.out.println("El campo "+ nombre + " no es válido, debe ingresar la fecha con el siguiente formato: DD/MM/AAAA \nIngreselo nuevamente: ");
				fecha = entrada.next();
			}
		}while (malo);
		return fecha;
	}
	// VALIDACION DIA
	public String vDia (String dia, String nombreVar) {
		String[] dias = {"Lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado","Domingo"};
		boolean malo = true;
		do {
			for ( String d : dias) {
				if ( d == dia) {
					malo = false;
				}
			}
			if(malo == true ) {
					System.out.println("Debe ingresar un dia válido: Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo");
					dia = entrada.next();
				}
		}while (malo);
		return dia;
	}
	// VALIDACION HORA
	public String vHora(String hora, String nombre) {
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
				System.out.println("El campo "+ nombre + " no es válido, debe ingresar la fecha con el siguiente formato: DD/MM/AAAA \nIngreselo nuevamente: ");
				hora = entrada.next();
			}
		}while (malo);
		return hora;
	}
}
		
	

	

