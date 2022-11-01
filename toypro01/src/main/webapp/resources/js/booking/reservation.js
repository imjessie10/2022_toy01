window.onload = function(){
	drawCal();
}

function drawCal(){

	// 저번달 마지막날
	let prevLastDate = new Date(new Date().setDate(0)).getDate();

	// 이번달 1일의 요일; 일:0, 월:1, ... 토:6	
	let firstDay = new Date(new Date().setDate(1)).getDay();	  
	
	// 이번달 마지막날
	let thisMonth = new Date().getMonth() // 이번달
	let nextMonth = new Date().setMonth(thisMonth + 1); // 다음달 == 이번달+1
	let lastDate = new Date(new Date(nextMonth).setDate(0)).getDate(); // 이번달 마지막날 == 다음달 기준으로 저번달 마지막날
	
	console.log("지난달 막날",prevLastDate, "오늘 요일",firstDay, "이달 막날", lastDate);
	
	document.querySelector("#day_table").innerHTML = "";
	
	let html = '';
	html += '<div class="days">';
	
	// 지난달 그리기
	for(let i=(prevLastDate - firstDay) + 1; i <= prevLastDate; i++){
		html += '<div class="date">';
		html += '	'+ i;
		html += '	<div></div>';
		html += '</div>';
	}
	
	// 이번달 그리기
	for(let i=1; i<=lastDate; i++){
		let thisDay = new Date(new Date().setDate(i)).getDay();
		if(thisDay == 0) { // 일요일이면
			html += '<div class="days">'
		}
		
		html += '<div class="date">';
		html += '	<strong>'+ i +'</strong>';
		html += '	<div></div>';
		html += '</div>';
		
		if(thisDay == 6) { // 토요일이면
			html += '</div>';
		}
	}
	
	// 다음달 그리기
	for(let i=1; i<=7; i++){
		// 다음달 1일부터의 요일
		let nextDay = new Date(new Date(nextMonth).setDate(i)).getDay();

		html += '<div class="date">';
		html += '	'+ i;
		html += '	<div></div>';
		html += '</div>';
		
		if(nextDay == 6) { // 토요일이면
			html += '</div>';
			break;
		}
	}
	
	document.querySelector("#day_table").innerHTML = html;
	
}

//예약 정보 가져오기

//예약하기