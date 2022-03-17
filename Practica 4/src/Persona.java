
public class Persona {
	
	 //Atributos
    private String nombre = new String();
    private String DNI = new String();
    private Integer edad;

    //Constructores
    public Persona(String nombre, String DNI, Integer edad){
        this.setNombre(nombre);
        this.setDNI(DNI);
        this.setEdad(edad);    
    }
    public Persona(){
        this(null,null,null);
    }

    //Setters y Getters
    public void setNombre(String nombre){this.nombre = nombre; }
    public String getNombre(){return this.nombre;}
    public void setDNI(String DNI){this.DNI = DNI; }
    public String getDNI(){return this.DNI; }
    public void setEdad(Integer edad){this.edad = edad; }
    public Integer getEdad(){return this.edad;}

    //Metodos
    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
	}
}
