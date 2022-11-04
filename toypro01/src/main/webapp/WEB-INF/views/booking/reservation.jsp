<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약달력 | 스페이스토이</title>

<link rel="stylesheet" href="/toy01/resources/css/calLayout.css">
<script src="/toy01/resources/js/booking/reservation.js"></script>
</head>
<body>
<!-- 자스로진행
1. 달력 그리기
2. ajax로 예약정보 가져오기
3. 날짜를 클릭하면 해당날짜로 예약이 되도록
 -->
 
 <div class="cal">
   <!-- 월 -->
   <div class="header">
      <div class="prev">이전달</div>
      <div class="ym">2022년 11월</div>
      <div class="next">다음달</div>
   </div>
   <!-- 일 -->
   <div>
      <!-- 요일 -->
      <div class="week">
         <div>일</div>
         <div>월</div>
         <div>화</div>
         <div>수</div>
         <div>목</div>
         <div>금</div>
         <div>토</div>
      </div>
      <!-- 날짜들 -->
      <div id="day_table">
      </div>
   </div>
</div>
 
 
</body>
</html>