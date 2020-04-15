package com.vanand

class Appointment {

	Integer appID;
	Date appDate;
	String appTime;
	Integer appDuration;
	String roomNumber;

    static constraints = {

	appID nullable: false
	appID blank: false
	appID unique: true
	appID min:1

	appDate nullable: false
	appDate blank: false

	appTime nullable: false
	appTime blank: false

	appDuration nullable: false
	appDuration blank: false
	appDuration min:1

	roomNumber nullable: false
	roomNumber blank: false

    }
}
