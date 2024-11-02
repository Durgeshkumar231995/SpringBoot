package com.java.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.in.dto.PatientAppointmentRequest;
import com.java.in.service.PractoService;

@RestController
@RequestMapping("/practo")
public class PractoController {

    @Autowired
    private PractoService service;

    @PostMapping("/bookAppointment")
    public String bookDoctorsAppointment(@RequestBody PatientAppointmentRequest request){
        return service.bookAppointment(request);
    }
}
