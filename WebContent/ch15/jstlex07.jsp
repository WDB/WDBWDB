<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c"  uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL fmt 태그예제 - bundle,message</h3>
	<fmt:setLocale value = "ko"/> 
	<fmt:bundle basename="ch15.bundle.testbundle">
		<fmt:message key = "name"/>
		<fmt:message key = "message" var = "msg"/>
		<p><c:out value = "${msg }"/>
	</fmt:bundle>
</body>
</html>