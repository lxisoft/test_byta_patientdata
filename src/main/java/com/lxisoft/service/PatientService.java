package com.lxisoft.service;

import java.util.List;

import com.lxisoft.entity.Patient;
import com.lxisoft.entity.PatientFamilyRelation;
import com.lxisoft.entity.PatientPrivateDetail;

public interface PatientService {
	public void registerPatientDetail(Patient patientDetail);

	public void registerPatientPrivateDetail(PatientPrivateDetail patientPrivateDetail);

	public void registerPatientFamilyRelation(PatientFamilyRelation familyRelationDetail);

	public Patient patientEnquiryById(int id);

	public List<Patient> patientEnquiryByName(String fName);

	public void updatePatientDetail(Patient patient);

	public void updatePatientPrivateDetail(PatientPrivateDetail privateDetail);

	public void updateFamilyRelation(PatientFamilyRelation familyRelation);
}
