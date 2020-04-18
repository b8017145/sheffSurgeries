package com.vanand

class Appointment {

// Below is the attributes for Appointment domain class

	String appName;
	Integer appID;
	Date appDate;
	String appTime;
	Integer appDurationMins;
	String roomNumber;
/* One to many with doctor as a doctor can have many appointments but one appointment belongs to one doctor*/
	Doctor docName;
/* One to many with appointment as a surgery can have many appointments but each appointment is unique to the surgery*/
	Surgery surgeryAppointment;
	

// Below returns the name of the appointment

	String toString(){
		return appName
	}


    static constraints = {

// Below is the constarints for the Appointment domain class

	appName nullable: false
	appName blank: false

	appID nullable: false
	appID blank: false
	appID unique: true
	appID min:1

	appDate nullable: false
	appDate blank: false

	appTime nullable: false
	appTime blank: false

	appDurationMins nullable: false
	appDurationMins blank: false
	appDurationMins min:1

	roomNumber nullable: false
	roomNumber blank: false

	docName nullable: false
	docName blank: false

    }
}
