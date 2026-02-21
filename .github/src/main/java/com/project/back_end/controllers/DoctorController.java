package com.project.back_end.controllers;

import com.project.back_end.models.Doctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping
    public String test() {
        return "Doctor API is working!";
    }
}
