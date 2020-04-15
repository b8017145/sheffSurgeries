package com.vanand

class Patient {

	String patientID;
	String patientName;
	String patientAddress;
	String patientResidence;
	Date patientDob;
	Date dateRegistered;
	Integer patientPhone;


    static constraints = {

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
