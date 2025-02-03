# IslasJazmin_pruebatec1
---
**Aplicación de Gestión de Empleados 📋**

---
## 🌟 **Introducción**

Esta aplicación de gestión de empleados para una empresa permite a los usuarios llevar a cabo operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre la información de empleados. Además, ofrece una funcionalidad de búsqueda por cargo.

---
## 🎯 **Características**

1.	Agregar un nuevo empleado: Registrar información del empleado, como nombre, apellido, cargo, salario y fecha de inicio.
2.	Listar empleados: Consultar todos los empleados registrados.
3.	Actualizar información de un empleado: Modificar los datos de un empleado existente.
4.	Eliminar un empleado: Remover un empleado de la base de datos.
5.	Buscar empleados por cargo: Filtrar empleados según su cargo.

---
## 🛠️ **Funcionalidades**

•	Menú ASCII interactivo: Proporciona un menú atractivo para la interacción del usuario.

•	Agregar un nuevo empleado: Permite ingresar información sobre un nuevo empleado, incluyendo nombre, apellido, cargo, salario y fecha de inicio.

•	Listar empleados: Visualiza la lista de todos los empleados en la base de datos.

•	Buscar empleados por cargo: Busca empleados por su cargo y muestra una lista de los empleados que tienen ese cargo.

•	Actualizar información de un empleado: Modifica la información de un empleado existente.

•	Eliminar un empleado: Elimina un empleado de la base de datos.

---
## ⚙️ **Requisitos Técnicos**
•	Lenguaje: Java (versión 17)
•	Persistencia: JPA (Java Persistence API)
•	Base de Datos: MySQL (nombre de la base de datos: empleados)
•	Gestor de Dependencias: Maven
•	IDE: NetBeans

---
## 💻 **Tecnologías Utilizadas**
•	Lenguaje: Java (versión 17)
•	Persistencia: JPA (Java Persistence API)
•	Base de Datos: MySQL (empleados)
•	Gestor de Dependencias: Maven

---
## 🔄 **Arquitectura del Sistema**

1. Lógica:
Contiene las clases de la lógica de negocio.
•	Clase Empleado: Esta clase representa la entidad principal del sistema con los atributos del empleado. Utiliza anotaciones JPA para mapearse con la base de datos y tiene métodos getters, setters y toString.
•	Clase ControladoraPersistencia: Intermediaria entre la lógica y la base de datos, realizando funciones como crear, eliminar, actualizar y obtener listas de empleados. Gestiona EntityManager y EntityManagerFactory para operaciones de persistencia.

2. Persistencia:
Incluye las clases para la comunicación con la base de datos.

2.1	Clase EmpleadoJpaController: Implementa las operaciones CRUD sobre la base de datos mediante JPA. Sus métodos destacados son:
-	create: Persistir nuevos empleados.
-	edit: Actualizar datos de empleados existentes.
-	destroy: Eliminar empleados por su ID.
-	findEmpleado: Recuperar empleados según su ID.
  
2.2	Clase Exception: Manejo de excepciones específicas.
 	
3. Base de Datos:
Almacena y organiza los datos de los empleados en la base de datos empleados.

---
## 🚀 **Cómo Ejecutar el Sistema**
1.	Abrir el proyecto:
•	Carga el archivo del proyecto IslasJazmin_pruebatec1 en el IDE NetBeans.
2.	Ejecutar la aplicación:
•	Ejecuta la aplicación directamente desde NetBeans presionando F6 o seleccionando la opción "Run Project".
3.	Configurar la base de datos:
•	Ejecuta el archivo empleados.sql en tu servidor de base de datos para crear las tablas necesarias.
4.	Acceder a phpMyAdmin:
•	Abre phpMyAdmin e inicia sesión con las siguientes credenciales:
   - Usuario: `root`
   - Contraseña: `  ` (vacio, no lleva ninguna contraseña)
6.	Verificar la configuración:
•	Asegúrate de que la base de datos empleados esté configurada correctamente y vinculada a la aplicación mediante la configuración de persistencia.

---
## 📦 **Material Entregado**
1. **Documentación**: Guía completa del sistema.
2. **Código Fuente**: Estructurado y organizado.
3. **Base de Datos**: 
   - SQL empleados 
---
