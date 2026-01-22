package com.js.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.service.SchedulerService;

@Controller
public class HomeController {
	@Autowired
	SchedulerService scheSvc;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/start")
	public String start() {
		try {
			logger.info("스케줄러 시작됨");
			scheSvc.startScheduler();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";	// 무한 재생을 막기 위해 redirect
	}
	
	@RequestMapping("/end")
	public String end() {
		try {
			logger.info("스케줄러 종료됨");
			scheSvc.endScheduler();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
}
