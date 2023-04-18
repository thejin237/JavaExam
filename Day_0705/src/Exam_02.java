
public class Exam_02 {
		public static void main(String[] a) {
			int bun=1011;
			String name="김학생";
			int kor=90;
			int eng=88;
			int mat=95;
			
			int tot = kor+eng+mat;//총점
			double ave=(int)(tot/3.);//평균 정수값만
			//byte by = (byte)200;//오버플로우
			//int aa=(int)3.14;//정수값만
			System.out.println("번호:" + bun);
			System.out.println("이름:" + name);
			System.out.println("총점:" + tot);
			System.out.println("평균:" + ave);
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.print(bun + "\t" + name + "\t");
			System.out.print(kor + "\t" + eng + "\t" + mat + "\t");
			System.out.print(tot + "\t" + ave + "\n");
	}

}
