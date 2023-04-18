package com.jslhrd.exam02;

import java.util.*;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<Student, Score> map = new HashMap<Student, Score>();

		// 학생정보 입력
		while (true) {
			System.out.print("입력: ");
			String str = scn.nextLine();
			StringTokenizer st = new StringTokenizer(str, ",");
			int hakbun = Integer.parseInt(st.nextToken());
			if (hakbun == 0000) {
				break;
			}
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());
			Student stu = new Student(hakbun, name);
			if (map.containsKey(stu)) {// needs to override hashCode() and equals() methods
				System.out.println("이미 등록된 학생입니다.");
				continue;
			} else {
				map.put(stu, new Score(kor, eng, mat));
			}
		}
		scn.close();// Close Scanner of scn

		// 학생정보 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for (Map.Entry<Student, Score> entry : map.entrySet()) {
			System.out.print(entry.getKey().getHakbun() + "\t");
			System.out.print(entry.getKey().getName() + "\t");
			System.out.print(entry.getValue().getKor() + "\t");
			System.out.print(entry.getValue().getEng() + "\t");
			System.out.print(entry.getValue().getMat() + "\t");
			System.out.print(entry.getValue().getTot() + "\t");
			System.out.print(entry.getValue().getAve() + "\n");
		}
		
		// 번호순 오름차순 정렬
		List<Student> listStu = new ArrayList<Student>(map.keySet());
		Collections.sort(listStu);
		System.out.println("번호순 오름차순 정렬");
		for(Student s : listStu) {
			System.out.print(s.getHakbun()+"\t"); //needs to override toString to be simple 
			System.out.print(s.getName()+"\t");
			System.out.print(map.get(s).getKor()+"\t");
			System.out.print(map.get(s).getEng()+"\t");
			System.out.print(map.get(s).getMat()+"\t");
			System.out.print(map.get(s).getTot()+"\t");
			System.out.print(map.get(s).getAve()+"\n");
		}

		// 전체 총점, 평균
		Collection<Score> colScore = map.values();
		Iterator<Score> iterScore = colScore.iterator();
		int tot = 0;
		while (iterScore.hasNext()) {
			tot += iterScore.next().getTot();
		}
		System.out.println("전체 총점: " + tot);
		System.out.println("전체 평균: " + tot / (3 * map.size()));

		// 최고.최저 총점
		Score sMax = (Score) Collections.max(colScore); // Score 클래스에서 Comparable<Score> interface 구현
		System.out.println("최고 총점: " + sMax.getTot());

		Score sMin = (Score) Collections.min(colScore);
		System.out.println("최저 총점: " + sMin.getTot());
	}

}
