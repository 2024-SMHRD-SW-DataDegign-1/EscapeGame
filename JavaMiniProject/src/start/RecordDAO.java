package start;

import java.util.Scanner;

import chapter.Chap0;
import chapter.Chap1;

public class RecordDAO {

	Scanner sc = new Scanner(System.in);
	Opening op = new Opening();
	Chap0 c0 = new Chap0();

	public int record() {

		System.out.print("게임 기록이 있으십니까?  [1] 네  [2] 아니오 >>   ");
		int rec = sc.nextInt();

		if (rec == 1) {
			System.out.println("이전 기록 로딩...");
			System.out.println("");
		} else if (rec == 2) {
			op.opening();
			//c0.choo0();
			
		}
		return rec;
	}

}
