<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>テストファイル | 結果ページ</title>
</head>

<body>
	
	<h1>テストファイル</h1>
	
	<p>氏名：<c:out value="${ name }"/>様</p>
	
	<p>年齢：<c:out value="${ age }"/>歳</p>
	
	<p>性別：<c:out value="${ gender }"/></p>
	
</body>
</html>