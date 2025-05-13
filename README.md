# Fullstack Svelte + Spring Boot

![image](https://github.com/user-attachments/assets/f1a28e17-96d9-4b42-856a-8d730a5130c7)

- 🧱 **Frontend**: [Svelte](https://svelte.dev/) (Not Sveltekit)
- ⚙️ **Backend**: [Spring Boot](https://spring.io/projects/spring-boot) (Java)

People often know Inertia.js as a tool used with Ruby or Laravel for building fullstack SPAs. However, this approach is simpler in that it still separates the frontend and backend, even if the backend serves the static files. This separation makes it easier to scale the project in the future—whether moving toward microservices or other architectural changes—since the frontend and backend remain decoupled.

---

## ⚙️ Setup Instructions

### 1. Backend (Spring Boot)

- Make sure Java 21+ is installed
- Run using your IDE or command line:

```bash
./mvnw spring-boot:run
# or if using Gradle
./gradlew bootRun
```
### 2. Frontend (Svelte)

- Svelte 5
- Svelte will serve as static file.

```bash
cd frontend
npm install

npx vite build --watch
```
