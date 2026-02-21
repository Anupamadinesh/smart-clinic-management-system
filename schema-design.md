Tables:

patients

doctors

appointments

admin

Example schema:

## 1. Doctor Table

```sql
CREATE TABLE Doctor (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15)
);

2. Patient Table
CREATE TABLE Patient (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT,
    gender VARCHAR(10),
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15)
);

3. Appointment Table
CREATE TABLE Appointment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    appointment_date DATE NOT NULL,
    status VARCHAR(50),
    doctor_id BIGINT,
    patient_id BIGINT,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(id),
    FOREIGN KEY (patient_id) REFERENCES Patient(id)
);
