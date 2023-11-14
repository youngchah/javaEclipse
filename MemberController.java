package controller;

import java.util.Map;

import print.Print;
import service.MemberService;

public class MemberController extends Print {
	static private Map<String, Object> sessionStorage = Controller.sessionStorage;
	
	private MemberService mbService = MemberService.getInstance();
	
}
