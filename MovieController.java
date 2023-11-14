package controller;

import java.util.Map;

import service.MovieService;

public class MovieController {
	static private Map<String, Object> sessionStorage = Controller.sessionStorage;
	
	private MovieService mvService = MovieService.getInstance();
}
