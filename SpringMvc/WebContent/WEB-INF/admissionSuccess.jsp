<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage}</h1>
<h1>${msg}</h1>
<h2>Details Submitted:</h2>
<table>
<tr>
<td>Student Name</td>
<td>${student.studentName}</td>
</tr>
<tr>
<td>Country</td>
<td>${student.country}</td>
</tr>
<tr>
<td>DOB</td>
<td>${student.dob}</td>
</tr>
<tr>
<td>Mobile</td>
<td>${student.mobile}</td>
</tr>
<tr>
<td>Skills</td>
<td>${student.skills}</td>
</tr>
<tr>
<td>City</td>
<td>${student.address.city}</td>
</tr>
<tr>
<td>State</td>
<td>${student.address.state}</td>
</tr>
</table>
</body>
</html>