package service;

import dao.TicketDao;

public class TicketService {
	private static TicketService singleTon = null;

	private TicketService() {
	};

	public static TicketService getInstance() {
		if (singleTon == null) {
			singleTon = new TicketService();
		}
		return singleTon;
	}
	TicketDao ticketDao = TicketDao.getInstance();
}
