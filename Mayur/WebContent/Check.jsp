
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String uname=request.getParameter("t1");
	String pass=request.getParameter("t2");
%>	

<%
if(!uname.equals("BatMan") && !pass.equals("hello"))
		
		{%>

<br><br>


<center><h2>Sorry !<br> You Have To Login With Correct Username and Password </h2></center><br><br>

<center><a href="login.jsp"><input type="button" value="Log in"></a></center>

<% }
else	
{%>
	 You Have Login Sucessfully
	 <jsp:forward page="homepage.jsp"></jsp:forward>
	 
<%} %>

</body>
</html>