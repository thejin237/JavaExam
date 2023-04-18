package ex01;

import java.util.Scanner;

public class SawonMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sawon[] = new Sawon[10];
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("사원등록:");
			String name = scn.next();
			if (name.equalsIgnoreCase("end"))// 대소문자의 구분없이 비교
				break;
			int pay = scn.nextInt();
			sawon[cnt] = new Sawon(name, pay);
			cnt++;
		}
		// 출력
		Sawon s = new Sawon();
		s.printIndex();
		for (int i = 0; i < cnt; i++) {
			System.out.print(sawon[i].name + "\t" + sawon[i].pay + "\t");
			for (int j = 0; j < sawon[i].money.length; j++) {
				System.out.print(sawon[i].money[j] + "\t");
				s.money[j] += sawon[i].money[j];
			}
			System.out.println();
		}
		// 전체화폐매수(main에서 출력)
		System.out.print("전체화폐매수\t");
		for (int i = 0; i < sawon[0].money.length; i++) {
			System.out.print(s.money[i] + "\t");
		}
	}
}
