package service;

import dao.TheaterDao;

public class TheaterService {
	private static TheaterService singleTon = null;

	private TheaterService() {
	};

	public static TheaterService getInstance() {
		if (singleTon == null) {
			singleTon = new TheaterService();
		}
		return singleTon;
	}
	TheaterDao theDao = TheaterDao.getInstance();
}
