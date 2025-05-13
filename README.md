# Fullstack Svelte + Spring Boot

![image](https://github.com/user-attachments/assets/f1a28e17-96d9-4b42-856a-8d730a5130c7)

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
