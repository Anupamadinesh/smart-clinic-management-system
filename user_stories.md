# Smart Clinic Management System - User Stories

------------------------------------------------------------
👨‍⚕️ DOCTOR USER STORIES
------------------------------------------------------------

Title: Doctor Login  

User Story:
As a Doctor, I want to log in securely so that I can manage my appointments.

Acceptance Criteria:
- Doctor must enter email and password.
- System validates credentials.
- Successful login redirects to dashboard.
- Invalid login shows error message.


Title: View Scheduled Appointments   

User Story:
As a Doctor, I want to view my scheduled appointments so that I can prepare for consultations.

Acceptance Criteria:
- Doctor can see appointment list.
- Appointments show patient name, date, and time.
- Only logged-in doctor’s appointments are displayed.


Title: Update Appointment Status   

User Story:
As a Doctor, I want to update appointment status so that patient records remain accurate.

Acceptance Criteria:
- Doctor can mark appointment as Completed or Cancelled.
- Updated status is saved in database.
- Status change reflects immediately.


Title: View Patient Details  

User Story:
As a Doctor, I want to view patient details so that I can provide proper treatment.

Acceptance Criteria:
- Doctor can view patient name and details.
- Patient information is read-only.
- Data loads securely.


------------------------------------------------------------
🧑‍🤝‍🧑 PATIENT USER STORIES
------------------------------------------------------------

Title: Patient Registration   

User Story:
As a Patient, I want to register an account so that I can book appointments.

Acceptance Criteria:
- Patient provides name, email, password.
- Email must be unique.
- Successful registration stores data in database.


Title: Patient Login  

User Story:
As a Patient, I want to log in securely so that I can access my medical information.

Acceptance Criteria:
- Patient enters valid credentials.
- System authenticates successfully.
- Redirects to patient dashboard.


Title: Book Appointment  

User Story:
As a Patient, I want to book an appointment with a doctor so that I can receive treatment.

Acceptance Criteria:
- Patient selects doctor and date.
- System checks doctor availability.
- Appointment is saved successfully.
- Confirmation message is shown.


Title: View Appointment History  

User Story:
As a Patient, I want to view my appointment history so that I can track my visits.

Acceptance Criteria:
- Patient sees past and upcoming appointments.
- Each appointment shows doctor name and date.
- History is sorted by date.


------------------------------------------------------------
👨‍💼 ADMIN USER STORIES
------------------------------------------------------------

Title: Manage Doctor Accounts  
User Story:
As an Admin, I want to manage doctor accounts so that the system stays updated.

Acceptance Criteria:
- Admin can add doctors.
- Admin can edit doctor information.
- Admin can delete doctor accounts.


Title: Manage Patient Records    

User Story:
As an Admin, I want to manage patient records so that data remains accurate.

Acceptance Criteria:
- Admin can view patient records.
- Admin can update patient information.
- Admin can delete inactive patients.


Title: View All Appointments  

User Story:
As an Admin, I want to view all appointments so that I can monitor clinic operations.

Acceptance Criteria:
- Admin can see all appointments.
- Appointments show doctor and patient details.


Title: Remove Inactive Users  

User Story:
As an Admin, I want to remove inactive users so that the system remains clean.

Acceptance Criteria:
- Admin can identify inactive users.
- Admin can delete selected users.
- Deleted users cannot log in again.
