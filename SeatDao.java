package dao;

import util.JDBCUtil;

public class SeatDao {
	private static SeatDao singleTon = null;

	private SeatDao() {
	};

	public static SeatDao getInstance() {
		if (singleTon == null) {
			singleTon = new SeatDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
