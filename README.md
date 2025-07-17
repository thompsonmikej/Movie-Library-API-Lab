# Movie-Library-API-Lab

**Developed at devCodeCamp**

A Spring Boot RESTful API project for managing a movie library, showcasing key features of Java persistence with JPA and CRUD operations. This project defines a `Movie` entity with appropriate getters and setters and uses Spring Data JPA’s repository interface to interact with a MySQL database.

---

## Description

- Defines a `Movie` entity class with fields for `id`, `name`, `genre`, and `director`.  
- Uses standard JPA annotations such as `@Entity`, `@Id`, and `@GeneratedValue`.  
- Implements a Spring Data JPA repository interface (`MovieRepository`) extending `JpaRepository` for seamless CRUD functionality.  
- Supports creating, reading, updating, and deleting movies through REST endpoints.  
- Develops backend API logic in Java using IntelliJ and connects to a MySQL database for persistence.

---

## Features

- RESTful API using Spring Boot  
- JPA entity modeling with private fields and public getters/setters  
- CRUD operations via Spring Data JPA repository  
- MySQL database integration  
- Console-based testing and logging via Spring Boot application

---

## Technologies Used

- Java 11+  
- Spring Boot (Spring Data JPA)  
- MySQL  
- IntelliJ IDEA

---

## Installation

1. **Clone the repository:**
    ```
    git clone https://github.com/thompsonmikej/Movie-Library-API-Lab.git
    cd Movie-Library-API-Lab
    ```

2. **Configure MySQL database:**  
   - Create a MySQL database for the application.  
   - Update `application.properties` or `application.yml` with your database credentials.

3. **Build and run the Spring Boot application:**  
    ```
    ./mvnw spring-boot:run
    ```
    or if using Maven directly:  
    ```
    mvn spring-boot:run
    ```

4. **Test CRUD operations:**  
   - Use Postman, curl, or your browser to interact with API endpoints.  
   - Verify data persists properly in MySQL.

---

## Usage

- Extend or modify the `Movie` entity and repository as needed.  
- Add controller classes to expose API endpoints (if not included).  
- Explore adding validation, exception handling, and Swagger/OpenAPI integration for enhanced API documentation.

---

## Challenges & Lessons Learned

- Gained hands-on experience designing JPA entities and repositories.  
- Built essential CRUD operations with Spring Boot and MySQL integration.  
- Improved understanding of Java class design, encapsulation, and database connectivity.

---

## Future Improvements

- Implement detailed REST controllers with request validation and error handling.  
- Add security layers with Spring Security.  
- Create frontend client or UI for easier interaction.  
- Include unit and integration tests.

---
## Author

Feel free to reach out or connect:

**Michael Thompson**  
https://www.linkedin.com/in/thompsonmikej  
