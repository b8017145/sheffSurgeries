package appointmentsystem

class BootStrap {

    def init = { servletContext ->

	def surgery1=new com.vanand.Surgery(
	name:'City Centre Doctors',
	address:'1 Sheffield Road',
	postcode:'S1 8CA',
	telephone:'01412852174',
	numberOfPatients:'21',
	description:'Doctors in the city centre',
	openingTime:'9:00-18:00'
	).save()

	def surgery2=new com.vanand.Surgery(
	name:'Hallam Doctors',
	address:'34 Hallam Street',
	postcode:'S51 9CA',
	telephone:'01412345678',
	numberOfPatients:'40',
	description:'Doctors in the city centre',
	openingTime:'8:00-17:00'
	).save()


	def doc1=new com.vanand.Doctor(
	fullName:'Dr Varun Anand',
	qualification:'Msc Medicine',
	position:'GP',
	doctorEmail:'vanand@gmail.com',
	password:'Vanand',
	doctorOffice:'32',
	doctorPhone:'01412643272',
	bio:'General Doctor',
	registeredSurgery:surgery1
	).save()
	
	def doc2=new com.vanand.Doctor(
	fullName:'Dr Tom Whitt',
	qualification:'Msc Medical Research',
	position:'GP, Surgeon',
	doctorEmail:'twhitt@hotmail.com',
	password:'whitty123',
	doctorOffice:'30',
	doctorPhone:'01412643271',
	bio:'General Doctor and surgeon',
	registeredSurgery:surgery1
	).save()


	def recep1=new com.vanand.Receptionist(
	recepName:'Edward Smith',
	recepEmail:'esmith@gmail.com',
	recepUsername:'EdSmith',
	recepPassword:'Smithy123',
	recepPhone:'01412647284',
	surgeryRecep:surgery1
	).save()

	def recep2=new com.vanand.Receptionist(
	recepName:'Steve Rogers',
	recepEmail:'stever@gmail.com',
	recepUsername:'SteveRogers',
	recepPassword:'ste123',
	recepPhone:'01412938475',
	surgeryRecep:surgery1
	).save()


	def nurse1=new com.vanand.Nurse(
	nurseName:'Alan Dunk',
	qualifications:'BSc Carer',
	nurseEmail:'adunk@gmail.com',
	nurseOffice:'24',
	nursePhone:'07291847162',
	surgeryNurse:surgery1
	).save()

	def nurse2=new com.vanand.Nurse(
	nurseName:'Ben Foster',
	qualifications:'A-level Carer',
	nurseEmail:'benfost@gmail.com',
	nurseOffice:'27',
	nursePhone:'07102983745',
	surgeryNurse:surgery1
	).save()


	def app1=new com.vanand.Appointment(
	appID:'1',
	appDate:new Date('05/05/2020'),
	appTime:'14:00',
	appDurationMins:'20',
	roomNumber:'32',
	docName:doc1,
	surgeryAppointment:surgery1
	).save()

	def app2=new com.vanand.Appointment(
	appID:'2',
	appDate:new Date('06/06/2020'),
	appTime:'12:00',
	appDurationMins:'20',
	roomNumber:'30',
	docName:doc2,
	surgeryAppointment:surgery2
	).save()


	def pat1=new com.vanand.Patient(
	patientID:'1',
	patientName:'Chris Evans',
	patientAddress:'23 Regent Street',
	patientResidence:'Sheffield',
	patientDob:new Date('03/03/1982'),
	dateRegistered:new Date('04/04/2020'),
	patientPhone:'07402345235',
	appointment:app1
	).save()
	
	def pat2=new com.vanand.Patient(
	patientID:'2',
	patientName:'Robert Tim',
	patientAddress:'45 Road Street',
	patientResidence:'Doncaster',
	patientDob:new Date('01/01/1975'),
	dateRegistered:new Date('02/02/2020'),
	patientPhone:'07347524625',
	appointment:app2
	).save()


	def pres1=new com.vanand.Prescription(
	pharmacyName:'City Centre',
	prescripNumber:'1',
	medicine:'Paracetemol',
	totalCost:'23.33',
	dateIssued:new Date('07/07/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:doc1,
	patientPrescription:pat1
	).save()

	def pres2=new com.vanand.Prescription(
	pharmacyName:'North Wicker',
	prescripNumber:'2',
	medicine:'Ibroprophen',
	totalCost:'12.62',
	dateIssued:new Date('08/08/2020'),
	patientPaying:'No',
	prescriptionByDoctor:doc1,
	patientPrescription:pat2
	).save()


    }
    def destroy = {
    }
}
