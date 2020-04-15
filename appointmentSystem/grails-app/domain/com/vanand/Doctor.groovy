package com.vanand

class Doctor {

	String fullName;
	String qualification;
	String position;
	String doctorEmail;
	String password;
	String doctorOffice;
	Integer doctorPhone;
	String bio;

    static constraints = {

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

    }
}
