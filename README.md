# Java REST API Automation Testing Framework

A comprehensive, production-ready API automation framework built using **Java**, **RestAssured**, and **TestNG**. This repository demonstrates industry best practices for testing RESTful web services, validating complex payloads, and handling diverse HTTP request configurations.

## 🛠️ Tech Stack & Dependencies
* **Language:** Java 17+
* **Testing Tool:** RestAssured
* **Test Runner:** TestNG
* **Build Tool:** Maven

## 💡 Core Features & Test Coverage

### 1. Cookies & Headers Handling
* **Test Headers:** Validating request and response headers (`Content-Type`, `Authorization`, custom headers) using strict value validation.
* **Cookie Management:** Inspecting, extracting, and verifying server-side cookies dynamically using maps (`res.getCookies()`).

### 2. Payload Flexibility (Different Ways to Create POST Requests)
Demonstrates multiple approaches to handling `POST` bodies depending on the complexity of the data:
* **String Literal:** For quick, hardcoded JSON payloads.
* **HashMap/Map:** For dynamically generated, simple structured payloads.
* **POJO (Plain Old Java Objects):** Serialization and deserialization using Jackson/Gson for scalable, object-oriented payload building.
* **External JSON File:** Reading static payloads directly from resource files.

### 3. Parameters Validation
* **Path Parameters:** Modifying resource paths dynamically (e.g., `/users/{userId}`) to target specific endpoints.
* **Query Parameters:** Controlling filtering, sorting, and pagination logic (e.g., `?page=1&per_page=10`).

---

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed:
* [Java JDK](https://oracle.com) (Version 11 or higher)
* [Apache Maven](https://apache.org)

### Installation & Run
1. Clone this repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate to the project folder:
   ```bash
   cd YOUR_REPO_NAME
   ```
3. Run the automated test suite:
   ```bash
   mvn clean test
   ```

---

## 📂 Project Structure
```text
├── src
│   ├── main
│   │   └── java             # Utility classes, POJOs, and Request Builders
│   └── test
│       └── java
│           └── tests        # Functional Test Cases (GET, POST, Headers, Parameters)
├── src/test/resources       # Static JSON payload files
├── pom.xml                  # Project dependencies configuration
└── README.md
```
