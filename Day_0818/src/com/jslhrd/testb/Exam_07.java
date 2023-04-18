package com.jslhrd.testb;
interface Vehicle{
	void run();
}
class Anony {
	Vehicle field = new Vehicle() {//익명 객체 필드 생성
		@Override
		public void run() {
			System.out.println("aaaaaaa");
		}
	};
	
	void method_01() {
		Vehicle local = new Vehicle() {//익명 객체 메소드 내의 로컬변수
			@Override
			public void run() {
				System.out.println("bbbbbbb");
			}
		};
		local.run();
	}
	void method_02(Vehicle v) {
		v.run();
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		Anony anony = new Anony();
		//익명 객체 필드 사용
		anony.field.run();
		
		//익명 객체 로컬 변수
		anony.method_01();
		
		//익명 객체 매개 값
		anony.method_02(new Vehicle() {
			@Override
			public void run() {
				System.out.println("ccccccc");
			}
		});

	}

}
