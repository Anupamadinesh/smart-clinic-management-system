package com.project.back_end.models;

import java.time.LocalDateTime;

public class Appointment {

    private int id;
    private int doctorId;
    private int patientId;
    private LocalDateTime appointmentDate;
    private String status;

    public Appointment() {
    }

    public Appointment(int id, int doctorId, int patientId, LocalDateTime appointmentDate, String status) {
        this.id = id;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    // getters and setters
}
