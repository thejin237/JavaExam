class Score {
	int bun;
	int score;

	public Score() {
	}

	public Score(int bun, int score) {
		this.bun = bun;
		this.score = score;
	}

	public void print() {
		System.out.println(bun + "\t" + score);
	}

	public String strPrint() {
		return bun + "\t" + score;
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Score sVal[] = new Score[5];// 클래스 배열

		Score s1 = new Score();
		s1.print();
		System.out.println(s1.strPrint());
		System.out.println("----------------------");
		Score s2 = new Score(1, 90);
		s2.print();
		String s2Str = s2.strPrint();
		System.out.println(s2Str);

		sVal[0] = s1;// s1의 위치(주소)를 sVal[0]에 저장
		sVal[1] = s2;

		// Score(int bun,int score)객체 생성 후 sVal[2]에 위치를 저장
		sVal[2] = new Score(2, 88);

		sVal[0].print();// s1에 있는 print()메소드 호출
		sVal[1].print();// s2에 있는 print()메소드 호출
		sVal[2].print();// 새로운 객체 Score(2,88)에 있는 print()메소드 호출
	}

}
