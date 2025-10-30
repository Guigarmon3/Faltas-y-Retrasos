# Gestión de Faltas y Retrasos - Proyecto Java

Ejercicio en Java que simula la gestión de faltas y retrasos para alumnos, similar al menú de Ítaca.

¿Qué hace este programa?
- Permite añadir, eliminar, justificar faltas y retrasos de alumnos.
- Muestra las incidencias en una tabla con los campos: Día, Asignatura, Nombre y Tipo.
- Incluye un menú interactivo para seleccionar acciones en consola.

Estructura del código:
- La información se guarda en una matriz de Strings, cada línea es una incidencia.
- Cabecera de la tabla:
| Dia | Asignatura | Nombre | Tipo de falta |
- El menú principal permite:
  - Añadir falta/retraso/justificar
  - Buscar incidencias por campo
  - Borrar una falta/retraso seleccionando día y alumno

Ejemplo de uso:
------------------------
Que quieres hacer ahora?
------------------------
1. Falta/Retraso/Justificar
2. Buscar
3. Borrar una falta

Cómo funciona la lógica de borrado:
- Primero se pide el día.
- Se muestran los posibles candidatos que coincidan con ese día.
- El usuario introduce asignatura y nombre para identificar la incidencia a borrar.
- Si se encuentra, todos los datos de esa línea se eliminan.

El código se puede ver en Main.java. Las funciones principales son:
- AddFalta: añade la incidencia.
- borrar: elimina la incidencia seleccionada.
- buscar: permite buscar por cualquier campo.
- show: muestra toda la tabla.

Autor: Guillermo García (Guigarmon3), estudiante de IES La Vereda, Valencia.
