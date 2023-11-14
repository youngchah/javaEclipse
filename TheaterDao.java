package dao;

import util.JDBCUtil;

public class TheaterDao {
	private static TheaterDao singleTon = null;

	private TheaterDao() {
	};

	public static TheaterDao getInstance() {
		if (singleTon == null) {
			singleTon = new TheaterDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
