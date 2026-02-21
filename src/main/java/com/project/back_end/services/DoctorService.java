package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}
