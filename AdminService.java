package service;

import dao.AdminDao;

public class AdminService {
	private static AdminService singleTon = null;

	private AdminService() {
	};

	public static AdminService getInstance() {
		if (singleTon == null) {
			singleTon = new AdminService();
		}
		return singleTon;
	}
	AdminDao adminDao = AdminDao.getInstance();
}	
