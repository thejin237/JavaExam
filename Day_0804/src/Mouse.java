public class Mouse {
	// 멤버변수(멤버필드): 클래스내에 선언되어진 변수, 객체 생성시 default값으로 초기화됨.
	// int=0, double=0.0, char='', String=null, boolean=false 로 초기화
	String color;// 색상
	int butten;// 버튼수
	String memo;// 용도

	void moveUp() {// 이동 기능
		System.out.println("마우스가 이동합니다");
	}

	void oneClick() {
		System.out.println("마우스가 클릭되었습니다");
	}

	void doubleClick() {
		System.out.println("마우스가 더블클릭되었습니다");
	}
}
