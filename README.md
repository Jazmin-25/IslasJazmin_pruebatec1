# IslasJazmin_pruebatec1
---
# Sistema de Gestión de Empleados 📋

---
## 🌟 **Introducción**
Esta aplicación de gestión de empleados permite a los usuarios llevar a cabo operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre la información de empleados. Además, ofrece una funcionalidad de búsqueda por cargo.

---
## 🎯 **Características**

- Agregar un nuevo empleado: Registrar información del empleado, como nombre, apellido, cargo, salario y fecha de inicio.

- Listar empleados: Consultar todos los empleados registrados.

- Actualizar información de un empleado: Modificar los datos de un empleado existente.

- Eliminar un empleado: Remover un empleado de la base de datos.

- Buscar empleados por cargo: Filtrar empleados según su cargo.

---
## 🛠️ **Funcionalidades**

- Menú ASCII interactivo: Proporciona un menú atractivo para la interacción del usuario.

- Agregar un nuevo empleado: Permite ingresar información sobre un nuevo empleado, incluyendo nombre, apellido, cargo, salario y fecha de inicio.

- Listar empleados: Visualiza la lista de todos los empleados en la base de datos.

- Buscar empleados por cargo: Busca empleados por su cargo y muestra una lista de los empleados que tienen ese cargo.

- Actualizar información de un empleado: Modifica la información de un empleado existente.

- Eliminar un empleado: Elimina un empleado de la base de datos.

---
## 🔄 **Arquitectura del Sistema**

1.- Lógica:

- Contiene las clases de la lógica de negocio.

- Clase Empleado: Esta clase representa la entidad principal del sistema con los atributos del empleado. Utiliza anotaciones JPA para mapearse con la base de datos y tiene métodos getters, setters y toString.

- Clase ControladoraPersistencia: Intermediaria entre la lógica y la base de datos, realizando funciones como crear, eliminar, actualizar y obtener listas de empleados. Gestiona EntityManager y EntityManagerFactory para operaciones de persistencia.

2.- Persistencia:

Clase EmpleadoJpaController: Implementa las operaciones CRUD sobre la base de datos mediante JPA y se comunica con la base de datos. Sus métodos destacados son:

      create: Persistir nuevos empleados.

      edit: Actualizar datos de empleados existentes.

      destroy: Eliminar empleados por su ID.

      findEmpleado: Recuperar empleados según su ID.

3.- Clase Exception: Manejo de excepciones específicas.

4.- Base de Datos:

- Almacena y organiza los datos de los empleados en la base de datos empleados. La estructura principal contiene la tabla empleado con las siguientes columnas: ID, APELLIDO, CARGO, FECHAINICIO, NOMBRE, SALARIO.

---
## ⚙️ **Requisitos Técnicos**
- Lenguaje: Java (versión 17)

- Persistencia: JPA (Java Persistence API)

- Base de Datos: MySQL (nombre de la base de datos: empleados)

- Gestor de Dependencias: Maven

- IDE: NetBeans

---
## 💻 **Tecnologías Utilizadas**
- Lenguaje: Java (versión 17)

- Persistencia: JPA (Java Persistence API)

- Base de Datos: MySQL (empleados)

- Gestor de Dependencias: Maven

---
## 🚀 **Cómo Ejecutar el Sistema**
1.- Abrir el proyecto: Carga el archivo del proyecto IslasJazmin_pruebatec1 en el IDE NetBeans.

2.- Ejecutar la aplicación: Ejecuta la aplicación directamente desde NetBeans presionando F6 o seleccionando la opción "Run Project".

3.- Configurar la base de datos: Ejecuta el archivo empleados.sql en tu servidor de base de datos, en la cual estaran presentes los siguientes registros iniciales en la tabla empleado:
      INSERT INTO `empleado` (`ID`, `APELLIDO`, `CARGO`, `FECHAINICIO`, `NOMBRE`, `SALARIO`) VALUES
      (1, 'Garcia Castro', 'Contador', '2022-02-01', 'Laura', 12.5),
      (2, 'Bautista Martinez', 'Contador', '2022-02-01', 'Alfredo', 12.5),
      (3, 'Islas Garcia', 'Analista Programador', '2025-02-03', 'Ariadna', 17.36),
      (4, 'Hernandez Chavez', 'Jefe de Área', '2017-08-11', 'Marisol', 18.36),
      (5, 'Cruz Sierra', 'Instructor', '2022-07-15', 'Angel', 15.555),
      (6, 'Pineda Gallego', 'Instructor', '2022-07-15', 'Zamir', 15.555),
      (7, 'Hernandez Garcia', 'Analista Programador', '2022-02-01', 'Paola', 12.5),
      (8, 'Gutierrez Hernandez', 'Analista Programador', '2022-02-01', 'Marisol', 12.5),
      (9, 'Navarro Domingo', 'Analista Programador', '2022-02-01', 'Sara', 12.5),
      (10, 'Hernandez Castro', 'Contador', '2022-02-01', 'Mariana', 12.5),
      (11, 'Hernandez Nava', 'Instructor', '2022-07-15', 'Luisina', 15.555),
      (12, 'Hernandez Nava', 'Auxiliar de Nomina', '2022-07-15', 'Monica', 15.555),
      (13, 'Valencia Hernandez', 'Reclutadora', '2022-02-01', 'Claudia', 12.5),
      (14, 'Gomez Hernandez', 'Coordinadora RH', '2022-02-01', 'Isabel', 12.5),
      (15, 'Sanchez Chavez', 'Líder de Proyecto', '2017-08-11', 'Marisol', 18.36),
      (16, 'Paramo Chavez', 'Gerente', '2011-08-11', 'Pedro', 18.36),
      (17, 'Rulfo', 'Reclutador', '2011-08-11', 'Juan', 10.36);

COMMIT;

4.- Acceder a phpMyAdmin: Abre phpMyAdmin e inicia sesión con las siguientes credenciales:
 - Usuario: `root`
 - Contraseña: `  ` (vacio, no lleva ninguna contraseña)

5.- Verificar la configuración:Asegúrate de que la base de datos empleados esté configurada correctamente y vinculada a la aplicación mediante la configuración de persistencia.

---
## 📦 **Material Entregado**
- Documentación: Guía completa del sistema.

- Código Fuente: Estructurado y organizado.

- Base de Datos: Script SQL (empleados.sql).
