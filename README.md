# 🗓️ Gestión de Faltas y Retrasos

Una sencilla aplicación de consola desarrollada en Java para el seguimiento de faltas y retrasos en alumnos. Este sistema simula un registro similar al menú de Ítaca utilizado en centros educativos, permitiendo añadir, buscar y eliminar incidencias de una forma práctica.

Este proyecto está escrito en Java y es ideal para practicar lógica y el manejo de arrays bidimensionales.

## 🚀 Funcionalidades

Al ejecutar el método `main`, el programa ofrece un menú interactivo que permite:

* **Añadir faltas o retrasos:** Ingresa el día, asignatura, nombre del alumno y el tipo de falta (Falta, Retraso, Justificada).
* **Buscar incidencias:** Permite buscar por cualquiera de los campos de la tabla (día, asignatura, nombre o tipo).
* **Eliminar faltas o retrasos:** Selecciona el día y el alumnado para borrar todas las entradas asociadas.
* **Visualización tabular en consola:** Muestra todas las incidencias guardadas en formato tabla.

## 🛠️ Tecnología

* **Lenguaje:** Java
* **Entorno:** Aplicación de consola
* **Estructura de datos:** Array bidimensional (`String[][]`) para almacenar incidencias

## ⚙️ Uso

Para utilizar este programa, necesitas tener el **Java Development Kit (JDK)** instalado.

1. **Compilar el archivo:**
    ```
    javac Main.java
    ```

2. **Ejecutar la aplicación:**
    ```
    java Main
    ```

### Interacción

Al iniciar, el menú principal permite:

1. Añadir falta/retraso/justificar
2. Buscar incidencia
3. Borrar una falta

Ejemplo de menú que se muestra en consola:
Que quieres hacer ahora?
Falta/Retraso/Justificar

Buscar

Borrar una falta

text

La función de borrado primero solicita el día y muestra posibles candidatos, luego pide asignatura y nombre para identificar la entrada a eliminar.

---

Autor: Guillermo García (Guigarmon3), estudiante de IES La Vereda, Valencia.
