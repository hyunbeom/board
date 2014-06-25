<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 부트스트랩 -->
<script src="//code.jquery.com/jquery.js"></script>
<script src="/board/js/bootstrap.min.js"></script>

<link href="/board/css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Insert title here</title>
</head>
<body>
<form action="registTextAction" role="form" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">작성자</label>
    <input type="text" class="form-control" name="writer" placeholder="writer">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">제목</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label for="exampleInputFile">글내용</label>
    <br/>
    <textarea  rows="5" cols="80"  name="content"></textarea>   
  </div>
 
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>