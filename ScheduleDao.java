package dao;

import util.JDBCUtil;

public class ScheduleDao {
	private static ScheduleDao singleTon = null;

	private ScheduleDao() {
	};

	public static ScheduleDao getInstance() {
		if (singleTon == null) {
			singleTon = new ScheduleDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
