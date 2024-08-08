# SpringBoot-ServiceLayer Example

This is a Spring Boot application that demonstrates basic CRUD operations. It includes a service layer and uses JPA for database interactions, with MariaDB as the database provider. The project also integrates Swagger for API documentation.

## Features

- Add student data.
- List all students data.
- Retriving specific data using name and id.
- Updating student data.
- Deleting student data.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MariaDB (can be replaced with any other database)
- Swagger

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   sh
   
   cd SpringBoot-MethodArgumentNotValidException
2. Build the project:
   sh
     mvn clean install
3. Run the application:
   sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new student data record to the database
- Request Body: json in postman
  sh
    {
    "name":"vishal",
    "school":"nml",
    "age":19
    }

3. Get All Student data
- URL: `/show`
- Method: GET
- Description: Returns a list of all student data.
  
4. Retreving data using Name or Id.
- URL: `/{name}` or `/byid/{id}`
- Method: GET
- Description: Returns a list of all student data.

5. Updating Student data
- URL: `/update/{id}`
- Method: PUT
- Description: Updates all fields of data.

6. Deletion of student data
- URL: `/delete/{id}`
- Method: DELETE
- Description: Delete student data of provided id.

### Project Structure

- Student: Entity class representing a user profile.
- StudentRepository: Repository interface for CRUD operations on user profiles.
- StudentService: Service layer for the communication between entity and persistence layer. It contains logic of this appliaction.
- StudentController: REST controller for handling user-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
