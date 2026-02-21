package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private List<String> doctors = new ArrayList<>();

    // Get all doctors
    @GetMapping
    public List<String> getAllDoctors() {
        return doctors;
    }

    // Add a new doctor
    @PostMapping
    public String addDoctor(@RequestBody String doctorName) {
        doctors.add(doctorName);
        return "Doctor added successfully!";
    }

    // Update doctor
    @PutMapping("/{index}")
    public String updateDoctor(@PathVariable int index, @RequestBody String newName) {
        if (index >= 0 && index < doctors.size()) {
            doctors.set(index, newName);
            return "Doctor updated successfully!";
        }
        return "Doctor not found!";
    }

    // Delete doctor
    @DeleteMapping("/{index}")
    public String deleteDoctor(@PathVariable int index) {
        if (index >= 0 && index < doctors.size()) {
            doctors.remove(index);
            return "Doctor deleted successfully!";
        }
        return "Doctor not found!";
    }
}
