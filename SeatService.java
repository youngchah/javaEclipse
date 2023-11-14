package service;

import dao.SeatDao;

public class SeatService {
	private static SeatService singleTon = null;

	private SeatService() {
	};

	public static SeatService getInstance() {
		if (singleTon == null) {
			singleTon = new SeatService();
		}
		return singleTon;
	}
	SeatDao seatDao = SeatDao.getInstance();
}
