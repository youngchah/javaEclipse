package dao;

import util.JDBCUtil;

public class BoardDao {
	private static BoardDao singleTon = null;

	private BoardDao() {
	};

	public static BoardDao getInstance() {
		if (singleTon == null) {
			singleTon = new BoardDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
