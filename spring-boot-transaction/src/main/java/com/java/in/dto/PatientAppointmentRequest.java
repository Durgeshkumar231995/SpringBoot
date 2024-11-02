package com.java.in.dto;

import com.java.in.entity.Appointment;
import com.java.in.entity.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentRequest {

    private Patient patient;

    private Appointment appointment;
}
