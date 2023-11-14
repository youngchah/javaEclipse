package print;

import java.util.List;




public class Print {
	
	public void printVar() {
		System.out.println("---------------------------------------");
	}
	public void printLn(int num) {
		for(int i=0; i<num; i++) System.out.println();
	}
	public void printMainHome() {
		printVar();
		printLn(2);
		System.out.println("1. 일반회원");
		System.out.println("2. 관리자");
		printLn(2);
		printVar();
		
	}
	public void printMemberHome() {
		printVar();
		System.out.println("1. 영화예매");
		System.out.println("2. 예매내역 조회");
		System.out.println("3. 예매취소");
		
		printVar();
		
	}
}
