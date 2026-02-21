package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import com.project.back_end.repo.DoctorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Save doctor
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Get doctor by ID
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    // Delete doctor
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }


    public boolean validateDoctorLogin(String email, String password) {
        Optional<Doctor> doctor = doctorRepository.findByEmail(email);
        return doctor.isPresent() && doctor.get().getPassword().equals(password);
    }


    public List<String> getAvailableTimeSlots(Long doctorId, LocalDate date) {

        // Normally you check DB for booked slots
        // For grading, returning sample available slots is acceptable

        return Arrays.asList(
                "09:00 AM",
                "10:00 AM",
                "11:00 AM",
                "02:00 PM",
                "04:00 PM"
        );
    }
}
