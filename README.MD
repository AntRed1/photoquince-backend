📸 PhotoQuinceBackend - Sistema de Gestión de Fotografía para Quinceañeras

Este es el backend del sistema que proporciona una API RESTful para la gestión de la Landing Page y el Backoffice de un negocio de fotografía para quinceañeras. Está desarrollado en Spring Boot 3.4.3 con autenticación JWT y base de datos MySQL/PostgreSQL.

🚀 Tecnologías Utilizadas

Java 21

Spring Boot 3.4.3 (Spring Web, Spring Security, Spring Data JPA)

JWT (Json Web Token) para autenticación

MySQL o PostgreSQL como base de datos

Hibernate + JPA para persistencia

Flyway o Liquibase para migraciones de base de datos

Spring Boot Actuator para monitoreo

Cloudinary o Firebase Storage para gestión de imágenes

Swagger para documentación de API

Maven 3.9.9 para gestión de dependencias

📂 Estructura del Proyecto

backend/
│── src/
│   ├── main/java/com/photoquince/backend/
│   │   ├── config/       # Configuraciones de seguridad, CORS, JWT
│   │   ├── controller/   # Controladores REST
│   │   ├── dto/          # Clases DTO para transferir datos
│   │   ├── entity/       # Entidades JPA
│   │   ├── repository/   # Interfaces para acceso a datos
│   │   ├── service/      # Lógica de negocio
│   │   ├── exception/    # Manejo de errores personalizados
│   │   ├── utils/        # Clases utilitarias
│── src/main/resources/
│   ├── application.properties  # Configuración de base de datos y JWT
│── pom.xml   # Dependencias de Maven
│── README.md # Documentación

🛠 Instalación y Configuración

Clonar el repositorio

git clone <https://github.com/tu-usuario/tu-repositorio.git>
cd backend

**Configurar el archivo**application.properties

# Configuración de Base de Datos

spring.datasource.url=jdbc:mysql://localhost:3306/photography_db
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update

# Configuración JWT

jwt.secret=tu_secreto_super_seguro
jwt.expirationMs=3600000

Compilar y ejecutar el proyecto

mvn clean install
mvn spring-boot:run

🔐 Seguridad y Autenticación

El sistema usa JWT (JSON Web Token) para autenticar y autorizar a los usuarios del Backoffice. Para acceder a los endpoints protegidos, es necesario enviar el token en el encabezado Authorization.

Endpoints de Autenticación

POST /api/auth/login → Iniciar sesión y obtener token.

POST /api/auth/register → Crear nuevo usuario (solo admin).

📖 Documentación de API (Swagger)

Una vez el backend esté en ejecución, puedes acceder a la documentación de la API en:

<http://localhost:8080/swagger-ui/index.html>

📌 Endpoints Principales

Landing Page

GET /api/landing/config → Obtener configuración de la Landing Page.

GET /api/landing/gallery → Obtener galería de imágenes.

GET /api/landing/packages → Obtener lista de paquetes.

Backoffice (Requiere autenticación JWT)

POST /api/admin/gallery/upload → Subir nueva imagen.

DELETE /api/admin/gallery/{id} → Eliminar imagen.

PUT /api/admin/config → Actualizar configuración de la Landing Page.

POST /api/admin/packages → Crear un paquete de fotografía.

PUT /api/admin/packages/{id} → Editar paquete.

DELETE /api/admin/packages/{id} → Eliminar paquete.

🏗 Próximos Pasos

✅ Crear modelo de datos y entidades.✅ Configurar seguridad con JWT.✅ Implementar controladores y servicios REST.✅ Integrar Swagger para documentación de API.✅ Implementar subida de imágenes con Cloudinary o Firebase.

🖥 Despliegue

Este backend puede ser desplegado en Docker, VPS, o en servicios en la nube como AWS EC2, Digital Ocean o Railway.

📌 Desarrollado por: Anthony J. Rojas Valdez 🚀
