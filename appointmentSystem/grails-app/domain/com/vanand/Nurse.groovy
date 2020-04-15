package com.vanand

class Nurse {

	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	Integer nursePhone;

    static constraints = {

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

    }
}
