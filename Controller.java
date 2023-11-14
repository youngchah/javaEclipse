package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import print.Print;
import service.AdminService;
import service.BoardService;
import service.MemberService;
import service.MovieService;
import service.ScheduleService;
import service.SeatService;
import service.TheaterService;
import service.TicketService;
import util.ScanUtil;
import util.View;


public class Controller extends Print {
	// 세션
	static public Map<String, Object> sessionStorage = new HashMap<>();

	MovieService mvService = MovieService.getInstance();
	AdminService adService = AdminService.getInstance();
	BoardService bdService = BoardService.getInstance();
	MemberService mbService = MemberService.getInstance();
	SeatService seatService = SeatService.getInstance();
	TheaterService theService = TheaterService.getInstance();
	ScheduleService schService = ScheduleService.getInstance();
	TicketService ticService = TicketService.getInstance();
	
	MovieController mvc = new MovieController();
	AdminController ac = new AdminController();
	BoardController bc = new BoardController();
	MemberController mc = new MemberController();
	SeatController sc = new SeatController();
	TheaterController tc = new TheaterController();
	ScheduleController schc = new ScheduleController();
	TicketController ticc = new TicketController();
	
	public static void main(String[] args) {
		new Controller().start();
	}

	private void start() {
		View view = View.HOME;
		while (true) {
			switch (view) {
			case HOME:
			view = home();
			break;
			
			}
		}
	}
	
	

	private View home() {
		printMainHome();
		int select = ScanUtil.nextInt("메뉴를 선택하세요.");
		switch (select) {
		case 1:
			return View.HOME;
		case 2:
			return View.HOME;
		default :
			return View.HOME;
		}
	}
}
