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
  1. Eliminaremos <<interface>> Sonido:
  - `public class Barco implements Sonido {
      }`
  
  2. Para actualizar la versión 2.0.0 usaremos los sigiuentes comandos:
  - `git add .`
  - `git commit -m "2.0.0"`
  - `git push`
