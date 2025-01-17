# AluraChallenge-Literalura
Challenge de app Literalura

## Descripción General
Esta aplicación de consola permite a los usuarios interactuar con un sistema que gestiona información sobre libros, utilizando una API externa para obtener datos de libros, almacenando las búsquedas en una base de datos PostgreSQL, y ofreciendo funcionalidades para listar y filtrar información sobre libros y autores.

---

## Características Principales
1. **Buscar libros por título:**
   - Consulta una API externa (https://gutendex.com) para buscar libros por título.
   - Guarda el primer resultado de la búsqueda en la base de datos PostgreSQL.
   - Muestra en consola el título, autor, idioma y número de descargas del libro encontrado.
   - Si no se encuentra el libro, muestra un mensaje "No se encontró" y regresa al menú principal.

2. **Listar libros registrados:**
   - Recupera y muestra todos los libros registrados previamente en la base de datos.

3. **Listar autores registrados:**
   - Muestra los autores registrados en la base de datos junto con:
     - Nombre del autor
     - Fecha de nacimiento
     - Fecha de fallecimiento
     - Libro asociado

4. **Listar autores vivos en un año determinado:**
   - Solicita un año como entrada.
   - Muestra los autores que estaban vivos durante ese año según la información registrada en la base de datos.

5. **Listar libros por idioma:**
   - Permite seleccionar un idioma de una lista de opciones (por ejemplo, `es` para español, `en` para inglés).
   - Muestra los libros registrados en la base de datos que están en el idioma seleccionado.

---

## Requisitos del Sistema
### Herramientas Necesarias
- **Java Development Kit (JDK)**: Versión 11 o superior.
- **IntelliJ IDEA**: IDE para desarrollar y ejecutar el proyecto.
- **Maven**: Administrador de dependencias integrado en el proyecto.
- **PostgreSQL**: Base de datos para almacenar información sobre libros y autores.

### Dependencias
El proyecto utiliza las siguientes dependencias (declaradas en el archivo `pom.xml`):
- **Spring Boot**: Para configurar y ejecutar la aplicación.
- **Jackson**: Para convertir datos JSON en objetos Java.
- **PostgreSQL Driver**: Para conectarse a la base de datos.
- **Spring Data JPA**: Para interactuar con la base de datos utilizando repositorios.

---

## Configuración del Proyecto
1. **Configurar la Base de Datos PostgreSQL:**
   - Crear una base de datos llamada `gestion_libros` (o cualquier nombre que prefiera).
   - Actualizar las credenciales de conexión en el archivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost/tu_bd
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.jpa.hibernate.ddl-auto=update
     ```

2. **Clonar el Proyecto:**
   - Clonar este repositorio en su máquina local y abrirlo en IntelliJ IDEA.

3. **Instalar Dependencias:**
   - Ejecutar el comando `mvn install` para descargar todas las dependencias necesarias.

4. **Ejecutar la Aplicación:**
   - Ejecutar la clase principal del proyecto (`Main.java`) para iniciar el menú interactivo.

---

## Instrucciones de Uso
1. Al iniciar la aplicación, aparecerá el siguiente menú en la consola:
   ```plaintext
   Elija la opción a través de su número:
   1- Buscar libro por titulo.
   2- Buscar libros registrados en la base de datos.
   3- Listar autores registrados
   4- Listar autores vivos en un determinado año
   5- Listar libros por idioma
   0- Salir
   ```
2. Seleccione una opción escribiendo el número correspondiente y presionando Enter.
3. Siga las instrucciones que aparezcan en pantalla para cada opción.
4. Para salir, seleccione la opción `0`.

---

## Estructura del Proyecto
### Paquetes Principales
1. **`modelo`**:
   - Define las clases de entidades (por ejemplo, `Libro` y `Autor`) que representan las tablas de la base de datos y los record de cada uno de ellos.
2. **`repositorio`**:
   - Contiene interfaces JPA que permiten interactuar con la base de datos.
3. **`servicio`**:
   - Contiene la clase `ConsumoAPI` para realizar las solicitudes HTTP a la API externa, la clase `ConvierteDatos` y la interfaz `IConvierteDatos` para manejar la deserialización de datos JSON. 
4. **`principal`**:
   - Contiene la lógica para manejar el flujo del menú interactivo en la consola.

### Tablas Principales
1. **`libro`**:
   - Almacena información sobre los libros, incluyendo título, idioma, y número de descargas.
2. **`autor`**:
   - Almacena información sobre los autores, incluyendo nombre, fecha de nacimiento y fallecimiento.

---

## Consideraciones
- La aplicación maneja excepciones como la falta de resultados en la API o errores de conexión a la base de datos, mostrando mensajes amigables al usuario.
- Si desea agregar nuevas funcionalidades o modificar el proyecto, consulte la documentación dentro de las clases.

---

## Tecnologías Utilizadas
- **Lenguaje:** Java 11
- **Frameworks:** Spring Boot
- **Base de Datos:** PostgreSQL
- **Dependencias Adicionales:** Jackson, Spring Data JPA

---

## Autor
- Nombre: Carlos EML
- Contacto: carlosmonteroleon@gmail.com

