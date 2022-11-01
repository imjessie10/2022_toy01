<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 추가 | 스페이스토이</title>
<script src="/toy01/resources/js/room/add.js"></script>
</head>
<body>

<table id="addForm" border="1">
	<tr>
		<td>객실명</td>
		<td><input type="text" id="r_name" /></td>
	</tr>
	<tr>
		<td>금액</td>
		<td><input type="text" id="r_price" /></td>
	</tr>
	<tr>
		<td>상세</td>
		<td><input type="text" id="r_desc" /></td>
	</tr>
	<tr>
		<td>썸네일</td>
		<td><input type="text" id="r_thumbnail_path" /></td>
	</tr>
	<tr>
		<td>기본인원</td>
		<td><input type="text" id="r_defaultcnt" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="button" id="btn_add" value="추가"/></td>
	</tr>
</table>


</body>
</html>