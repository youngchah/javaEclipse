package service;

import java.util.List;

import dao.MovieDao;



public class MovieService {
	private static MovieService singleTon = null;

	private MovieService() {
	};

	public static MovieService getInstance() {
		if (singleTon == null) {
			singleTon = new MovieService();
		}
		return singleTon;
	
	}
	
	// Dao를 부른다
	MovieDao movieDao = MovieDao.getInstance();

	
	
	
}
