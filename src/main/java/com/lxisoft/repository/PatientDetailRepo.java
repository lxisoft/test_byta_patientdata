package com.lxisoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.entity.Patient;



@Repository
public interface PatientDetailRepo extends JpaRepository<Patient, Integer>{
   Patient findOne(int id);
   List<Patient> findByfirstName(String fName);
}
