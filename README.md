# G3 Online Bookstore

A simple Java Spring Boot web application for managing an online bookstore.  
Users can browse books, and authenticated admins can add or delete books.

---

## Features

- ✅ View all books
- ✅ Add books with form validation (admin only)
- ✅ Delete books (admin only)
- ✅ Input validation using Bean Validation (`@NotBlank`, `@Min`)
- ✅ Persistent H2 file-based database
- ✅ In-memory login system using Spring Security

---

## Admin Access

To add or delete books, log in with:

```
Username: admin
Password: admin123
```

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web + Thymeleaf
- Spring Data JPA (with H2 database)
- Spring Security (in-memory user management)
- Maven for project build

---

## Validation Rules

- Title: required
- Author: required
- Price: must be 0 or greater

---

## Project Structure

```
src/
├── main/
│   ├── java/com/g3onlinebookstore/bookstore/
│   │   ├── controller/         # Web controllers
│   │   ├── model/              # Book entity
│   │   ├── repository/         # Spring Data JPA interfaces
│   │   └── config/             # Security & user config
│   └── resources/
│       ├── templates/          # Thymeleaf views
│       ├── static/             # (Optional) CSS/JS files
│       └── application.properties
```

---

## Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/mr-riotz/g3-online-bookstore.git
cd g3-online-bookstore
```

### 2. Open in IntelliJ

- Import as a **Maven** project.
- Make sure your Java SDK is 17+.

### 3. Run the App

Run the main class:

```java
BookstoreApplication.java
```

---

## Access the App

- Book list: `http://localhost:8080/books`
- Add book: `http://localhost:8080/books/add` (admin login required)
- H2 Console: `http://localhost:8080/h2-console`
    - JDBC URL: `jdbc:h2:file:./data/bookdb`
    - User: `sa`
    - Password: *(leave blank)*

---

## Upcoming Features

- [ ] Search books by title or author
- [ ] Apply CSS styling
- [ ] Shopping cart
- [ ] Login with database users
- [ ] Role-based access (Admin vs. User)