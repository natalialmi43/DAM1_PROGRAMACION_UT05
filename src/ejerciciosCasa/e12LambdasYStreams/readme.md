# UT5 - Ejercicios - Lambdas y Streams - NO evaluable

## Ejercicio 1: 
El filtro de aprobados (Lambda + filter)
Partimos de una lista de notas: List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);
Utiliza un Stream para filtrar las notas que sean mayores o iguales a 5.
Imprime cada nota aprobada utilizando el método .forEach() con una referencia a método o una lambda.
Resultado esperado: 8, 5, 10, 7.

## Ejercicio 2: 
Transformación de nombres (Lambda + map)
Tenemos una lista de nombres de alumnos: {"ana", "luis", "guzmán", "marta"}.
Convierte todos los nombres a mayúsculas.
Usa .stream().map(...) y luego recoge el resultado en una nueva List<String> usando .toList() (o Collectors.toList()).
Muestra la nueva lista por pantalla.

## Ejercicio 3: 
Buscando la palabra más larga (Stream + max)
Dada una lista de palabras: {"Java", "Programación", "Stream", "Código", "DAM"}.
•     Encuentra la palabra que tiene más caracteres.
•     Pista: Usa el método .max() pasando un Comparator basado en la longitud de la cadena (String::length).
•     Imprime la palabra encontrada (ten en cuenta que max devuelve un Optional).

## Ejercicio 4: 
Estadística de números (Stream + mapToInt)
Crea una lista con los números: {10, 20, 30, 40, 50}.
Calcular la suma y el promedio de todos los números.
Convierte el stream a un IntStream usando .mapToInt(n -> n) y utiliza los métodos .sum() y .average().

## Ejercicio 5: 
El "Top 3" de ventas (Ordenación y Límite)
Imagina una lista de precios de productos: {19.99, 5.50, 45.0, 120.95, 89.0, 2.30}.
Queremos saber cuáles son los 3 productos más caros.
Ordena la lista de forma descendente (sorted con un comparador inverso).
Limita el resultado a 3 elementos (limit(3)).
Imprime el resultado.

## Resumen de sintaxis:
Origen: .stream() (Convierte la colección).
Operaciones intermedias (devuelven otro Stream):
filter(condición) -> Deja pasar solo lo que cumple la condición.
.map(función) -> Transforma cada elemento.
.sorted() -> Ordena los elementos.
.limit(n) -> Se queda con los primeros n.
Operación terminal (cierra el Stream):
.forEach(acción) -> Ejecuta algo para cada uno.
.collect(...) -> Lo guarda en una nueva lista/conjunto.
.count() -> Cuenta los elementos.