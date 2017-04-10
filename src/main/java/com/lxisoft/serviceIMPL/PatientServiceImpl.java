package com.lxisoft.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxisoft.entity.Patient;
import com.lxisoft.entity.PatientFamilyRelation;
import com.lxisoft.entity.PatientPrivateDetail;
import com.lxisoft.repository.PatientDetailRepo;
import com.lxisoft.repository.PatientFamilyRepo;
import com.lxisoft.repository.PatientPrivateDetailRepo;
import com.lxisoft.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDetailRepo patientCurrentRepo;

	@Autowired
	private PatientPrivateDetailRepo patientPrivateRepo;

	@Autowired
	private PatientFamilyRepo patientFamilyRepo;

	public void registerPatientDetail(Patient patientDetail) {

		patientCurrentRepo.save(patientDetail);
	}

	public void registerPatientPrivateDetail(PatientPrivateDetail patientPrivateDetail) {
		patientPrivateRepo.save(patientPrivateDetail);

	}

	public Patient patientEnquiryById(int id) {
		return patientCurrentRepo.findOne(id);
	}

	public void registerPatientFamilyRelation(PatientFamilyRelation familyRelationDetail) {
		patientFamilyRepo.save(familyRelationDetail);

	}

	public List<Patient> patientEnquiryByName(String fName) {
		return patientCurrentRepo.findByfirstName(fName);

	}

	public void updatePatientDetail(Patient patient) {
		Patient updatePatient = patientCurrentRepo.findOne(patient.getPatientId());

		updatePatient.setFirstName(patient.getFirstName());
		updatePatient.setLastName(patient.getLastName());
		updatePatient.setGender(patient.getGender());
		updatePatient.setNationalRegNo(patient.getNationalRegNo());
		updatePatient.setFamilyPhysician(patient.getFamilyPhysician());
		updatePatient.setComment(patient.getComment());
		patientCurrentRepo.save(updatePatient);

	}

	public void updatePatientPrivateDetail(PatientPrivateDetail privateDetail) {
		PatientPrivateDetail updatePatientPrivateDetail = patientPrivateRepo.findOne(privateDetail.getId());
		updatePatientPrivateDetail.setAddress(privateDetail.getAddress());
		updatePatientPrivateDetail.setCity(privateDetail.getCity());
		updatePatientPrivateDetail.setCompany(privateDetail.getCompany());
		updatePatientPrivateDetail.setCountry(privateDetail.getCountry());
		updatePatientPrivateDetail.setEmail(privateDetail.getEmail());
		updatePatientPrivateDetail.setFax(privateDetail.getFax());
		updatePatientPrivateDetail.setMobile(privateDetail.getMobile());
		updatePatientPrivateDetail.setTelephone(privateDetail.getTelephone());
		updatePatientPrivateDetail.setSocialMedia(privateDetail.getSocialMedia());
		updatePatientPrivateDetail.setProfession(privateDetail.getProfession());
		updatePatientPrivateDetail.setComment(privateDetail.getComment());
		patientPrivateRepo.save(updatePatientPrivateDetail);

	}

	public void updateFamilyRelation(PatientFamilyRelation familyRelation) {

		PatientFamilyRelation updatePatientFamilyRelation = patientFamilyRepo.findOne(familyRelation.getId());
		updatePatientFamilyRelation.setPatientRelationId(familyRelation.getPatientRelationId());
		updatePatientFamilyRelation.setRelationtype(familyRelation.getRelationtype());

		patientFamilyRepo.save(updatePatientFamilyRelation);

	}

	/*
	 * public void patientEnquiryByName() {
	 * 
	 * }
	 */

}
