package controller;

import java.util.Map;

import print.Print;
import service.BoardService;

public class BoardController extends Print {
	static private Map<String, Object> sessionStorage = Controller.sessionStorage;
	
	private BoardService bdService = BoardService.getInstance();
	
}
