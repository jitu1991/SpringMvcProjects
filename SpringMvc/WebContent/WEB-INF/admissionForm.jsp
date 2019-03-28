 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<h1>${headerMessage}</h1>
<h1>Student Admission Form</h1>
<form:errors path="student.*"/>
<form action="/SpringMvc/submit" method="post">
	<table>
	<tr>
	<td>Student Name:</td>
	<td><input type="text" name="studentName"/></td>
	</tr>
	<tr>
	<td>Country:</td>
	<td><input type="text" name="country"/></td>
	</tr>
	<tr>
	<td>DOB:</td>
	<td><input type="text" name="dob"/></td>
	</tr>
	<tr>
	<td>Mobile:</td>
	<td><input type="text" name="mobile"/></td>
	</tr>
	<tr>
	<td>Skills:</td>
	<td><select name="skills" multiple>
				<option value="c">C</option>
				<option value="java">Java</option>
				<option value="db">DB</option>
	</select></td>
	</tr>
	<tr>
	<td colspan="2">Student Address</td>
	</tr>
	<tr>
	<td>City</td>
	<td><input type="text" name="address.city"/></td>
	</tr>
	<tr>
	<td>State</td>
	<td><input type="text" name="address.state"/></td>
	</tr>
	<tr>
	<td><input type="submit" value="Submit"/></td>
	<td/>
	</tr>
	</table>
</form>
</body></html>