window.onload = function(){
	
	bind();

}

function bind(){
	document.querySelector("#btn_add").addEventListener("click", btn_add_click);
}

function btn_add_click(e){
	//e.preventDefault(); //submit이나 a tag의 기본 기능의 동작 취소
	let addForm = document.querySelector("#addForm");
	let r_name = addForm.querySelector("#r_name").value;
	let r_price = addForm.querySelector("#r_price").value;
	let r_desc = addForm.querySelector("#r_desc").value;
	let r_thumbnail_path = addForm.querySelector("#r_thumbnail_path").value;
	let r_defaultcnt = addForm.querySelector("#r_defaultcnt").value;
	
	let room_info = {
		r_name: r_name,
		r_price: r_price,
		r_desc: r_desc,
		r_thumbnail_path: r_thumbnail_path,
		r_defaultcnt: r_defaultcnt,
	}
	
	console.log(room_info);
	
	let xhr = new XMLHttpRequest();
	xhr.open("POST","/toy01/api/room");
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.send(JSON.stringify(room_info));
	xhr.onload = function(){
		console.log("xhr.response", xhr.response);
	}

}