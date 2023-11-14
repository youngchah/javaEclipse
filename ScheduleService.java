package service;

import dao.ScheduleDao;

public class ScheduleService {
	private static ScheduleService singleTon = null;

	private ScheduleService() {
	};

	public static ScheduleService getInstance() {
		if (singleTon == null) {
			singleTon = new ScheduleService();
		}
		return singleTon;
	}
	ScheduleDao schDao = ScheduleDao.getInstance();
}
