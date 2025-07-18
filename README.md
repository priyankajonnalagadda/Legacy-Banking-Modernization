# 🏦 Legacy Banking Modernization

A simulated modernization of a mainframe banking system using **Java**, **Spring Boot**, **SQL**, **JCL Scripts**, **Docker**, and **GitHub Actions** CI/CD.

---

## 🚀 Tech Stack
- **Java 17**, **Spring Boot**
- **SQL**, **Legacy JCL Scripts**
- **Shell Scripts**
- **Docker**
- **GitHub Actions** (CI/CD)

---

## 📂 Project Structure

Legacy-Banking-Modernization/
├── backend-spring/
│ ├── src/
│ ├── pom.xml
│ └── Dockerfile
├── sql/
│ ├── procedures.sql
│ └── schema.sql
├── legacy-jcl-scripts/
│ ├── job1_interest_calc.sh
│ └── job2_account_report.sh
├── .github/workflows/
│ └── build.yml
└── README.md

---

## 📦 Key Modules

### 🔧 Backend – Spring Boot (Java)
- RESTful API to manage accounts and trigger interest calculation
- Uses `application.properties` to configure DB and port
- Packaged using `Maven`, deployable via `Docker`

### 🗃️ SQL Scripts
- `schema.sql`: creates accounts and transactions tables
- `procedures.sql`: includes stored procedure for applying interest

### 🧾 Legacy JCL Scripts (Shell)
- Simulate legacy batch jobs (like COBOL+JCL)
- `job1_interest_calc.sh`: applies interest via API call
- `job2_account_report.sh`: generates account report mock

### 🔄 CI/CD – GitHub Actions
- Automatically builds and tests Spring Boot app on each push
- `build.yml` under `.github/workflows/` handles Maven build

---

## 🐳 Docker Support

To build and run the backend locally using Docker:

```bash
cd backend-spring
docker build -t legacy-banking-backend .
docker run -p 8080:8080 legacy-banking-backend
