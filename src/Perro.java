public class Perro extends Mascota {
	//Atributos
	private String raza;
	//Constructores

	public Perro(String raza, String Nombre, Integer Edad) {
		super(Nombre, Edad);
		this.raza = raza;
	}
	
	public Perro() {
		super();
		this.raza = null;
	}

	//ToString
		@Override
	public String toString() {
		return "Perro [raza=" + raza + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

	//Getters y Setters
	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
