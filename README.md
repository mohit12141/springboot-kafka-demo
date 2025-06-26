# 🛰️ Spring Boot Kafka Demo (Zookeeper Mode)

This project demonstrates a basic **Kafka Producer-Consumer** setup using **Spring Boot 3** with **Apache Kafka 3.7.0** running in **Zookeeper mode**. You can send messages using a REST API, and Kafka will deliver them to a consumer service.

---

## 🔧 Tech Stack

- ☕ Java 24
- 🌱 Spring Boot 3
- 📬 Apache Kafka 3.7.0 (Zookeeper mode)
- 🧪 Thunder Client (VS Code extension) for API testing

---

## 🖼 Architecture Diagram

```mermaid
graph TD
    A[REST Controller] --> B[Kafka Producer]
    B --> C[Kafka Topic (via Broker)]
    C --> D[Kafka Consumer]
    D --> E[Console Logger]
```

## ▶️ Start Zookeeper

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

## ▶️ Start Kafka Broker
.\bin\windows\kafka-server-start.bat .\config\server.properties


Kafka runs on: localhost:9092
Zookeeper runs on: localhost:2181

## ▶️ Run Spring Boot Application
In VS Code terminal or command prompt:

./mvnw spring-boot:run

## 📬 API Endpoint
Method	Endpoint	Description
POST	/api/publish	Publishes message to Kafka topic

## 📦 Sample Request (JSON)
{
  "message": "Hello from Thunder Client!"
}
Use Thunder Client (VS Code Extension) for testing the API.

## ⚙️ Application Details
- Spring Boot app connects to Kafka running on localhost:9092

- Default topic: test-topic

- Consumer listens and logs received messages to console

## 🗃 Directory Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.kafka/
│   │       ├── controller/     # REST API controller
│   │       ├── producer/       # Kafka producer logic
│   │       └── consumer/       # Kafka consumer logic
│   └── resources/
│       ├── application.properties
└── pom.xml

## ✅ Example Output
When a message is sent:

Received message: Hello from Thunder Client!

## 🛡 License
This project is open-sourced under the MIT License.

## 🙌 Contributions
Contributions, issues, and PRs are welcome!

