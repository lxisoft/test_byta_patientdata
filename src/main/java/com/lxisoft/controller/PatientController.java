package com.lxisoft.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lxisoft.entity.Patient;
import com.lxisoft.entity.PatientFamilyRelation;
import com.lxisoft.entity.PatientPrivateDetail;
import com.lxisoft.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "registercurrentdetail")
	public void setCurrentDetails(Patient patientCurrentDetail) {
		patientService.registerPatientDetail(patientCurrentDetail);
	}

	@RequestMapping(value = "registerprivatedetail")
	public void setPrivateDetails(PatientPrivateDetail patientPrivateDetail) {
		patientService.registerPatientPrivateDetail(patientPrivateDetail);
	}

	@RequestMapping(value = "registerfamilydetail")
	public void setFamilyDetail(PatientFamilyRelation familyDetail) {
		patientService.registerPatientFamilyRelation(familyDetail);
	}

	/*
	 * @RequestMapping(value="Enquirybyid") public String getpatient(int id){
	 * 
	 * 
	 * String
	 * s=patientService.patientEnquiryById(id).getPrivateDetail().getCountry();
	 * return "sucess"+s;
	 * 
	 * }
	 */
	@RequestMapping("enquirybyfirstname")
	public List<Patient> getPatient(String fName) {

		return patientService.patientEnquiryByName(fName);
	}

	@RequestMapping("updatecurrentdetails")
	public void setPatientCurrentUpdation(Patient patient) {

		patientService.updatePatientDetail(patient);
	}

	@RequestMapping("updateprivatedetails")
	public void setPatientPrivateUpdation(PatientPrivateDetail privateDetail) {

		patientService.updatePatientPrivateDetail(privateDetail);
	}

	@RequestMapping("updatefamilyrelation")
	public void setFamilyRelationUpdation(PatientFamilyRelation familyRelation) {

		patientService.updateFamilyRelation(familyRelation);
	}
}
