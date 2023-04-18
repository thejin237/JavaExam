package com.jslhrd.testb;
class Sawon{
	String name;
	void print() {
		try {
			if(name.equals("aaaaa")) {
				System.out.println("OK");
			}else {
				System.out.println("name is null");
			}
		}catch(NullPointerException ne) {//하위 에러부터 캐치한다.
			//e.printStackTrace();
			System.out.println("에러발생: "+ne.getMessage());
		}catch(Exception e) {//최종 에러 캐치 Exception
			e.printStackTrace();
		}finally {//예외 발생유무와 관계없이 실행(처리)해야 하는 것을 작성
			//db close() 자주 사용.
		}
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		Sawon sawon = new Sawon();
		sawon.print();
	}

}
