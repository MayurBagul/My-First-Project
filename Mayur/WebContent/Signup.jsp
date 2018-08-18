<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="cal.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form name="myform" action="sign" method="post">

<fieldset align="center">


<legend align="center"><h3>Sign Up</h3></legend><br>
<center>

First Name : &nbsp;&nbsp;<input type="text" name="fname">
<br><br>

Last Name : &nbsp;&nbsp;<input type="text" name="lname">
<br><br>

Email ID :  &nbsp;&nbsp;<input type="email" name="eid"><br><br>


UserName : &nbsp;&nbsp;<input type="text" name="uname">
<br><br>

Password : &nbsp;&nbsp;<input type="password" name="pass"><br>
<br><br>
<input align="center" type="submit" value="submit">
<br>


<br>
</center>
</fieldset>
</form>
<br>
<center><a href="MainPage.jsp">www.TechMayur.com</a></center>

</body>
</html>