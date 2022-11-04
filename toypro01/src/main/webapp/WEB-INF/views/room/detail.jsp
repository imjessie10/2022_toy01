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
<script src="/toy01/resources/js/room/detail.js"></script>
</head>
<body>
<div id="addForm">
	객실명 : <input type="text" id="r_name" value="${roomDTO.r_name }"><br>
	금액 : <input type="text" id="r_price" value="${roomDTO.r_price }"><br>
	상세 : <input type="text" id="r_desc" value="${roomDTO.r_desc }"><br>
	썸네일 : <input type="text" id="r_thumbnail_path" value="${roomDTO.r_thumbnail_path }"><br>
	기본인원 : <input type="text" id="r_defaultcnt" value="${roomDTO.r_defaultcnt }"><br>
	<hr>
	<input type="button" id="btn_update" value="수정" data-room_id="${roomDTO.room_id }">
</div>
</body>
</html>