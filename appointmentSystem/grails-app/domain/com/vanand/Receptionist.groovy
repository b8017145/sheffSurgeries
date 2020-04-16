package com.vanand

class Receptionist {

	String recepName;
	String recepEmail;
	String recepUsername;
	String recepPassword;
	String recepPhone;
	Surgery surgeryRecep;

	String toString(){
		return recepName
	}

    static constraints = {

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
