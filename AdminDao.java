package dao;

import util.JDBCUtil;

public class AdminDao {
	private static AdminDao singleTon = null;

	private AdminDao() {
	};

	public static AdminDao getInstance() {
		if (singleTon == null) {
			singleTon = new AdminDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
