package com.vanand

class Doctor {

// Below is the attributes for Doctor domain class

	String fullName;
	String qualification;
	String position;
	String doctorEmail;
	String password;
	String doctorOffice;
	String doctorPhone;
	String bio;
/* One to many with surgery as a surgery can have many doctors but one doctor is registered to one surgery*/
	Surgery registeredSurgery;

// Below are the Domain class relationships
/* One to many with appointment as a doctor can have many appointments but one appointment belongs to one doctor*/
/* Many to many with patient as one doctor can have many patients but one patient can have many doctors*/
/* Many to many with nurse as one doctor can work with many nurses and one nurse can work with many doctors*/
/* One to many with prescription as one doctor can have many prescriptions but a prescription is unique to a doctor*/

	static hasMany=[appointments:Appointment, patients:Patient, nurses:Nurse, prescriptions:Prescription]


// Below returns the name of the Doctor

	String toString(){
		return fullName
	}
	 

    static constraints = {

// Below is the constarints for the Doctor domain class

	fullName nullable: false
	fullName blank: false

	qualification nullable: false
	qualification blank: false

	position nullable: false
	position blank: false

	doctorEmail nullable: false
	doctorEmail blank: false
	doctorEmail email:true

	password nullable: false
	password blank: false
	password minSize:6

	doctorOffice nullable: false
	doctorOffice blank: false

	doctorPhone nullable: false
	doctorPhone blank: false
	doctorPhone minSize:11
	doctorPhone maxSize:11

	bio nullable: false
	bio blank: false
	bio maxSize: 5000
	bio widget:'textarea'

	registeredSurgery nullable: false
	registeredSurgery blank: false

    }
}
