# 🐾 Mini-Proyecto Pokémon con Spring Boot

Este proyecto es un **ejemplo práctico con Spring Boot** implementando una arquitectura clásica de 5 capas:  
**Entity → DTO → Repository → Service → Controller**.  

La aplicación expone una API REST sencilla para gestionar Pokémon, utilizando **Spring Data JPA** con **H2 (base en memoria)** para pruebas rápidas.
---
## 📂 Estructura del proyecto

src/main/java/com/example/pokemon/
├── controller/ # Controladores REST
├── service/ # Lógica de negocio
├── repository/ # Repositorio JPA
├── model/ # Entidades (Entity)
├── dto/ # Data Transfer Objects
└── Application.java # Clase principal

---
## ⚙️ Tecnologías utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (en memoria)
- **Maven**

---
## 🚀 Cómo ejecutar el proyecto

1. Clonar este repositorio:

```bash
  git clone https://github.com/tuusuario/nombre-repo.gi
  cd nombre-repo
```

Compilar y ejecutar:

	mvn spring-boot:run

Acceder a la app:

    Consola H2 → http://localhost:8080/h2-console

    API REST:
        GET /pokemon → lista de Pokémon
        GET /pokemon/{id} → un Pokémon específico
        POST /pokemon → crear un Pokémon

Ejemplo de body en JSON:

    {
      "nombre": "Pikachu",
      "tipo": "Eléctrico",
      "altura": 40,
      "peso": 6
    }

🎯 Objetivos de aprendizaje

Este mini-proyecto fue diseñado como ejercicio de práctica backend para:

    Comprender la estructura típica en capas en Spring Boot.
    Usar DTOs para separar entidad y presentación.
    Practicar Spring Data JPA y consultas con repositorios.
    Exponer una API REST básica lista para pruebas.

💡 Próximos pasos / Mejoras posibles

*     Añadir validación de datos con @Valid.
*     Integrar Swagger/OpenAPI para documentar la API.
*     Migrar de H2 a PostgreSQL para un entorno más real.
*     Implementar tests unitarios con JUnit y Mockito.
*     Añadir relaciones entre entidades (ej. Pokémon ↔ Entrenador).


👤 Autor

Proyecto desarrollado por Fran Rodriguez

💬 Abierto a feedback y sugerencias para seguir aprendiendo.