<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
=======
<<<<<<< HEAD
    pageEncoding="UTF-8"%>

    <%
	request.setCharacterEncoding("UTF-8");
%>


=======
	pageEncoding="UTF-8"%>
>>>>>>> origin/master
>>>>>>> FETCH_HEAD

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
${vo}
${criteria}
=======
<<<<<<< HEAD

${vo}

${vo.getContent()}

=======
>>>>>>> origin/master
>>>>>>> FETCH_HEAD




<form action="delete" method="POST">
<input type = "hidden" value = "${vo.getBno()}" name = "bno">
<input type="submit" value="삭제">
</form>

<form class="goList">
<input type="hidden" name = "bno" value = "${boardVO.bno}"> 
	<input type="hidden" name = "keyword" value = "${webCriteria.keyword}">
	<input type="hidden" name = "pageno" value = "${webCriteria.pageno}">
	<div class="checkBox">
	<input type="checkbox" value="writer" name="types" ${webCriteria.isChecked("writer","")}>
	<input type="checkbox" value="title" name="types" ${webCriteria.isChecked("title","")}>
	<input type="checkbox" value="content" name="types" ${webCriteria.isChecked("content","")}>
	</div>
	<button class="listBtn" >목록</button>
	<button class="modifyBtn" >수정</button>
</form>

<script type="text/javascript">
$(".checkBox").hide();
var $goList = $('.goList');
var $lilstBtn = $('.listBtn');

var $modifyBtn = $('.modifyBtn');
$lilstBtn.click(function(){
	$goList.attr("action","list").submit();	
});
$modifyBtn.click(function(){
	$goList.attr("action","modify").submit();	
});

</script>


</body>
</html>