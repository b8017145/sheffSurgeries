package com.vanand

class Receptionist {

	String recepName;
	String recepEmail;
	String recepUsername;
	String recepPassword;
	Integer recepPhone;

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
	recepPhone min:11
	recepPhone max:11

    }
}
