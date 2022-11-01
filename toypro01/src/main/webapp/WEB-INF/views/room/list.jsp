<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 목록 | 스페이스토이</title>
<script src="/toy01/resources/js/room/add.js"></script>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>썸네일</th>
			<th>객실명</th>
			<th>금액</th>
			<th>상세</th>
			<th>기본인원</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
		<tr>
			<td><img src='${dto.r_thumbnail_path }'></td>
			<td>${dto.r_name }</td>
			<td>${dto.r_price }</td>
			<td>${dto.r_desc }</td>
			<td>${dto.r_defaultcnt }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>