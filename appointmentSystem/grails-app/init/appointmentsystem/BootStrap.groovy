package appointmentsystem

class BootStrap {

    def init = { servletContext ->

	def cityCenter=new com.vanand.Surgery(
	name:'City Centre Doctors',
	address:'1 Sheffield Road',
	postcode:'S1 8CA',
	telephone:'01412852174',
	numberOfPatients:'21',
	description:'Doctors in the city centre',
	openingTime:'9:00-18:00'
	).save()

	def sheffHallam=new com.vanand.Surgery(
	name:'Hallam Doctors',
	address:'34 Hallam Street',
	postcode:'S51 9CA',
	telephone:'01412345678',
	numberOfPatients:'40',
	description:'Doctors in Sheffield Hallam University',
	openingTime:'8:00-17:00'
	).save()


	def drVA=new com.vanand.Doctor(
	fullName:'Dr Varun Anand',
	qualification:'Msc Medicine',
	position:'GP',
	doctorEmail:'vanand@gmail.com',
	password:'Vanand',
	doctorOffice:'32',
	doctorPhone:'01412643272',
	bio:'General Doctor',
	registeredSurgery:cityCenter
	).save()
	
	def drTW=new com.vanand.Doctor(
	fullName:'Dr Tom Whittaker',
	qualification:'Msc Medical Research',
	position:'GP, Surgeon',
	doctorEmail:'twhitt@hotmail.com',
	password:'whitty123',
	doctorOffice:'30',
	doctorPhone:'01412643271',
	bio:'General Doctor and surgeon',
	registeredSurgery:cityCenter
	).save()

	def drBA=new com.vanand.Doctor(
	fullName:'Dr Brian Anderson',
	qualification:'Msc Medical Research',
	position:'GP, Surgeon',
	doctorEmail:'banderson@hotmail.com',
	password:'andy6424',
	doctorOffice:'12',
	doctorPhone:'01412643271',
	bio:'General Doctor and surgeon',
	registeredSurgery:sheffHallam
	).save()

	def drRS=new com.vanand.Doctor(
	fullName:'Dr Richard Sanders',
	qualification:'Msc Medical Research',
	position:'GP, Surgeon',
	doctorEmail:'richard123@gmail.com',
	password:'Ricky2306',
	doctorOffice:'27',
	doctorPhone:'01412643271',
	bio:'General Doctor',
	registeredSurgery:sheffHallam
	).save()


	def recepES=new com.vanand.Receptionist(
	recepName:'Edward Smith',
	recepEmail:'esmith@gmail.com',
	recepUsername:'EdSmith',
	recepPassword:'Smithy123',
	recepPhone:'01412647284',
	surgeryRecep:cityCenter
	).save()

	def recepSR=new com.vanand.Receptionist(
	recepName:'Steve Rogers',
	recepEmail:'stever@gmail.com',
	recepUsername:'SteveRogers',
	recepPassword:'ste123',
	recepPhone:'01412938475',
	surgeryRecep:cityCenter
	).save()

	def recepGT=new com.vanand.Receptionist(
	recepName:'Gary Taylor',
	recepEmail:'gt1973@gmail.com',
	recepUsername:'GaryTaylor',
	recepPassword:'Gt1973',
	recepPhone:'01412938475',
	surgeryRecep:sheffHallam
	).save()

	def recepDW=new com.vanand.Receptionist(
	recepName:'David Wood',
	recepEmail:'woody456@gmail.com',
	recepUsername:'DavidWood',
	recepPassword:'Woody123',
	recepPhone:'01412938475',
	surgeryRecep:sheffHallam
	).save()


	def nurseAD=new com.vanand.Nurse(
	nurseName:'Alan Dunk',
	qualifications:'BSc Carer',
	nurseEmail:'adunk@gmail.com',
	nurseOffice:'24',
	nursePhone:'07291847162',
	surgeryNurse:sheffHallam
	).save()

	def nurseBF=new com.vanand.Nurse(
	nurseName:'Ben Foster',
	qualifications:'A-level Carer',
	nurseEmail:'benfost@gmail.com',
	nurseOffice:'27',
	nursePhone:'07102983745',
	surgeryNurse:cityCenter
	).save()

	def nurseKS=new com.vanand.Nurse(
	nurseName:'Keith Smith',
	qualifications:'BSc Carer',
	nurseEmail:'ksmith331@gmail.com',
	nurseOffice:'12',
	nursePhone:'07291847162',
	surgeryNurse:sheffHallam
	).save()

	def nurseFS=new com.vanand.Nurse(
	nurseName:'Fred Hill',
	qualifications:'BSc Carer',
	nurseEmail:'freddy234@gmail.com',
	nurseOffice:'22',
	nursePhone:'07291847162',
	surgeryNurse:cityCenter
	).save()


	def app1=new com.vanand.Appointment(
	appName:'Back Pain',
	appID:'1',
	appDate:new Date('05/05/2020'),
	appTime:'14:00',
	appDurationMins:'20',
	roomNumber:'32',
	docName:drVA,
	surgeryAppointment:cityCenter
	).save()

	def app2=new com.vanand.Appointment(
	appName:'Migraines',
	appID:'2',
	appDate:new Date('06/06/2020'),
	appTime:'12:00',
	appDurationMins:'20',
	roomNumber:'30',
	docName:drVA,
	surgeryAppointment:cityCenter
	).save()

	def app3=new com.vanand.Appointment(
	appName:'Chest Pain',
	appID:'3',
	appDate:new Date('06/07/2020'),
	appTime:'11:00',
	appDurationMins:'20',
	roomNumber:'12',
	docName:drTW,
	surgeryAppointment:cityCenter
	).save()

	def app4=new com.vanand.Appointment(
	appName:'Knee Pain',
	appID:'4',
	appDate:new Date('06/07/2020'),
	appTime:'12:00',
	appDurationMins:'20',
	roomNumber:'12',
	docName:drTW,
	surgeryAppointment:cityCenter
	).save()

	def app5=new com.vanand.Appointment(
	appName:'Shoulder Pain',
	appID:'5',
	appDate:new Date('06/07/2020'),
	appTime:'15:00',
	appDurationMins:'15',
	roomNumber:'33',
	docName:drBA,
	surgeryAppointment:sheffHallam
	).save()


	def app6=new com.vanand.Appointment(
	appName:'Blood Test',
	appID:'6',
	appDate:new Date('03/05/2020'),
	appTime:'09:00',
	appDurationMins:'30',
	roomNumber:'33',
	docName:drBA,
	surgeryAppointment:sheffHallam
	).save()


	def app7=new com.vanand.Appointment(
	appName:'Nose Bleeds',
	appID:'7',
	appDate:new Date('13/05/2020'),
	appTime:'12:00',
	appDurationMins:'20',
	roomNumber:'25',
	docName:drRS,
	surgeryAppointment:sheffHallam
	).save()

	def app8=new com.vanand.Appointment(
	appName:'Check up',
	appID:'8',
	appDate:new Date('08/05/2020'),
	appTime:'15:00',
	appDurationMins:'30',
	roomNumber:'26',
	docName:drRS,
	surgeryAppointment:sheffHallam
	).save()


	def pat1=new com.vanand.Patient(
	patientID:'1',
	patientName:'Chris Evans',
	patientAddress:'23 Regent Street',
	patientResidence:'Sheffield',
	patientDob:new Date('03/03/1978'),
	dateRegistered:new Date('04/04/2020'),
	patientPhone:'07402345235',
	appointment:app1
	).save()
	
	def pat2=new com.vanand.Patient(
	patientID:'2',
	patientName:'Robert Tim',
	patientAddress:'45 Road Street',
	patientResidence:'Doncaster',
	patientDob:new Date('01/01/1989'),
	dateRegistered:new Date('02/02/2020'),
	patientPhone:'07347524625',
	appointment:app2
	).save()

	def pat3=new com.vanand.Patient(
	patientID:'3',
	patientName:'Bruce Roberts',
	patientAddress:'1 Grove Street',
	patientResidence:'Sheffield',
	patientDob:new Date('03/06/1998'),
	dateRegistered:new Date('04/02/2020'),
	patientPhone:'07347524625',
	appointment:app3
	).save()

	def pat4=new com.vanand.Patient(
	patientID:'4',
	patientName:'Charles Kelly',
	patientAddress:'20 London Road',
	patientResidence:'Sheffield',
	patientDob:new Date('04/04/1985'),
	dateRegistered:new Date('05/02/2020'),
	patientPhone:'07347524625',
	appointment:app4
	).save()

	def pat5=new com.vanand.Patient(
	patientID:'5',
	patientName:'Alan Thomas',
	patientAddress:'20 Sefton Road',
	patientResidence:'Sheffield',
	patientDob:new Date('05/05/1975'),
	dateRegistered:new Date('05/02/2020'),
	patientPhone:'07347524625',
	appointment:app5
	).save()

	def pat6=new com.vanand.Patient(
	patientID:'6',
	patientName:'Phil Allen',
	patientAddress:'20 Manchester Road',
	patientResidence:'Sheffield',
	patientDob:new Date('03/05/1979'),
	dateRegistered:new Date('05/02/2020'),
	patientPhone:'07356763625',
	appointment:app6
	).save()

	def pat7=new com.vanand.Patient(
	patientID:'7',
	patientName:'Kevin Ross',
	patientAddress:'20 Newcastle Road',
	patientResidence:'Sheffield',
	patientDob:new Date('04/04/1977'),
	dateRegistered:new Date('05/02/2020'),
	patientPhone:'07203829392',
	appointment:app7
	).save()

	def pat8=new com.vanand.Patient(
	patientID:'8',
	patientName:'Scott Nelson',
	patientAddress:'20 Birmingham Road',
	patientResidence:'Sheffield',
	patientDob:new Date('09/09/1980'),
	dateRegistered:new Date('05/02/2020'),
	patientPhone:'07203829392',
	appointment:app8
	).save()


	def pres1=new com.vanand.Prescription(
	pharmacyName:'City Centre',
	prescripNumber:'1',
	medicine:'Paracetemol',
	totalCost:'23.33',
	dateIssued:new Date('07/07/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:drVA,
	patientPrescription:pat1
	).save()

	def pres2=new com.vanand.Prescription(
	pharmacyName:'City Centre',
	prescripNumber:'2',
	medicine:'Inhalor',
	totalCost:'12.30',
	dateIssued:new Date('07/07/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:drVA,
	patientPrescription:pat1
	).save()

	def pres3=new com.vanand.Prescription(
	pharmacyName:'North Wicker',
	prescripNumber:'3',
	medicine:'Ibroprophen',
	totalCost:'12.62',
	dateIssued:new Date('08/08/2020'),
	patientPaying:'No',
	prescriptionByDoctor:drVA,
	patientPrescription:pat2
	).save()

	def pres4=new com.vanand.Prescription(
	pharmacyName:'North Wicker',
	prescripNumber:'4',
	medicine:'Co-Codemmol',
	totalCost:'7.50',
	dateIssued:new Date('03/08/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:drTW,
	patientPrescription:pat3
	).save()

	def pres5=new com.vanand.Prescription(
	pharmacyName:'North Wicker',
	prescripNumber:'5',
	medicine:'Eczema Cream',
	totalCost:'10.00',
	dateIssued:new Date('03/08/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:drBA,
	patientPrescription:pat6
	).save()

	def pres6=new com.vanand.Prescription(
	pharmacyName:'North Wicker',
	prescripNumber:'6',
	medicine:'Inhalor',
	totalCost:'12.00',
	dateIssued:new Date('03/08/2020'),
	patientPaying:'Yes',
	prescriptionByDoctor:drRS,
	patientPrescription:pat8
	).save()


    }
    def destroy = {
    }
}
