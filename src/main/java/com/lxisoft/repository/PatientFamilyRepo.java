package com.lxisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.entity.PatientFamilyRelation;

public interface PatientFamilyRepo extends JpaRepository<PatientFamilyRelation,Integer> {

}
