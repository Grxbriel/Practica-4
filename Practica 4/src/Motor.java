
public class Motor {
    //Atributos
    private String fabricante = new String();
    private String potencia = new String();
    private Integer codigo;

    //Constructores
    public Motor( String fabricante, String potencia, Integer codigo){
        this.setFabricante(fabricante);
        this.setPotencia(potencia);
        this.setCodigo(codigo);
    }
    public Motor(){
        this(null, null, null);
    }

    //Setters y Getters
    public void setFabricante(String fabricante){this.fabricante = fabricante; }
    public String getFabricante(){return this.fabricante;}
    public void setPotencia(String potencia){this.potencia = potencia; }
    public String getPotencia(){return this.potencia; }
    public void setCodigo(Integer codigo){this.codigo = codigo; }
    public Integer getCodigo(){return this.codigo;}

    //Metodos
    	@Override
	public String toString() {
		return "Motor [fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + "]";
	}
}
