<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int m = Integer.parseInt(request.getParameter("marks"));
%>
<h3> Your Grade is : </h3>
<br>
<% 
switch(m){
	case 10	: 	out.println("S");
				break;
	case 9	: 	out.println("A");
				break;
	case 8	: 	out.println("B");
				break;
	case 7	: 	out.println("C");
				break;
	case 6	: 	out.println("D");
				break;
	case 5	: 
	case 4	: 	out.println("E");
				break;
	case 3	: 	
	case 2	: 	
	case 1	: 	
	case 0	: 	out.println("F");
				break;
	default	:	out.println("Invailid Marks !!");
} 
%>
</body>
</html>