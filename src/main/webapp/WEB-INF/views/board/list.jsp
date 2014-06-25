<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 부트스트랩 -->
<script src="//code.jquery.com/jquery.js"></script>

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="/board/resources/js/pageMaker.js"></script>
</head>
<!-- 부트스트랩  -->
<body>
<form class="list">
	<div class="boardwrap">
		<div class="table-responsive">
			<table class="table table-hover" width="100%" cellpadding="0"
				cellspacing="0" border="0">

				<tr height="1" bgcolor="#D2D2D2" style="text-align: center;">
					<td width="10%">번호</td>
					<td width="40%">제목</td>
					<td width="10%">작성자</td>
					<td width="10%">조회</td>
					<td width="30%">시간</td>
				</tr>

			<c:forEach var ="list" items = "${boardList}">
			
			<form>
				<tr>
					<td width="10%" align="center">${list.getBno()}</td>
					<td width="40%" onclick="_goPage(${list.getBno()})">${list.getTitle()}</td>
					<td width="15%">${list.getWriter()}</td>
					<td width="10%">${list.getHits()}</td>
					<td width="25%" align="center">${list.getRegDate()}</td>
				</tr>
			</form>
			
			</c:forEach>
				


		</div>
		
		<input type = "hidden" class = 'page' name = "pageno" value="${criteria.getPageno()}" >
		<input type="hidden" class="bno" name=bno>
		<form action="/board/board/list" method="get">
			<input type="checkbox" value="writer" name="types"> 작성자
			<input type="checkbox" value="title" name="types" checked="checked">제목
			<input type="checkbox" value="content" name="types"> 본문
		    <input name="keyword" id="earch" size="10" maxlength="100">
		    <input type="submit" value="검색" />
		    
			</form>
		<form action = "create" method="get">
		<input type="submit" value="등록" />
		</form>
	</div>
	<div id='paging' align="center"></div>
</form>	

	<script>
	
	var pageMaker = new PageMaker({
		pageno : ${criteria.getPageno()},
		totalCnt : ${totalCnt}
	});
	
	pageMaker.makePage($('#paging'),function(page){
		/* window.location.href = "list?pageno=" + page; */
		$('.page').attr('value',page);
		$('.list').attr('action','list').submit();
	});
	
	function _goPage(bno){
		console.log(bno);
		$('.bno').attr('value',bno);
		$('.list').attr('action','detail').submit();
	}
	</script>

</body>
</body>
</html>