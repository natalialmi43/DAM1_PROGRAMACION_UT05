# UT5 - Ejercicios - Map - NO evaluable

## Ejercicio 1: El Diccionario de Traducción (Básico)
El objetivo es comprender la relación Clave-Valor y el uso de put y get.
- Tarea: Crea un HashMap<String, String> llamado diccionario.
- Acción: Añade 5 parejas de palabras Inglés-Español (ej: "Apple" - "Manzana").
- Consulta: Pide una palabra en inglés por teclado y muestra su traducción. Si no existe, muestra un mensaje de error.
- Consulta2: Busca si existe una palabra en Español.

## Ejercicio 2: Gestión de Inventario (Existencia de Claves)
- Practicar el método containsKey para evitar sobrescribir datos sin querer.
- Tarea: Crea un Map<Integer, String> donde la clave sea el código del producto y el valor su nombre.
- Lógica: Al añadir un producto, comprueba si el código ya existe.
- Salida: Si el código existe, avisa al usuario; si no, añádelo al mapa.

## Ejercicio 3: Listado de Notas (Recorrido de Claves)
- Aprender a recorrer un mapa utilizando el conjunto de sus claves (keySet).
- Tarea: Crea un HashMap<String, Double> con los nombres de 4 alumnos y sus notas.
- Acción: Recorre el mapa utilizando un bucle for-each sobre notas.keySet().
- Salida: Imprime por cada vuelta: "El alumno [clave] tiene una nota de [valor]".

## Ejercicio 4: Clasificación por Orden (TreeMap)
- Observar la diferencia de comportamiento entre HashMap y TreeMap.
- Tarea: Crea un TreeMap<String, String> para guardar extensiones de archivo y su descripción (ej: ".java" - "Archivo de código fuente Java").
- Acción: Inserta 4 extensiones en orden desordenado.
- Salida: Imprime el mapa completo y comprueba cómo Java las ha ordenado alfabéticamente por la extensión (la clave).

## Ejercicio 5: Contador de Frecuencia (Lógica avanzada)
- Este ejercicio integra lógica de control de flujo con mapas.
- Tarea: Crea un programa que reciba un array de Strings: {"Java", "Python", "Java", "C++", "Java", "Python"}.
- Acción: Utiliza un Map<String, Integer> para contar cuántas veces aparece cada lenguaje.
- Pista: Si el lenguaje ya está en el mapa, suma 1 a su valor actual; si no, inícialo en 1.


## Métodos principales...
put(K, V)
Añade una pareja o sobrescribe el valor si la clave ya existe.

get(K)
Devuelve el valor asociado a la clave o null si no existe.

containsKey(K)
Devuelve true si la clave está en el mapa.

remove(K)
Elimina la pareja asociada a esa clave.

size()
Devuelve el número de parejas total. 