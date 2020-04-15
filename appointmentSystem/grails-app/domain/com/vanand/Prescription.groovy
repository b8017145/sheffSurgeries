package com.vanand

class Prescription {

	String pharmacyName;
	Integer prescripNumber;
	String medicine;
	Double totalCost;
	Date dateIssued;
	Boolean patientPaying;

    static constraints = {

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

    }
}
