package com.vanand

class Surgery {

	String name;
	String address;
	String postcode;
	Integer telephone;
	Integer numberOfPatients;
	String description;
	String openingTime;


    static constraints = {
	
	name nullable: false
	name blank: false
	
	address nullable: false
	address blank: false
	
	postcode nullable: false
	postcode blank: false
	postcode minSize:5
	postcode maxSize:7

	telephone nullable: false
	telephone blank: false
	telephone min:11
	telephone max:11

	numberOfPatients nullable: false
	numberOfPatients blank: false
	numberOfPatients max:50

	description nullable: false
	description blank: false
	description maxSize: 5000
	description widget:'textarea'
	
	openingTime nullable: false
	openingTime blank: false
	

    }
}
