<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--11월 8일 --%>
	<h3>JSTL core 태그예제 - fortokens</h3>
	<c:forTokens var = "tech" items = "금강불괴;허공답보;열앙기공;천마군림보" delims = ";">
		<p>익혀야할 기술 : <c:out value = "${tech }"/>
	</c:forTokens>
	<c:redirect url = "jstlex01.jsp"/> 
</body>
</html>