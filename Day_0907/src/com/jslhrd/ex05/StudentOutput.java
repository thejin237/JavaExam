package com.jslhrd.ex05;

import java.io.*;
import java.util.*;

public class StudentOutput {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(new File("Student.dat"))));

		Scanner scn = new Scanner(System.in);
		List<Student> lStu = new ArrayList<Student>();
		
		//키보드로 입력 -> Student객체 생성 -> List에 저장
		while (true) {
			System.out.print("등록:");
			String str = scn.nextLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			String[] sToken = new String[5];
			sToken[0] = st.nextToken();
			if (sToken[0].equals("0000")) {
				break;
			} else {
				for (int i = 1; i < 5; i++) {
					sToken[i] = st.nextToken();
				}
			}
			lStu.add(new Student(Integer.parseInt(sToken[0]), sToken[1], Integer.parseInt(sToken[2]),
					Integer.parseInt(sToken[3]), Integer.parseInt(sToken[4])));
		}
		scn.close();//Scanner Close

		oos.writeObject(lStu);//Object Serialization
		oos.close();//ObjectOutputStream close
		
		//Student.dat파일의 Object 출력
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(
								new File("Student.dat"))));
		
		Object obj = ois.readObject();
		List<Student> lStu2 = (List) obj;
		System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균");
		for(Student stu : lStu2) {
			int tot = stu.getKor()+stu.getEng()+stu.getMat();
			int ave = tot/3;
			System.out.print(stu.getBun()+"\t");
			System.out.print(stu.getName()+"\t");
			System.out.print(stu.getKor()+"\t");
			System.out.print(stu.getEng()+"\t");
			System.out.print(stu.getMat()+"\t");
			System.out.println(tot+"\t"+ave);
		}
		
		ois.close();

	}

}
