# README a completar

## Gestor de incidendias

La aplicacion Java consola , para consultar los avisos de soporte.Sirve como ejercicio para practicar la 
relacion  entre **README.md** y **Javadoc**

El README explica el proyecto de dorma glogal .Los comentarios Javadoc incluidos en el código domucumentan 
las clases, constructoresy metodos

## FUNCIONALIDADES 

- Lista todas la incidencias
- Lista unicamente las incidencias abiertas
- Busca incidencias por texto 
- Consulta una incidencia por su identificador
- Mostrar una ayuda con las operaciones disponibles
- Usar la aplicacion mediante un menu iteractivo o mediante argumentos de linea de comandos.

## REQUISITOS 

- JDK 21 

Comprobar  la instalacion:

```bash 
java --version 
javac --version 
javadoc --version
```

## ESTRUCTURA 


## Estructura

```text
proyecto-incidencias/
├── README.md
├── src/
│   └── es/
│       └── centro/
│           └── incidencias/
│               ├── App.java
│               ├── GestorIncidencias.java
│               ├── Incidencia.java
│               └── IncidenciaNoEncontradaException.java
└── docs/
```

 Clase | Responsabilidad 

 `Incidencia`  Datos de una incidencia: id, título, prioridad y estado. 
 `GestorIncidencias` Colección en memoria con listados y búsquedas. 
 `IncidenciaNoEncontradaException` Error cuando un identificador no existe. 
 `App`  Punto de entrada: menú interactivo y argumentos. 

## Compilación

Desde la raíz del proyecto:

```bash
javac -d out src/es/centro/incidencias/*.java
```

## Ejecución

Menú interactivo (sin argumentos):

```bash
java -cp out es.centro.incidencias.App
```

Con argumentos:

```bash
java -cp out es.centro.incidencias.App ayuda
java -cp out es.centro.incidencias.App listar
java -cp out es.centro.incidencias.App abiertas
java -cp out es.centro.incidencias.App buscar red
java -cp out es.centro.incidencias.App detalle INC-001
```

## Generar Javadoc

```bash
javadoc -d docs/javadoc -sourcepath src -subpackages es.centro.incidencias -author -version
```

Abre después:

```text
docs/javadoc/index.html
```

## Qué debes observar

Busca en la documentación generada ejemplos de:

- `@author`;
- `@version`;
- `@since`;
- `@param`;
- `@return`;
- `@throws`;
- `@deprecated`;
- `@see`;
- `{@code}`;
- `{@link}`.

Comprueba también cómo Javadoc representa el método `obtenerIncidencia`, marcado con `@Deprecated`.

## Idea principal

El README responde a preguntas sobre **el proyecto**.

Javadoc responde a preguntas sobre **cómo utilizar sus componentes Java**.