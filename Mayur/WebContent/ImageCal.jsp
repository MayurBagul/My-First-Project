<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>

<h1 align="center">Welcome To HomePage</h1><br>
<hr>

<h2 align="center">Image Calculator</h2>
<h3 align="center"> Click on Below Image </h3>

<center>
<img src="house.jpg" alt="Welcome To www.Mayur.com" width="400" height="200" onclick="clickimg()">
<img src="Koala.jpg" alt="Welcome To www.Mayur.com" width="400" height="200" onclick="clickimg()">
<img src="Lighthouse.jpg" alt="Welcome To www.Mayur.com" width="400" height="200" onclick="clickimg()">
<img src="Penguins.jpg" alt="Welcome To www.Mayur.com" width="400" height="200" onclick="clickimg()">
</center>
<br></br>
<hr><br>
<center><a href="MainPage.jsp">www.TechMayur.Com</a></center>

<script>

function clickimg()
{

   var num1= prompt("Enter First Number");
   
   var num2= prompt("Enter Second number");
	
	window.location="Addition.jsp?num1="+num1+"&num2="+num2;
}



</script>

</body>
</html>