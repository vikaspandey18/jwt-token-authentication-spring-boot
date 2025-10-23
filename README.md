# jwt-token-authentication-spring-boot
This contain production ready jwt authentication using spring boot 3 and spring security 6 easy to integrate in your project
```
START

1️⃣ Create Database
   └─ MySQL DB: demo_auth

2️⃣ Backend: Spring Boot Setup
   ├─ Create Maven project
   ├─ Add dependencies: Spring Web, Security, Data JPA, MySQL, Lombok, JWT
   └─ Configure application.properties (DB + JWT)

3️⃣ Create Entities (Model)
   ├─ Role.java
   └─ User.java (ManyToMany with Role)

4️⃣ Create Repositories
   ├─ RoleRepository.java
   └─ UserRepository.java

5️⃣ Create DTOs
   ├─ LoginRequest.java
   ├─ SignUpRequest.java
   └─ JwtResponse.java

6️⃣ Create Service Layer
   ├─ CustomUserDetailsService.java (implements UserDetailsService)
   └─ AuthService.java (handles registration & login)

7️⃣ Configure Security
   ├─ JwtTokenProvider.java (generate/validate JWT)
   ├─ JwtAuthenticationFilter.java
   └─ SecurityConfig.java (configure Spring Security, password encoder, filter)

8️⃣ Create Controllers
   ├─ AuthController.java (signup, signin)
   └─ UserController.java (secured endpoints, e.g., /me)

9️⃣ Data Initialization
   └─ CommandLineRunner → create default roles (ROLE_USER, ROLE_ADMIN)

🔟 Test Backend (Postman)
   ├─ POST /api/auth/signup
   ├─ POST /api/auth/signin
   └─ GET /api/users/me (with JWT)

1️⃣1️⃣ Frontend: Angular Setup
    ├─ Create Angular project (ng new)
    ├─ Create auth folder:
    │   ├─ auth.service.ts
    │   ├─ token.interceptor.ts
    │   └─ auth.guard.ts
    ├─ Create login/register components
    └─ Create models (login-request, signup-request, jwt-response)

1️⃣2️⃣ Frontend: Connect to Backend
    ├─ AuthService → call /signin & /signup
    ├─ Store JWT in localStorage
    ├─ TokenInterceptor → attach JWT to requests
    └─ AuthGuard → protect routes

1️⃣3️⃣ Frontend: Logout
    └─ Delete JWT from localStorage

1️⃣4️⃣ Test Full Flow
    ├─ Register user → Signup
    ├─ Login → get JWT
    └─ Access secured endpoints → validate JWT works

END

```
