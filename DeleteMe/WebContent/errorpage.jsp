<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
I am error page
<%
Throwable throwable = (Throwable) request
.getAttribute("javax.servlet.error.exception");
Integer statusCode = (Integer) request
.getAttribute("javax.servlet.error.status_code");
String servletName = (String) request
.getAttribute("javax.servlet.error.servlet_name");
if (servletName == null) {
servletName = "Unknown";
}
String requestUri = (String) request
.getAttribute("javax.servlet.error.request_uri");
if (requestUri == null) {
requestUri = "Unknown";
}
%>
<%= statusCode%>
<%= requestUri%>
<%= servletName%>
</body>
</html>