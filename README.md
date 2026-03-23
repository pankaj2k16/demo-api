# Student Management API

A professional Spring Boot RESTful API for managing student records with automated UUID generation and integrated OpenAPI documentation.

## 🚀 Features

- **CRUD Operations**: Full Create, Read, Update, and Delete functionality for student records.
- **UUID Generation**: Automatic, unique identifier generation for every student.
- **Data Validation**: Robust input validation using Jakarta Validation.
- **H2 In-Memory Database**: Seamless setup and testing with an embedded database.
- **API Documentation**: Interactive Swagger UI and OpenAPI 3.0 specification.
- **Exception Handling**: Global error handling for consistent API responses.

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **SpringDoc OpenAPI (Swagger UI)**
- **Maven**

## 🏁 Getting Started

### Prerequisites

- JDK 17 or higher
- Maven 3.6+ (or use the provided `./mvnw`)

### Installation & Running

1. **Clone the repository**:
   ```bash
   git clone git@github.com:pankaj2k16/demo-api.git
   cd demo-api
   ```

2. **Build the project**:
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

The server will start at `http://localhost:8080`.

## 📖 API Documentation & Testing

This project uses **SpringDoc OpenAPI** to provide an interactive testing environment.

- **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI Spec (JSON)**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

### H2 Console
You can view the in-memory database at:
- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:elearningdb`
- **Username**: `sa`
- **Password**: (leave blank)

## 📡 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/students` | Retrieve all students |
| **GET** | `/students/{id}` | Retrieve a student by UUID |
| **POST** | `/students` | Create a new student |
| **PUT** | `/students/{id}` | Update an existing student |
| **DELETE** | `/students/{id}` | Delete a student |

### Sample Request (POST `/students`)
```json
{
  "first_name": "John",
  "last_name": "Doe",
  "dob": "2000-01-01",
  "address": "123 Main St, New York"
}
```
*Note: The `id` is automatically generated and should not be provided in the POST request.*

## 🧪 Testing with cURL

**Create a Student:**
```bash
curl -X POST http://localhost:8080/students \
     -H "Content-Type: application/json" \
     -d '{"first_name": "Jane", "last_name": "Smith", "dob": "1999-05-15", "address": "456 Oak Ave"}'
```

**Get All Students:**
```bash
curl http://localhost:8080/students
```
