public class Adulto extends Persona{
    //Atributos
    private String NSS = new String();
    private String direccion = new String();

    //Constructores 
    public Adulto(String NSS, String direccion, String nombre, String DNI, Integer edad) {
        super(nombre, DNI, edad);
        this.setNSS(NSS);
        this.setDireccion(direccion);
    }
    public Adulto(){
        super();    
        this.NSS = null;
        this.direccion = null;
    }

    //Setters y Getters
    public void setNSS(String NSS){this.NSS = NSS; }
    public String getNSS(){return this.NSS;}
    public void setDireccion(String direccion){this.direccion = direccion; }
    //Metodos
	@Override
	public String toString() {
		return "Adulto [NSS=" + NSS + ", direccion=" + direccion + ", getNombre()=" + getNombre() + ", getDNI()="
				+ getDNI() + ", getEdad()=" + getEdad() + "]";
	}
    
}

