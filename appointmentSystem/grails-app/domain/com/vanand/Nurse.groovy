package com.vanand

class Nurse {

	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	String nursePhone;
	Surgery surgeryNurse;

	static hasMany=[doctors:Doctor]
	static belongsTo=[Doctor]

	String toString(){
		return nurseName
	}

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

	surgeryNurse nullable: false
	surgeryNurse blank: false

    }
}
