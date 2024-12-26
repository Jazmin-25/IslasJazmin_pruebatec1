# Mi proyecto
# IslasJazmin_pruebatec1
Desarrollo de una Aplicación de Gestión de Empleados
El objetivo de la prueba es evaluar conocimientos en Java, incluyendo la sintaxis, estructuras repetitivas, estructuras selectivas, manejo de colecciones y operaciones CRUD (Crear, Leer, Actualizar y Borrar) utilizando JPA (Java Persistence API) para interactuar con una base de datos.

# Estructura del Proyecto

Dentro del documento IslasJazmin_pruebatec1, la organización se divide en diferentes paquetes. A continuación, se describen las clases principales:

1.-Clase principal (IslasJazmin_pruebatec1):
Contiene el menú ASCII que brinda al usuario una experiencia visual atractiva al iniciar la aplicación. Incluye un ciclo while que permite la repetición de las opciones del menú mediante un switch anidado, con cuatro opciones principales.

2.-Clase Empleado:
Define los atributos principales del empleado: nombre, apellido, cargo, salario y fecha de inicio. Además, incluye el atributo id, que actúa como clave primaria (Primary Key) en la base de datos.

3.-Paquete persistencia:
a. Clase EmpleadoJPAController:
Contiene los métodos JPA responsables de interactuar directamente con la base de datos.
b. Clase ControladoraPersistencia:
Implementa los métodos que interactúan con EmpleadoJPAController y contiene la lógica de negocio de la aplicación.
