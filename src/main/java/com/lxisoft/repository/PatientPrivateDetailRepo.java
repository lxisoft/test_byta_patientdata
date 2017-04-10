package com.lxisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lxisoft.entity.PatientPrivateDetail;

@Repository
public interface PatientPrivateDetailRepo extends JpaRepository<PatientPrivateDetail,Integer> {

}
