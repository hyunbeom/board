<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${vo.getBno()}
${criteria}
<form action="modifyAction" method = "POST">
<input type="text" name="title">
<input type="text" name="content">
<input type="hidden" name = "bno" value = "${boardVO.bno}">
<input type="hidden" name = "keyword" value = "${webCriteria.keyword}">
	<input type="hidden" name = "pageno" value = "${webCriteria.pageno}">
	<div class="checkBox">
	<input type="checkbox" value="writer" name="types" ${webCriteria.isChecked("writer","")}>
	<input type="checkbox" value="title" name="types" ${webCriteria.isChecked("title","")}>
	<input type="checkbox" value="content" name="types" ${webCriteria.isChecked("content","")}>
	</div>
<button class="modifyBtn">수정</button>
</form>
<script type="text/javascript">
$(".checkBox").hide();
$modifyBtn.click(function(){
	$goList.attr("action","detail").submit();	
});
</script>
</body>
</html>