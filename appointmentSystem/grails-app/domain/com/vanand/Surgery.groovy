package com.vanand

class Surgery {

// Below is the attributes for the Surgery domain class

	String name;
	String address;
	String postcode;
	String telephone;
	Integer numberOfPatients;
	String description;
	String openingTime;

// Below are the Domain class relationships
/* One to many with appointment as a surgery can have many appointments but each appointment is unique to the surgery*/
/* Many to many with patient as one patient could be with many surgeries and one surgery can have many patients*/
/* One to many with nurse as a surgery can have many nurses and one nurse is associated with one surgery*/
/* One to many with receptionist as a surgery can have many receptionists and one receptionist is associated with one surgery*/
/* One to many with doctor as a surgery can have many doctors but one doctor is registered to one surgery*/

	static hasMany=[appointments:Appointment, patients:Patient, nurses:Nurse, receptionists:Receptionist, doctors:Doctor]


// Below returns the name of the Surgery

	String toString(){
		return name
	}


    static constraints = {

// Below is the constarints for Doctor domain class

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
