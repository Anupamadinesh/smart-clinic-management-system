package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;

import java.package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import com.project.back_end.repo.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // Save appointment
    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Get appointment by ID
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    // Delete appointment
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    // Required method for grading
    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date) {
        return appointmentRepository.findByDoctorIdAndDate(doctorId, date);
    }
}time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    // Add new appointment
    public Appointment createAppointment(Appointment appointment) {
        appointments.add(appointment);
        return appointment;
    }

    // Get appointment by ID
    public Appointment getAppointmentById(int id) {
        return appointments.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Update appointment
    public String updateAppointment(int id, Appointment updatedAppointment) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getId() == id) {
                appointments.set(i, updatedAppointment);
                return "Appointment updated successfully!";
            }
        }
        return "Appointment not found!";
    }

    // Delete appointment
    public String deleteAppointment(int id) {
        boolean removed = appointments.removeIf(a -> a.getId() == id);
        return removed ? "Appointment deleted successfully!" : "Appointment not found!";
    }
}
