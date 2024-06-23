# Book Store Application built with Java

## Project Overview

The Bookstore Application is a Java-based system designed to manage books and orders for a bookstore. It allows authors
to create, view, update, and delete books, while customers can browse and purchase books. The application uses a layered
architecture to ensure a clear separation of concerns, making it robust, maintainable, and scalable. Key features
include book management, order processing, and data persistence using serialization.

## Architecture Overview

The Bookstore Application follows a layered architecture to separate concerns and enhance maintainability. The
architecture consists of the following layers:

1. Controller Layer: Manages client interactions and handles user inputs and outputs.
2. Service Layer: Contains business logic and validation rules.
3. Repository Layer: Handles database-related operations.
4. Converter Layer: Converts data transfer objects (DTOs) to entity classes for database operations and vice versa.
5. Serialization Layer: Manages serialization and deserialization of objects for data persistence.

### Use Case Diagram

![usecasediagram](assets/UseCaseDiagram.png)

The use case diagram for the Bookstore Application shows the interactions between the system and its two primary
users: Authors and Customers. Authors can create, view, update, delete, and search for books, allowing them to manage
their entire catalog. Customers can view all books, search for specific titles, place orders, and view their purchased
books. This diagram also shows the functionality provided to both types of users.

### UML Diagram

![uml](assets/UMLClassDiagram.png)

### Sequence Diagram

![sequence](assets/SequenceDiagram.png)

The sequence diagram below illustrates the interaction between Java classes and their methods for processing a book
order:

1. BookController: Handles user requests and has methods like add and getBook.
2. BookService: Manages business logic, including converting DTOs to entities and vice versa.
3. BookRepository: Communicates with the database and handles CRUD operations.
4. BookSerializer: Manages serialization and deserialization of BookEntity objects.

**Order Processing Steps:**

1. BookController initiates the order process by calling BookService.add.
2. BookService converts BookDTO to BookEntity and calls BookRepository.add.
3. BookRepository serializes the BookEntity and saves it to a file.
4. To retrieve a book, BookController calls BookService.getBook.
5. BookService calls BookRepository.getDetail to deserialize the BookEntity from the file and convert it back to
   BookDTO.

## Installation

Follow these detailed setup instructions to get the application running on your local machine.

### Backend setup

#### 1. Clone the Repository:

```bash
git clone https://github.com/your-username/bookstore-application.git
cd bookstore-application
```

#### 2. Set Up Your Development Environment:

Ensure you have Java JDK installed (version 8 or above).
Use an IDE like IntelliJ IDEA or Eclipse.

#### 3. Compile the Project:

Open the project in your IDE.
Build the project to ensure all dependencies are correctly resolved.

#### 4. Run the Application:

Run the BookClient class to test the functionality.

### Environment Setup

* Java JDK: Install Java Development Kit (JDK) version 8 or above.
* IDE: Use IntelliJ IDEA, Eclipse, or any other Java IDE for development.

## Technology Stack

### Backend

* Java: The core programming language used for development.
* Serialization: For data persistence and retrieval.
* JUnit: For testing the application.

### Frontend

(Currently, there is no frontend implementation. This can be added using technologies like Angular, React, or any other
frontend framework.)

### Server/Database

* Temporary Storage: Uses Java Collections for temporary storage of book data.
* Serialization: Implements serialization and deserialization for data persistence.

## Features

### Author Functions:

* Create Books: Authors can create multiple books.
* View Book Details: Authors can view details of a specific book.
* View All Books: Authors can view a list of all books they have created.
* Search Books: Authors can search for books by name.
* Update Book Details: Authors can update the details of a book.
* Delete Books: Authors can delete a particular book.

### Customer Functions:

* View All Books: Customers can view books from all authors.
* View Book Details: Customers can view the details of a specific book.
* Search Books: Customers can search for books by name.
* Place Orders: Customers can place orders for books.
* View Purchased Books: Customers can view all their purchased or ordered books in their catalog.

### Additional Features:

* Sales Reports for Authors: Show the number of books sold and total revenue over a period.

## Usage

### 1. Running the Application:

Execute the main method in the BookClient class.
The BookClient will simulate adding a book and retrieving its details, showcasing the application's core functionality.

### 2. Interacting with the Application:

Use the BookController to manage books and interact with the BookService layer.
The BookService layer handles business logic and interacts with the BookRepository for data persistence.

## Tests

### 1. Unit Tests:

Use JUnit to write and run unit tests for your application.
Ensure all tests pass to verify the correctness of your code.

### 2. Integration Tests:

Write integration tests to ensure different parts of the application work together as expected.

### 3. Executing Tests:

In your IDE, right-click on the test class or method and select 'Run' to execute the tests.
Alternatively, use build tools like Maven or Gradle to run tests from the command line.

```bash
# Example for Maven
mvn test
```
