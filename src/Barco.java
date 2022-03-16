import java.util.Date;

public class Barco implements Sonido{
	
	//Atributos
    private Motor motor;
	private String Nombre;
	private Date fechaConstrucion;
	private Integer numCamarotes;
	
	//Constructores
	public Barco(Motor motor, String Nombre, Date fechaConstrucion, int numCamarotes) {
        this.motor = motor;
		this.Nombre = Nombre;
		this.fechaConstrucion = fechaConstrucion;
		this.numCamarotes = numCamarotes;
	}
	public Barco() {
        this.motor = null;
		this.Nombre = null;
		this.fechaConstrucion = null;
		this.numCamarotes = null;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Barco [Motor=" + motor + ",Nombre=" + Nombre + ", fechaConstrucion=" + fechaConstrucion + ", numCamarotes=" + numCamarotes + "]";
	}
	
	//Getters y Setters
    public Motor getmotor() {
		return motor;
	}
	public void setmotor(Motor motor) {
		this.motor = motor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Date getFechaConstrucion() {
		return fechaConstrucion;
	}
	public void setFechaConstrucion(Date fechaConstrucion) {
		this.fechaConstrucion = fechaConstrucion;
	}
	public int getNumCamarotes() {
		return numCamarotes;
	}
	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}
	
}