<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>

<c:forEach items="${list}" var="test">
<%
   //items : model이 가지고 온 변수명
   //var   : jsp에서 사용할 변수명
%>
no = ${test.NO }<br>
subject = ${test.SUBJECT}<br>
contents = ${test.CONTENTS }<br>
</c:forEach>

</body>
</html>