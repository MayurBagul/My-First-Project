<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String s=request.getParameter("t1");
String r=request.getParameter("t2");
session.setAttribute("s1",s);
session.setAttribute("s2",r);
response.sendRedirect("output.jsp");
%>
</body>
</html>