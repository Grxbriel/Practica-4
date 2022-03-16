public class Niño extends Persona{
    //Atributos
    private Juguete juguete;
    private String colegio = new String();
    
    //Constructores
    public Niño(Juguete juguete, String colegio, String nombre, String DNI, Integer edad){
        super(nombre, DNI,edad);
        this.setJuguete(juguete);
        this.setColegio(colegio);
    }
    public Niño(){
        super();
        this.juguete = null;
        this.colegio = null;   
    }

    //Setters y Getters
    public void setJuguete(Juguete juguete){this.juguete = juguete;}
    public Juguete getJuguete(){return this.juguete;}
    public void setColegio(String colegio){this.colegio = colegio; }
    public String getColegio(){return this.colegio;}
	
 
    //Metodos
    @Override
	public String toString() {
		return "Niño [juguete=" + juguete + ", colegio=" + colegio + ", getNombre()=" + getNombre() + ", getDNI()="
				+ getDNI() + ", getEdad()=" + getEdad() + "]";
	}
    
}