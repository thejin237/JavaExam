public class Exam_01 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int x = 1; x <= 5; x++) { // row(줄 수)
			int tot = 0;
			for (int y = 1; y <= 5; y++) { // col(줄 당 칸수)
				cnt++;
				System.out.print(cnt + "\t");
				tot += cnt; // 칸 합계
			}
			System.out.println(tot);
		}
	}
}
