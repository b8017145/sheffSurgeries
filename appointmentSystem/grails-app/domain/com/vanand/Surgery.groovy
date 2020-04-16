package com.vanand

class Surgery {

	String name;
	String address;
	String postcode;
	String telephone;
	Integer numberOfPatients;
	String description;
	String openingTime;
	

	static hasMany=[appointments:Appointment, patients:Patient, nurses:Nurse, receptionists:Receptionist, doctors:Doctor]

	String toString(){
		return name
	}


    static constraints = {
	
	name nullable: false
	name blank: false
	
	address nullable: false
	address blank: false
	
	postcode nullable: false
	postcode blank: false
	postcode minSize:5
	postcode maxSize:7

	telephone nullable: false
	telephone blank: false
	telephone minSize:11
	telephone maxSize:11

	numberOfPatients nullable: false
	numberOfPatients blank: false
	numberOfPatients min:1
	numberOfPatients max:50

	description nullable: false
	description blank: false
	description maxSize: 5000
	description widget:'textarea'
	
	openingTime nullable: false
	openingTime blank: false

	

    }
}
