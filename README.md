# Fullstack Svelte + Spring Boot

This is a fullstack web application using:

- 🧱 **Frontend**: [Svelte](https://svelte.dev/) (served statically via Vite build)
- ⚙️ **Backend**: [Spring Boot](https://spring.io/projects/spring-boot) (Java)

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

- Svelte 5 (Not Sveltekit)

```bash
cd frontend
npm install

npx vite build --watch
```
