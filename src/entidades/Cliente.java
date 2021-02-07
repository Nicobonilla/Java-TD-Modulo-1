package entidades;

public class Cliente extends Usuario{
	
	Integer rut;  // run < 99.999.999 
	String nombres; // obligatori, min 5 max 30
	String apellidos; // obligatori, min 5 max 30
	String telefono; // obligatorio
	String afp; // min 4 car, max 30
	Integer sisSalud; // 1 : Fonasa ; 2 : Isapre
	String direccion; // max 70 car
	String comuna; // max 40 car
	Integer edad; // obligatorio, n >= 0 && n < 150
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sisSalud=" + sisSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}
	
	public Cliente() {
		super();
	}

	public Cliente(Integer rut, String nombres, String apellidos, String telefono, String afp, Integer sisSalud,
			String direccion, String comuna, Integer edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sisSalud = sisSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	// OBTENER NOMBRE: Obtiene Nombre y Apellidos del cliente
	public String obtenerNombre() {
		return getNombre()+ " "+ getApellidos();
	}
	
	// ANALIZAR USUARIO : Despliega los datos de la clase padre, direccion y comuna del cliente.
	@Override
	public void analizarUsuario() { 	
	super.analizarUsuario();
		System.out.println("TIPO DE USUARIO: CLIENTE");
		System.out.println( "Dirección="+ getDireccion()+ ", Comuna="+ getComuna() + " ]");
	}
	
	// OBTENER SISTEMA DE SALUD: Despliega el tipo de Sistema de Salud del Cliente
	public String obtenerSistemaSalud( Integer sisSalud ) {
		String respuesta = "";
		boolean repetir ;
		do {
			if (sisSalud == 1) {
				respuesta = "Fonasa";
				repetir = false;
			} else if ( sisSalud == 2) {
				respuesta = "Isapre";
				repetir = false;
			} else {
				System.out.println(" Debe ingresar una opción válida");
				repetir = true;
			}
		} while ( repetir );
		return respuesta;
	}
	
	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Integer getSisSalud() {
		return sisSalud;
	}

	public void setSisSalud(Integer sisSalud) {
		this.sisSalud = sisSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	



}
