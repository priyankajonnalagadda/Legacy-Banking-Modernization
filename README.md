🏦 Legacy Banking Modernization

A simulated modernization of a mainframe banking system using **Java**, **Spring Boot**, **SQL**, **JCL Scripts**, **Docker**, and **GitHub Actions CI/CD**.  
Designed for enterprises shifting from COBOL-based legacy systems to modern cloud-native applications.

---

🚀 Tech Stack
- Java 17, Spring Boot, Maven
- SQL, Stored Procedures
- Shell Scripts (JCL simulation)
- Docker
- GitHub Actions (CI/CD)

---

📂 Project Structure

Legacy-Banking-Modernization/
├── backend-spring/
│ ├── src/
│ ├── pom.xml
│ └── Dockerfile
├── sql/
│ ├── schema.sql
│ └── procedures.sql
├── legacy-jcl-scripts/
│ ├── job1_interest_calc.sh
│ └── job2_account_report.sh
├── .github/workflows/
│ └── build.yml
└── README.md

markdown
Copy
Edit

---

📦 Key Modules

🔧 Backend – Spring Boot (Java)
- RESTful APIs to manage accounts and simulate interest calculation
- Configuration via `application.properties`
- Built with `Maven` and containerized using `Docker`

🗃️ SQL Scripts
- `schema.sql`: Defines the `accounts` and `transactions` tables
- `procedures.sql`: Contains a stored procedure to apply interest

🧾 Legacy JCL Scripts (Shell)
- Simulates JCL-style batch jobs using shell scripts
- `job1_interest_calc.sh`: Calls the backend to apply interest
- `job2_account_report.sh`: Simulates report generation from DB

🔄 CI/CD – GitHub Actions
- `build.yml` automates Maven build on push/pull requests to `main`
- Ensures build integrity with every commit

---

🐳 Docker Support

To build and run the backend:

```bash
cd backend-spring
docker build -t legacy-banking-backend .
docker run -p 8080:8080 legacy-banking-backend
