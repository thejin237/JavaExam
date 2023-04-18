class Point {
	int bun;
	int score;

	public Point() {
	}

	public Point(int bun, int score) {
		this.bun = bun;
		this.score = score;
	}

	void print() {
		System.out.println("bun=" + bun + "\tscore=" + score);
	}
}

public class Exam_07 {

	public static void main(String[] args) {
		Point p[] = new Point[5];
		Point p1 = null;

		p1 = new Point(5, 80);// p1에 Point(5,80)객체 생성하여 위치참조
		p[0] = p1;// Point(5,80)으로 생성된 위치를 p[1]에 저장하여 위치참조
		p1 = new Point(3, 90);// p1에 매개변수 3과90으로 하는 Point(3,90)객체 생성하여 위치참조
		p[1] = p1;// Point(3,90)으로 생성된 위치를 p[1]에 저장하여 위치참조
		p[2] = new Point(1, 95);// p[2]에 Point(1,95)객체 생성하여 위치참조
		p[3] = new Point(4, 78);// p[3]에 Point(4,78)객체 생성하여 위치참조
		p[4] = new Point(2, 89);// p[4]에 Point(2,87)객체 생성하여 위치참조

		// 최대값
		Point max = p[0];
		for (int i = 1; i < p.length; i++) {
			if (max.score < p[i].score) {
				max = p[i];
			}
		}
		System.out.print("MAX : ");
		max.print();

		int m = p[0].score;// p[0]의 위치에 저장된 score 값을 m에 저장
		for (int i = 0; i < p.length; i++) {
			if (m < p[i].score) {
				m = p[i].score;
			}
		}
		System.out.print("MAX : " + m); // 최대값만 출력
	}

}
