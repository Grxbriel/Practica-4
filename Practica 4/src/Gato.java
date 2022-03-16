public class Gato extends Mascota {
	//Atributos
	private String raza;
	
    //Constructores
	public Gato(String raza, String Nombre, Integer Edad) {
		super(Nombre, Edad);
		this.raza = raza;
	}
	
	public Gato() {
		super();
		this.raza = null;
	}

	//ToString
		@Override
	public String toString() {
		return "Gato [raza=" + raza + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}
	
	//Getters y Setters
	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}