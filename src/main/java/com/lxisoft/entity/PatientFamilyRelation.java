package com.lxisoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PatientFamilyRelation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	
	@OneToOne
	@JoinColumn(name ="patientRelationId")
	private Patient patientRelationId;
	
	
	private String relationtype;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public Patient getPatientRelationId() {
		return patientRelationId;
	}


	public void setPatientRelationId(Patient patientRelationId) {
		this.patientRelationId = patientRelationId;
	}


	public String getRelationtype() {
		return relationtype;
	}


	public void setRelationtype(String relationtype) {
		this.relationtype = relationtype;
	}
	
	
	
	
}
