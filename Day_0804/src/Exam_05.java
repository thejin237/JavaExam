class Person {
	String nation = "대한민국";// 국적
	int ssn;// 주민번호
	String name;// 이름
	boolean gender;// 성별(T/F)
	int age;// 나이

	Person() {
	} // default 생성자: 클래스 생성시 자동 생성되지만 오버로딩 사용시 기능이 상실되므로 재생성하여 주는 것이 유리.

	Person(int ssn, String name, boolean gender) {// 생성자 오버로딩
		this.ssn = ssn;
		this.name = name;
		this.gender = gender;
	}

	Person(int ssn, String name, boolean gender, int age) {// 생성자 생성하면 초기 default 생성자 사용 불가하므로 default 생성자를 만들어서 동시 사용
		// ssn = ssn; //메소드 내의 변수 이름이 같으면 멤버변수인지 매개변수인지 구별이 어려움.
		this.ssn = ssn;// this.으로 클래스 내의 멤버변수인지 구분하여 준다.
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void personPrint() {
		System.out.print(nation + "\t" + ssn + "\t" + name + "\t");
		if (gender) {
			System.out.print("남자\t");
		} else {
			System.out.print("여자\t");
		}
		System.out.print(age + "\n");
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Person p1 = new Person();// 객체(인스턴스)생성, 생성자:클래스와 이름이 같은 메소드
		p1.ssn = 1234;
		p1.name = "김사원";
		p1.gender = true;
		p1.age = 28;
		p1.personPrint();
		Person p2 = new Person(4321, "오사원", false, 30);
		p2.personPrint();

	}

}
