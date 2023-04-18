class Car {
	String model;
	boolean power;
	int speed;

	void power() {
		int a = 10;// 지역변수
		power = !power;
	}

	void speedUp() {
		speed += 10;
	}

	void speedDown() {
		speed -= 10;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model = "소나타";
		System.out.println("모델명: " + car1.model);
		if (!car1.power) {
			car1.power();
		}
		System.out.println("시동: " + car1.power);
		car1.power();
	}

}
