//생성자: 클래스 이름과 같은 메소드이며 반환타입이 없음. 멤버변수 초기화에 활용.
class Car {
	String company;
	int maxSpeed;
	boolean power;

	Car() {// default 생성자: 생성자 오버로드가 발생하면 default생성자는 기능 안함.
		System.out.println("Car()생성자가 호출됨");
	}

	Car(String company) {
		this.company = company;
	}

	Car(String company, int maxSpeed) {
		this.company = company;
		this.maxSpeed = maxSpeed;
	}

	Car(String company, int maxSpeed, boolean power) {
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.power = power;
	}

	void speedUp() {
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Car c1;// 레퍼런스(참조) 변수
		c1 = new Car();// 객체(인스턴스)생성

		Car c2 = new Car("현대");
		System.out.println(c1.company);

		Car c3 = new Car("현대", 300);
		Car c4 = new Car("현대", 300, true);
	}
}
