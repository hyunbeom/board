<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
<<<<<<< HEAD
${vo}Í
=======
${vo.getContent()}
>>>>>>> FETCH_HEAD


<form action="modify" method="GET">
<input type = "hidden" value = "${vo.getBno()}" name = "bno">
<input type="submit" value="전송">
</form>

<form action="delete" method="POST">
<input type = "hidden" value = "${vo.getBno()}" name = "bno">
<input type="submit" value="삭제">


</form>
</body>
</html>