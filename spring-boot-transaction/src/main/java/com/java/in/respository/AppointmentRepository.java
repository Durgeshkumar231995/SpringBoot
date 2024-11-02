package com.java.in.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {
}
