public class Pez extends Mascota {

    //Atributos
    private String raza ;

    //Constructores
    public Pez(String raza, String Nombre, Integer Edad){
        super(Nombre, Edad);
        this.setRaza(raza);
    }
    public Pez(){
        super();
        this.raza = null;
    }

    //toString
    @Override
	public String toString() {
		return "Pez [raza=" + raza + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

    //Getters y Setters
    public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
}
