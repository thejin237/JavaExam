package com.jslhrd.exam03;
import java.util.*;
import java.util.regex.Pattern;
public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<Student> treeSet = new TreeSet<Student>();
		//Input
		while(true) {
			System.out.print("입력: ");
			String str = scn.nextLine();
			StringTokenizer st = new StringTokenizer(str,",");
			String hakbun = st.nextToken();
			if(hakbun.equals("0000")) {
				System.out.println("종료");
				break;
			}else if(!Pattern.matches("\\d{4}", hakbun)) {
				System.out.println("입력오류");
				continue;
			}
			int intHakbun = Integer.parseInt(hakbun);
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());
			
			boolean add = treeSet.add(new Student(intHakbun, name, kor, eng, mat));
			if(!add) {
				System.out.println("이미 등록된 학생입니다.");
			}
		}
		scn.close();
		//rank set
		System.out.println("학번순 조회");
		List<Student> listStu = new ArrayList<Student>(treeSet);
		for(int i=0;i<listStu.size();i++) {
			int rank = 1;
			for(int j = 0;j<listStu.size();j++) {
				if(listStu.get(i).getTot()<listStu.get(j).getTot()) {
					rank++;
				}
			}
			listStu.get(i).setRank(rank+"");
			System.out.println(listStu.get(i));
		}
		
		//석차순 정렬
		System.out.println("석차순 조회");
		for(int i=0;i<listStu.size()-1;i++) {
			for(int j = i+1;j<listStu.size();j++) {
				if(Integer.parseInt(listStu.get(i).getRank())>Integer.parseInt(listStu.get(j).getRank())) {
					Student stu = listStu.get(i);
					listStu.set(i, listStu.get(j));
					listStu.set(j, stu);
				}
			}
		}
		for(Student stu : listStu) {
			System.out.println(stu);
		}
		
	}

}
