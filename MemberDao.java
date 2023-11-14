package dao;

import util.JDBCUtil;

public class MemberDao {
	private static MemberDao singleTon = null;

	private MemberDao() {
	};

	public static MemberDao getInstance() {
		if (singleTon == null) {
			singleTon = new MemberDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

}
