<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL core 태그 예제 - if, choose, when, otherwise</h3>
	<c:set var = "country" value = "${'korea' }"/>
	<c:if test = "${country != null }">
		국가명 : <c:out value = "${country }"/><br>
	</c:if>
	
	<c:choose>
		<c:when test = "${country == 'korea' }">
			<p><c:out value = "${country }"/>의 겨울은 춥다.
		</c:when>
		<c:when test = "${country == 'Canada' }">
			<p><c:out value = "${country }"/>의 겨울은 너무 춥다.
		</c:when>
		<c:otherwise>
			<p>그 외의 나라들은 알 수 없다.
		</c:otherwise>
	</c:choose>
</body>
</html>