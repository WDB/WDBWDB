
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>
			<p>표현식 = 값
		</li>
		<li>
			<p>\${2 + 5} = ${2 + 5}
		</li>
		<li>
			<p>\${4/5 } = ${4/5 }
		</li>
		<li>
			<p>\${7 mod 5 } = ${7 mod 5 }
		</li>
		<li>
			<p>\${2<3 } = ${2<3 }
		</li>
		<li>
			<p>\${3.1 le 3.2 } = ${3.1 le 3.2 }
		</li>
		<li>
			<p>\${(5>3)?5:3 } = ${(5>3)?5:3 }
		</li>
	</ul>
</body>
</html>