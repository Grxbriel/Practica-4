public class Juguete {
        //Atributos
        private String nombre = new String();
        private Integer precio;
        private Integer edadRecomendada;
        

        //Constructores
        public Juguete(String nombre, Integer precio, Integer edadRecomendada) {
        	this.setNombre(nombre);
        	this.setPrecio(precio);
        	this.setedadRecomendada(edadRecomendada);
        }
        public Juguete(){
            this(null, null, null);
        }

        //Setters y Getters
        public void setNombre(String nombre){this.nombre = nombre; }
        public String getNombre(){return this.nombre;}
        public void setPrecio(Integer precio){this.precio = precio; }
        public Integer getPrecio(){return this.precio; }
        public void setedadRecomendada(Integer edadRecomendada){this.edadRecomendada = edadRecomendada; }
        public Integer getedadRecomendada(){return this.edadRecomendada;}
        //Metodos
		@Override
				public String toString() {
					return "Juguete [nombre=" + nombre + ", precio=" + precio + ", edadRecomendada=" + edadRecomendada + "]";
				}
}
