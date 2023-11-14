package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.ConvertUtils;
import util.JDBCUtil;


public class MovieDao {
	private static MovieDao singleTon = null;

	private MovieDao() {
	};

	public static MovieDao getInstance() {
		if (singleTon == null) {
			singleTon = new MovieDao();
		}
		return singleTon;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	
	
}
