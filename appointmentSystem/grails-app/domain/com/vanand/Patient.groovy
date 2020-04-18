package com.vanand

class Patient {

// Below is the attributes for Patient domain class

	String patientID;
	String patientName;
	String patientAddress;
	String patientResidence;
	Date patientDob;
	Date dateRegistered;
	String patientPhone;
// One to one relationship with appointment as one patient can only have one appointment
	Appointment appointment;


// Below are the Domain class relationships
/* Many to many with surgery as one patient could be with many surgeries and one surgery can have many patients with static belonging to surgery*/
/* Many to many with doctor as one doctor can have many patients but one patient can have many doctors with static belonging to doctor*/
/* One to many with prescription as a patient can have many prescriptions but one prescription belongs to one patient*/

	static hasMany=[surgeries:Surgery, doctors:Doctor, prescriptions:Prescription]
	static belongsTo=[Surgery, Doctor]

// Below returns the name of the Patient

	String toString(){
		return patientName
	}


    static constraints = {

// Below is the constarints for the Patient domain class

	patientID nullable: false
	patientID blank: false
	patientID unique: true

	patientName nullable: false
	patientName blank: false

	patientAddress nullable: false
	patientAddress blank: false

	patientResidence nullable: false
	patientResidence blank: false

	patientDob nullable: false
	patientDob blank: false

	dateRegistered nullable: false
	dateRegistered blank: false

	patientPhone nullable: false
	patientPhone blank: false
	patientPhone minSize:11
	patientPhone maxSize:11

    }
}
