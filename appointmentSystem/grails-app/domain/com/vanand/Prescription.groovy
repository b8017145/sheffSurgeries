package com.vanand

class Prescription {

// Below is the attributes for Prescription domain class

	String pharmacyName;
	Integer prescripNumber;
	String medicine;
	Double totalCost;
	Date dateIssued;
	Boolean patientPaying;
/* One to many with doctor as one doctor can have many prescriptions but a prescription is unique to a doctor*/
	Doctor prescriptionByDoctor;
/* One to many with patient as a patient can have many prescriptions but one prescription belongs to one patient*/
	Patient patientPrescription;


// Below returns the name of the medicine precribed

	String toString(){
		return medicine
	}


    static constraints = {

// Below is the constarints for the Prescription domain class

	pharmacyName nullable: false
	pharmacyName blank: false

	prescripNumber nullable: false
	prescripNumber blank: false
	prescripNumber unique:true
	prescripNumber min:1

	medicine nullable: false
	medicine blank: false

	totalCost nullable: false
	totalCost blank: false
	totalCost scale:2

	dateIssued nullable: false
	dateIssued blank: false

	patientPaying nullable: false
	patientPaying blank: false

	prescriptionByDoctor nullable: false
	prescriptionByDoctor blank: false



    }
}
