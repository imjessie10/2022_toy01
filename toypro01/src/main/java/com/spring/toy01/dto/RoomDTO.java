package com.spring.toy01.dto;

public class RoomDTO {
	
	int room_id;
	String r_name;	
	int r_price;	
	String r_desc;	
	String r_thumbnail_path;	
	int r_defaultcnt;
	
	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RoomDTO(int room_id, String r_name, int r_price, String r_desc, String r_thumbnail_path, int r_defaultcnt) {
		super();
		this.room_id = room_id;
		this.r_name = r_name;
		this.r_price = r_price;
		this.r_desc = r_desc;
		this.r_thumbnail_path = r_thumbnail_path;
		this.r_defaultcnt = r_defaultcnt;
	}


	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public int getR_price() {
		return r_price;
	}
	public void setR_price(int r_price) {
		this.r_price = r_price;
	}
	public String getR_desc() {
		return r_desc;
	}
	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}
	public String getR_thumbnail_path() {
		return r_thumbnail_path;
	}
	public void setR_thumbnail_path(String r_thumbnail_path) {
		this.r_thumbnail_path = r_thumbnail_path;
	}
	public int getR_defaultcnt() {
		return r_defaultcnt;
	}
	public void setR_defaultcnt(int r_defaultcnt) {
		this.r_defaultcnt = r_defaultcnt;
	}


	@Override
	public String toString() {
		return "RoomDTO [room_id=" + room_id + ", r_name=" + r_name + ", r_price=" + r_price + ", r_desc=" + r_desc
				+ ", r_thumbnail_path=" + r_thumbnail_path + ", r_defaultcnt=" + r_defaultcnt + "]";
	}
	
}
