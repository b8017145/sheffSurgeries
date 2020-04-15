package com.vanand

class Appointment {

	Integer appID;
	Date appDate;
	Date appTime;
	Integer appDuration;
	String roomNumber;

    static constraints = {

	appID nullable: false
	appID blank: false
	appID unique: true

	appDate nullable: false
	appDate blank: false

	appTime nullable: false
	appTime blank: false

	appDuration nullable: false
	appDuration blank: false

	roomNumber nullable: false
	roomNumber blank: false

    }
}
