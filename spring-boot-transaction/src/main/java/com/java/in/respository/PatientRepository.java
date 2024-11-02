package com.java.in.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
