package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationControl {
    
	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String home() {
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String seasonFind(Map<String,Object> map) {
		String msg = service.findSeason();
		map.put("resultMsg", msg);
		return "display";
	}
}
