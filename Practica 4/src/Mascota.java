
public class Mascota {
	
	//Atributos
	private String Nombre;
	private Integer Edad;
	
	//Constructores
	public Mascota(String Nombre, Integer Edad) {
		this.Nombre = Nombre;
		this.Edad = Edad;
	}
	public Mascota() {
        this(null,null);
	}
	
	//ToString
	@Override
	public String toString() {
		return "Mascota [Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}
	
	//Getters y Setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	
}
