package com.spring.toy01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.toy01.dto.RoomDTO;
import com.spring.toy01.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	//페이지로 return한 애들은 .view, api들어간 애들은 /api를 추가하는, json인 애들은 없이 
	@RequestMapping(value="/room/add.view", method=RequestMethod.GET)
	public String add() {
		return "/room/add";
	}
	
	@RequestMapping(value="/room/list.view", method=RequestMethod.GET)
	public String list(Model model) {
		
		List list = roomService.selectRoom();
		System.out.println("list.size: "+list.size());
		model.addAttribute("list",list);
		
		return "/room/list";
	}
	
	@RequestMapping(value="/api/room", method=RequestMethod.POST)
	public @ResponseBody int addRoom(
			@RequestBody RoomDTO roomDTO
			) {
		System.out.println("/api/room");
		System.out.println("roomDTO.getR_name(): "+roomDTO.getR_name());
		return roomService.insertRoom(roomDTO);
	}
	
	@RequestMapping(value="/api/room", method=RequestMethod.GET)
	public @ResponseBody List selectRoom(
			@RequestBody RoomDTO roomDTO
			) {
		return roomService.selectRoom();
	}
	
}
