<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries | Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>

	<div class="appointment" style="padding-right: 50px">
		<h3>Appointment</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="appointment" action="index">View Appointments</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="appointment" action="create">Add Appointment</g:link>
		</button>
	</div>


	<div class="doctor" style="padding-right: 50px">
		<h3>Doctor</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="doctor" action="index">View Doctors</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="doctor" action="create">Add Doctor</g:link>
		</button>
	</div>


	<div class="nurse" style="padding-right: 50px">
		<h3>Nurse</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="nurse" action="index">View Nurses</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="nurse" action="create">Add Nurse</g:link>
		</button>
	</div>


	<div class="patient" style="padding-right: 50px">
		<h3>Patient</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="patient" action="index">View Patients</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="patient" action="create">Add Patient</g:link>
		</button>
	</div>


	<div class="prescription" style="padding-right: 50px">
		<h3>Prescription</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="prescription" action="index">View Prescriptions</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="prescription" action="create">Add Prescription</g:link>
		</button>
	</div>


	<div class="receptionist" style="padding-right: 50px">
		<h3>Receptionist</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="receptionist" action="index">View Receptionists</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="receptionist" action="create">Add Receptionist</g:link>
		</button>
	</div>


	<div class="surgery" style="padding-right: 50px">
		<h3>Surgery</h3>
<p></p>
		<button type="button" class"btn btn-success">
		<g:link controller="surgery" action="index">View Surgerys</g:link>
		</button>

		<button type="button" class"btn btn-success">
		<g:link controller="surgery" action="create">Add Surgery</g:link>
		</button>
	</div>

	 <div style="padding-top: 50px">
            <asset:image src="doctors.jpg"/>
        </div>

    </section>
</div>

</body>
</html>
