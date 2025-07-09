Football Club Management System
A backend system for managing a football club's players, coaches, and teams using Java Spring Boot and MySQL. All operations are handled through a centralized RESTful API.

Key Features
Manage Player Profiles: Perform CRUD (Create, Read, Update, Delete) operations on players.

Manage Teams & Coaches: Handle team and coach information.

RESTful API: Exposes all operations through a clean and scalable API.

Database Integration: Uses Spring Data JPA to interact with a MySQL database.

ER Diagram
Here is the Entity-Relationship Diagram for the database schema.

Technologies Used
Java 17

Spring Boot 3

Spring Web

Spring Data JPA

MySQL

Maven

How to Run the Project
Setup:

Ensure Java JDK 17+, Maven, and MySQL are installed and running.

Create a MySQL database named football_club_db.

Update src/main/resources/application.properties with your database credentials.

Clone the Repository:

git clone https://github.com/jawadur13/football-management-system.git

Run the Application:

From your IDE, run the FcmsApplication.java file.

Or, from the terminal, execute mvn spring-boot:run.

Access the API:
The application will be available at http://localhost:8080. Use a tool like Postman to interact with the endpoints.