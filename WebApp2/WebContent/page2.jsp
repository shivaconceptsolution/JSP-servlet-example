<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int a,b,c;  %>

<div>
<%

a=1000;
b=2000;
c=a+b;


%>
</div>

<div>

Result is <%= c %>

</div>
<div>

<%

a=1000;
b=20;
c=a*b;


%>

</div>

<div>

Result is <%= c %>

</div>

</body>
</html>