# UT5 - Ejercicios 4 - Set - NO evaluable

## Ejercicio 1: El Control de Acceso Único (HashSet)

El objetivo es entender que un Set no permite duplicados.

Tarea: Crea un HashSet<String> llamado invitados.

Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".

Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.

## Ejercicio 2: ¿Estás en la lista? (Uso de contains)

Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.

Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.

Acción: Pide al usuario por teclado un número usando Scanner.

Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.

## Ejercicio 3: Ordenación de Premios (TreeSet)

Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).

Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.

Acción: Añade los números: 45, 12, 89, 3, 22.

Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.

## Ejercicio 4: Limpieza de una Lista (Conversión)

Aprender a "limpiar" duplicados de una lista de forma eficiente.

Tarea: Crea un ArrayList<String> con los colores: "Rojo", "Azul", "Rojo", "Verde", "Azul".

Acción: Pasa todos los elementos del ArrayList a un HashSet (puedes usar el constructor del Set o un bucle).

Salida: Muestra la nueva colección sin colores repetidos.

## Ejercicio 5: Detector de Errores (Validación de add)

El método add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.

Tarea: Crea un Set<String> para matrículas de coches.

Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el método add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema"