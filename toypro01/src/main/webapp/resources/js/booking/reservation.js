window.onload = function(){
	drawCal();
	
}
// 참고 사이트
// https://booking.ddnayo.com/booking-calendar-status?accommodationId=9055&roomId=107853&selectedDate=2022-11-01&channelCode=0030

// 달력 그리기;;;;
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
	
	
	// 달력 그리기
	document.querySelector("#day_table").innerHTML = "";
	
	let html = '';
	html += '<div class="days">';
	
	// 지난달 그리기
	for(let i=(prevLastDate - firstDay) + 1; i <= prevLastDate; i++){
		html += '<div>';
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
		
		let year = new Date().getFullYear();
		let month = new Date().getMonth() + 1;
		
		html += '<div class="date" data-year="'+ year +'" data-month="'+ month +'" data-date="'+ i +'">';
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

		html += '<div>';
		html += '	'+ i;
		html += '	<div></div>';
		html += '</div>';
		
		if(nextDay == 6) { // 토요일이면
			html += '</div>';
			break;
		}
	}
	
	document.querySelector("#day_table").innerHTML = html;
	
	getBookInfo();
	
}

// 방 정보 가져오기
// 매일매일에 링크와 함께 표시
function getBookInfo(){
	
	let xhr = new XMLHttpRequest();
	let url = "/toy01/api/room/list";
	xhr.open("get", url);
	
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.onload = function(){
		let list = JSON.parse(xhr.response);
		console.log("xhr.response", list);
		//{"room_id":1,"r_name":"1","r_price":2,"r_desc":"3","r_thumbnail_path":"4","r_defaultcnt":5}
		
		//for(let item in xhr.response) // item에는 index
		//for(let item of xhr.response) // item에는 내용물
		
		let html = "";
		html += "<ul class='room_list'>";
		for(let item of list){
			html += "	<li>";
			html += "		<span>[가]</span> <a href='javascript:void(0)' class='book' data-id='"+ item.room_id +"'>"+item.r_name+"</a>";
			html += "	</li>";
		}
		html += "</ul>";
		console.log(html);
		
		let doms = document.querySelectorAll(".date div");
		for(let idx in doms){
			doms[idx].innerHTML = html;
		}
		
		let list_a = document.querySelectorAll("ul.room_list li a");
		for(let i=0; i<list_a.length; i++){
			list_a[i].addEventListener("click", function(event){
				
				let parent_dom = event.target.parentElement.parentElement.parentElement.parentElement;
				let year = parent_dom.getAttribute("data-year");
				let month = parent_dom.getAttribute("data-month");
				let date = parent_dom.getAttribute("data-date");
				
				let room_id = event.target.getAttribute("data-id");
				
				let url = "/toy01/book/book.view";
				url += "?year="+ year;
				url += "&month="+ month;
				url += "&date="+ date;
				url += "&room_id="+ room_id;
				
				location.href = url;
				
			});
		}
		
		drawBookInfo();
		
	}
	
	xhr.send();
}

function drawBookInfo(){
	let xhr = new XMLHttpRequest();
	let url = "/toy01/api/book";
	xhr.open("get", url);
	
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.onload = function(){
		console.log(xhr.response);
		let list = JSON.parse(xhr.response);
		for(let i=0; i<list.length; i++){
			let room_id = list[i].room_id;
			let date_in = list[i].date_in;
			let date_out = list[i].date_out;
			console.log(1, list[i].date_in, list[i].date_out)
			
			date_in = new Date(date_in);
			date_out = new Date(date_out);
			
			let year = date_in.getFullYear();
			let month = date_in.getMonth() + 1;

			date_in = date_in.getDate();
			date_out = date_out.getDate();
			
			console.log(date_in, date_out);
			for(let date=date_in; date<=date_out; date++){
				// <div class="date" data-year="2022" data-month="11" data-date="1">
				let date_dom = document.querySelector(".date[data-year='"+ year +"'][data-month='"+ month +"'][data-date='"+ date +"']")
				let text_dom = date_dom.querySelector("a[data-id='"+ room_id +"']").parentElement.querySelector("span");
				text_dom.innerHTML = "[완]";
				
				// 1 -> 01
				// "0"+"13" -> 13
				// "0"+"9"  -> 09
				// ("0"+"9").slice(-2)
			}
		}
	}
	xhr.send();
}