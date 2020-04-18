package com.vanand

class Nurse {

// Below is the attributes for Nurse domain class

	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	String nursePhone;
/* One to many with surgery as a nurse can only be associated with one surgery*/
	Surgery surgeryNurse;


// Below are the Domain class relationships
/* Many to many with doctor as one doctor can work with many nurses and one nurse can work with many doctors with the static belonging to the doctor domain class*/

	static hasMany=[doctors:Doctor]
	static belongsTo=[Doctor]


// Below returns the name of the Nurse

	String toString(){
		return nurseName
	}

    static constraints = {

// Below is the constarints for the Nurse domain class

	nurseName nullable: false
	nurseName blank: false

	qualifications nullable: false
	qualifications blank: false

	nurseEmail nullable: false
	nurseEmail blank: false
	nurseEmail email:true

	nurseOffice nullable: false
	nurseOffice blank: false

	nursePhone nullable: false
	nursePhone blank: false
	nursePhone minSize:11
	nursePhone maxSize:11

	surgeryNurse nullable: false
	surgeryNurse blank: false

    }
}
