package lock;

import java.util.Random;

public class LockPW {

	Random ran = new Random();
	int reward1 = ran.nextInt(9) + 1;
	int reward2 = ran.nextInt(9) + 1;
	int reward3 = ran.nextInt(9) + 1;
	int reward4 = ran.nextInt(9) + 1;
//	System.out.println(reward1);
//	System.out.println(reward2);
//	System.out.println(reward3);
//	System.out.println(reward4);
	
//	public int lpt(int i) {
//		int lp = ran.nextInt(9) + 1;
//		for(int num = i; i< i+1; i++) {
//			System.out.println("자물쇠 번호 "+ lp);
//			break;
//		}
//		return lp;
//		
//	}
	
	public void Lpw1() {
		System.out.println("자물쇠 번호는 "+reward1+"입니다");
	}
	
	public void Lpw2() {
		
		System.out.println("자물쇠 번호는 "+reward2+"입니다");
	}
	
	public void Lpw3() {
		System.out.println("자물쇠 번호는 "+reward3+"입니다");
	}
	
	public void Lpw4() {
		System.out.println("자물쇠 번호는 "+reward4+"입니다");
	}
	
	public void LpAll() {
		System.out.println(reward1);
		System.out.println(reward2);
		System.out.println(reward3);
		System.out.println(reward4);
		

	}
	

}
