package service;

import dao.BoardDao;

public class BoardService {
	private static BoardService singleTon = null;

	private BoardService() {
	};

	public static BoardService getInstance() {
		if (singleTon == null) {
			singleTon = new BoardService();
		}
		return singleTon;
	}
	BoardDao boardDao = BoardDao.getInstance();
}
