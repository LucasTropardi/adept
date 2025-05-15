# AdeptMS - Management System

**AdeptMS** (Adept Management System) is a modular ERP solution focused on efficient business operations, starting with a warehouse (inventory) module and evolving into a full-featured platform. Inspired by real-world systems, it's designed for scalability and practical use in small to mid-sized businesses.

## 🧩 Modules (Planned)
- **Warehouse (Almoxarifado):** Stock control, product registration, input/output tracking
- **Sales:** Sales orders, customer management
- **Companies & Employees:** Multi-company structure with user roles
- **PDV (Point of Sale):** Seamless retail sales (future)
- **More coming soon...**

## 🛠️ Tech Stack
- **Frontend/Backend:** [Hilla](https://hilla.dev) (Vaadin + Spring Boot)
- **Database:** PostgreSQL
- **Image Storage:** MongoDB (planned)
- **Build Tool:** Maven
- **Language:** Java (backend), TypeScript (frontend)

## 🚀 Getting Started
1. Clone this repo:
   ```bash
   git clone https://github.com/LucasTropardi/adept


## Useful links

- Read the documentation at [hilla.dev/docs](https://hilla.dev/docs/).
- Ask questions on [Stack Overflow](https://stackoverflow.com/questions/tagged/vaadin) or join our [Forum](https://vaadin.com/forum).
- Report issues, create pull requests in [GitHub](https://github.com/vaadin/hilla).


## Deploying using Docker

To build the Dockerized version of the project, run

```
mvn clean package -Pproduction
docker build . -t adeptms:latest
```

Once the Docker image is correctly built, you can test it locally using

```
docker run -p 8080:8080 adeptms:latest
```
