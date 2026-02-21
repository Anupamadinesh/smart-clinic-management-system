package com.project.back_end.controllers;

import com.project.back_end.models.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    private List<Prescription> prescriptions = new ArrayList<>();

    // Get all prescriptions
    @GetMapping
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    // Add new prescription
    @PostMapping
    public Prescription addPrescription(@RequestBody Prescription prescription) {
        prescriptions.add(prescription);
        return prescription;
    }

    // Get prescription by ID
    @GetMapping("/{id}")
    public Prescription getPrescriptionById(@PathVariable int id) {
        return prescriptions.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Delete prescription
    @DeleteMapping("/{id}")
    public String deletePrescription(@PathVariable int id) {
        boolean removed = prescriptions.removeIf(p -> p.getId() == id);
        return removed ? "Prescription deleted successfully!" : "Prescription not found!";
    }
}
