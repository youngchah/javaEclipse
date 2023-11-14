package controller;

import java.util.Map;

import service.ScheduleService;

public class ScheduleController {
	static private Map<String, Object> sessionStorage = Controller.sessionStorage;
	
	private ScheduleService schService = ScheduleService.getInstance();
	
}
