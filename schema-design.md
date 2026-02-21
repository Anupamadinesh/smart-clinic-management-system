Tables:

patients

doctors

appointments

admin

Example schema:
patients (
  patient_id INT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  phone VARCHAR(15)
)

doctors (
  doctor_id INT PRIMARY KEY,
  name VARCHAR(100),
  specialization VARCHAR(100)
)

appointments (
  appointment_id INT PRIMARY KEY,
  patient_id INT,
  doctor_id INT,
  appointment_date DATETIME,
  FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
  FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
)
