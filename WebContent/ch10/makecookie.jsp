<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("id","pandora");
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		
		out.println("쿠키가 생성되었습니다.");
	%>
	
	<form method = "post" action = "usecookie.jsp">
		<table>
			<tr>
				<td><input type = "submit" value = "생성된 쿠키 확인">
		</table>
	</form>
</body>
</html>