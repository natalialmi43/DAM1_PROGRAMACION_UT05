Realiza un programa para la gestión de un Videoclub. Se debe almacenar la información de los clientes, películas y los préstamos que hemos llevado a cabo.

- Clase Cliente. Contiene la información de cada cliente. Debe contener:
  numeroCarnet: int
  nombre: String
  Constructores.
  Métodos get y set necesarios.
- Clase Película. Contiene la información de cada película. Debe contener:
  código: int
  titulo: String
  Constructores.
  Métodos get y set necesarios.
- Clase Préstamo. Se crea uno de estos objetos cada vez que un cliente alquila una película. Contiene la película, el cliente y la fecha en la que se lleva el préstamo. La fecha de devolución es por defecto de 2 días, salvo que se indique lo contrario. Debe contener:
  Constructores.
  Métodos get y set necesarios.
- Clase Videoclub. Contiene tres listas con todos los clientes, películas y préstamos. Debemos programar todos los métodos siguientes, además de un constructor vacío que inicialice las listas:
  añadirCliente(Cliente): void
  añadirPelicula(Película): void
  añadirPrestamo(Prestamo): void
  buscarPelícula(codigo): Pelicula
  buscarCliente(numeroCarnet): Cliente
  getPrestamos(): ArrayList
  getPrestamos(numeroCarnet): ArrayList
  devolucion(codigoPelicula, numeroCarnet): boolean
  prestamosMorosos(): ArrayList
