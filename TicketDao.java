package dao;

import java.util.List;

import util.JDBCUtil;

public class TicketDao {
	private static TicketDao singleTon = null;

	private TicketDao() {
	};

	public static TicketDao getInstance() {
		if (singleTon == null) {
			singleTon = new TicketDao();
		}
		return singleTon;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public void ticketCreate(List<Object> param) {
		String sql = "insert into ticket values (?,?,?)";
		jdbc.update(sql, param);
		
	}
}
