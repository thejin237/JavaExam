//private : 같은 클래스에서만 접근 가능
//public : 누구나 접근 가능(모든 클래스)
class Car {// 싱글톤 클래스
	private static Car car = new Car();

	private Car() {
	}

	public static Car getInstance() {
		return car;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		// Car c = new Car(); 객체를 생성할 수 없음
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();

		if (c1 == c2) {
			System.out.println("c1==c2");
		} else {
			System.out.println("c1==c2");
		}
	}

}
