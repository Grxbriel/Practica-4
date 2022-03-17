# Practica 4
* Carlos Iglesias Ferriol
* Gabriel Ortiz Severino

## Introducción

### ¿Que es Git?
Git es un software de control de versiones diseñado por Linus Torvalds, pensando en la eficiencia, la confiabilidad y compatibilidad del mantenimiento de versiones de aplicaciones cuando estas tienen un gran número de archivos de código fuente.

### ¿Que es GitHub?
GitHub es una forja para alojar proyectos utilizando el sistema de control de versiones Git. Se utiliza principalmente para la creación de código fuente de programas de ordenador.

Algunos de los comandos básicos de Git son:
```
git status
git add
git commit
```

### Refactorización
Es una técnica de la ingeniería de software para reestructurar un código fuente, alterando su estructura interna sin cambiar su comportamiento externo.

### Versionado Semantico
El versionamiento semántico es un convenio o estándar a la hora de definir la versión de tu código, dependiendo de la naturaleza del cambio que estás introduciendo. De tal forma, se identifican 3 tipos de cambios:
* Major
* Minor
* Patch

### Markdown
Es un lenguaje de marcado ligero creado por John Gruber que trata de conseguir la máxima legibilidad y facilidad de publicación tanto en su forma de entrada como de salida, inspirándose en muchas convenciones existentes para marcar mensajes de correo electrónico usando texto plano.

En este link puedes econtrar mucha utilidad si te estas iniciando en Markdown, ya que explica ssu sintaxis básicas y algunos consejos: [Guia MarkDown](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

# Desarrollo Practica 4

1. Para subir nuestro proyecto ya empezado a GitHub lo que haremos será usar los siguientes comandos (Estos los usaremos estando en la carpte de nuestro proyecto para veitar tener que poner rutas) :
  - `~/Documents/Practica 4 $ git init`
  - `git add .`
  - `git commit -m "1.0.0"`
  - `git push`

2. Una vez tenemos el repositorio creado en GitHub con nuestro proyecto, los compañeros pueden descargarse el proyecto a local con el siguiente comando:
  - `Git clone https://github.com/Grxbriel/Practica-4.git`

3. Lo siguiente que haremos será crear la versión 2.0.0 del proyecto:

  - Eliminaremos interface Sonido y todo lo relacionado:
      ```
      public class Barco implements Sonido {

      }

      public abstract class Mascota implements Sonido {

      }

      public Interface Sonido{

      }
      ```
  
  - Para actualizar la versión 2.0.0 usaremos los sigiuentes comandos:
    - `git add .`
    - `git commit -m "2.0.0"`
    - `git push`

4. Ahora pasaremos a la versión 2.1.0:
 - En esta nueva rama lo que haremos será crear una nueva clase para el proyecto llamada pez:
	  ```
	  public class Pez extends Mascota {

	    //Atributos
	    private String raza ;

	    //Constructores
	    public Pez(String raza){
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
  	```
- Crearemos una nueva rama:
	- `git branch desarrollo origin/master `
	- `git switch desarrollo`
  	- `git push -u origin desarrollo`
- Finalmente subimos la version 2.1.0 a Github con los camndos:
	- `git add .`
	- `git commit -m "2.1.0"`
	- `git push`

6. Cambios para la nueva versión 2.2.0:
- En esta versión quitamos el abstract de la clase mascota:
	```
	public abstract class Mascota {

	}
	```

7. Actualizamos la rama principal con la rama creada anteriormente usando estos comandos:
	- `git add .`
	- `git commit -m "2.2.0"`
	- `git push`
8. Cambiamos a una nueva versión 3.1.0
9. Finalmente actualizamos la rama principal y ya tendriamos nuestro proyecto actualizado en su ultima versión habiendo pasado por varias actualizaciones y creando ramas.
