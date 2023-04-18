package com.jslhrd.testa;

//익명 중첩
class InnerD {
	void disp() {
		System.out.println("AAAAA");
	}

	void exam() {
		System.out.println("BBBBB");
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		InnerD id = new InnerD();
		id.disp();
		id.exam();
		System.out.println("-------------");
		InnerD in1 = new InnerD() {
			void disp() {
				System.out.println("111111");
			}

			void exam() {
				System.out.println("222222");
			}
		};
		in1.disp();
		in1.exam();

	}

}
