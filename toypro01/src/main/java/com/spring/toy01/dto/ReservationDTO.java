package com.spring.toy01.dto;

import java.sql.Date;

public class ReservationDTO {
	
	int resv_id;
	int room_id;
	int book_info_id;
	Date date_in;
	Date date_out;
	String str_date_in;
	String str_date_out;
	int resv_price;
	int resv_cnt;
	String resv_memo;
	int status_code;
	                   
	String b_name;
	String b_tel;
	String b_email;
	int b_point;

	public ReservationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getResv_id() {
		return resv_id;
	}

	public void setResv_id(int resv_id) {
		this.resv_id = resv_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getBook_info_id() {
		return book_info_id;
	}

	public void setBook_info_id(int book_info_id) {
		this.book_info_id = book_info_id;
	}

	public Date getDate_in() {
		return date_in;
	}

	public void setDate_in(Date date_in) {
		this.date_in = date_in;
	}

	public Date getDate_out() {
		return date_out;
	}

	public void setDate_out(Date date_out) {
		this.date_out = date_out;
	}

	public String getStr_date_in() {
		return str_date_in;
	}

	public void setStr_date_in(String str_date_in) {
		this.str_date_in = str_date_in;
	}

	public String getStr_date_out() {
		return str_date_out;
	}

	public void setStr_date_out(String str_date_out) {
		this.str_date_out = str_date_out;
	}

	public int getResv_price() {
		return resv_price;
	}

	public void setResv_price(int resv_price) {
		this.resv_price = resv_price;
	}

	public int getResv_cnt() {
		return resv_cnt;
	}

	public void setResv_cnt(int resv_cnt) {
		this.resv_cnt = resv_cnt;
	}

	public String getResv_memo() {
		return resv_memo;
	}

	public void setResv_memo(String resv_memo) {
		this.resv_memo = resv_memo;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_tel() {
		return b_tel;
	}

	public void setB_tel(String b_tel) {
		this.b_tel = b_tel;
	}

	public String getB_email() {
		return b_email;
	}

	public void setB_email(String b_email) {
		this.b_email = b_email;
	}

	public int getB_point() {
		return b_point;
	}

	public void setB_point(int b_point) {
		this.b_point = b_point;
	}

	@Override
	public String toString() {
		return "ReservationDTO [resv_id=" + resv_id + ", room_id=" + room_id + ", book_info_id=" + book_info_id
				+ ", date_in=" + date_in + ", date_out=" + date_out + ", str_date_in=" + str_date_in + ", str_date_out="
				+ str_date_out + ", resv_price=" + resv_price + ", resv_cnt=" + resv_cnt + ", resv_memo=" + resv_memo
				+ ", status_code=" + status_code + ", b_name=" + b_name + ", b_tel=" + b_tel + ", b_email=" + b_email
				+ ", b_point=" + b_point + "]";
	}


	
	
}
