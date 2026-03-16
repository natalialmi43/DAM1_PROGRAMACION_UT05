# UT5 - Ejercicios 3 - List - Tienda videojuegos

Se ha pedido llevar la gestión de una tienda de videojuegos.
Para ello, se gestionarán videojuegos, clientes y ventas (y deberá haber una colección de cada tipo).

El videojuego tendrá:

- título 
- plataforma 
- genero
- precio
- stock
- código identificativo. Como no existe un estándar para el código identificativo, se nos pide que utilicemos el tipo UUID, y el método UUID.randomUUID() para generar un identificador nuevo.


Los clientes tendrán:

- nombre 
- apellidos
- dirección
- email
- código de cliente. En este caso será un código numérico sencillo.


La venta tendrá:
- referencia del cliente que compra
- referencia de los artículos que se lleva
- fecha de la venta (con LocalDate)


Funcionalidades:

- Añadir videojuego al inventario.
- Mostrar todo el inventario.
- Consultar un título. Podremos buscar por el código identificativo o el nombre del título. 
- Consultar stock de un título.
- Buscar cliente. Tanto por código como por nombre, apellidos o email. 
- Registrar venta. No olvides actualizar el stock. 
- Mostrar el historial de ventas completo. 
- Mostrar el historial de ventas de una fecha. 
- Bola extra. Estadísticas.

  - Listar el acumulado de ventas por plataforma.
  - Listar el acumulado de ventas por género.
  - Mostrar el título más vendido.
  - Mostrar el mejor día de ventas. 