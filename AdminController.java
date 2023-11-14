package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import print.Print;
import service.AdminService;

public class AdminController extends Print {
	static private Map<String, Object> sessionStorage = Controller.sessionStorage;
	
	private AdminService adService = AdminService.getInstance();
	
	
}
