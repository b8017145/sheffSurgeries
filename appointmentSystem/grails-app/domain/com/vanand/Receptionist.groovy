package com.vanand

class Receptionist {

// Below is the attributes for Receptionist domain class

	String recepName;
	String recepEmail;
	String recepUsername;
	String recepPassword;
	String recepPhone;
/* One to many with surgert as a surgery can have many receptionists and one receptionist is associated with one surgery*/
	Surgery surgeryRecep;

// Below returns the name of the receptionist

	String toString(){
		return recepName
	}

    static constraints = {

// Below is the constarints for the Receptionist domain class

	recepName nullable: false
	recepName blank: false

	recepEmail nullable: false
	recepEmail blank: false
	recepEmail email:true

	recepUsername nullable: false
	recepUsername blank: false

	recepPassword nullable: false
	recepPassword blank: false
	recepPassword minSize:6

	recepPhone nullable: false
	recepPhone blank: false
	recepPhone minSize:11
	recepPhone maxSize:11

	surgeryRecep nullable: false
	surgeryRecep blank: false

    }
}
