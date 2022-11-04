window.onload = function(){
	bind();
}

function bind(){
	document.querySelector("#btn_update").addEventListener("click", btn_update_click);
}

function btn_update_click(event){
	let addForm = document.querySelector("#addForm");
	
	let r_name = addForm.querySelector("#r_name").value;
	let r_price = addForm.querySelector("#r_price").value;
	let r_desc = addForm.querySelector("#r_desc").value;
	let r_thumbnail_path = addForm.querySelector("#r_thumbnail_path").value;
	let r_defaultcnt = addForm.querySelector("#r_defaultcnt").value;
	
	let room_id = event.target.getAttribute("data-room_id");
	
	let room_info = {
		r_name: r_name,
		r_price: r_price,
		r_desc: r_desc,
		r_thumbnail_path: r_thumbnail_path,
		r_defaultcnt: r_defaultcnt,
		room_id: room_id
	}
	
	console.log(JSON.stringify(room_info));
	
	let xhr = new XMLHttpRequest();
	xhr.open("PUT", "/toy01/api/room");
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.send(JSON.stringify(room_info));
	xhr.onload = function(){
		if(xhr.response == 1){
			location.href = "/toy01/room/list.view";
		} else {
			alert("수정되지 않았습니다.");
		}
	}
}












